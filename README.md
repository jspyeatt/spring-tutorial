# Spring Tutorial Notes

## Dependency Resolution Process

* The ApplicationContext is created and initialized with configuration metadata
* For each bean, its dependencies are expressed in the form of properties, constructor
  arguments, or arguments to the static-factory method
* Each property or constructor argument that is a value is converted from its
  specific format to the actual type of that property or constructor argument
* The Spring container validates the configuration of each bean as the container is created.

# Autowiring - Configuring beans automatically

If you are using xml files for configuration you are managing the dependencies between the objects. Autowiring
is a way of letting Spring itself manage the dependencies by inspecting the container.

Autowiring can significantly reduce the need to specify properties or constructor arguments.

Autowiring can update a configuration as objects evolve. For example, a new dependency to a class is added,
that dependency can be satisfied automatically without a need to modify the configuration.

## Autowiring modes

* no - (default) No autowiring. Bean references just be defined by ref elements. Changing the default setting is not
recommended for larger deployments, because specifying collaborators explicitly gives greater control and clarity. To
some extent, it documents the structure of a system.
* byName - Autowiring by property name. Spring looks for a bean with the same name as the property that needs
to be autowired. For example, if a bean definition is set to autowire by name and it contains a `master` property
  (that is, it has a `setMaster()` method), Spring looks for a bean definition named `master` and uses it to set
the property.
* byType - Lets a property be autowired if exactly one bean of hte property type exists in the container.
If more than one exists, a fatal exception is thrown, which indicates that you may not use `byType` autowiring
for that bean. If there are no matching beans, nothing happens (the property is not set)
* constructor - Analogous to bytype but applies to constructor arguments. If there is not exactly one bean of 
the constructor argument type in the container, a fatal error is raised.

## Autowiring drawbacks

* Not supported for primative types
* Less exact that explicit wiring
* Multiple bean definitions within a container may match the type specified by the setting method or
constructor arguments.

# Java-based configuration

You need to create configuration classes with the `@Configuration` annotation. For each configuration class
you need to pass them in when creating the AnnotationConfigApplicationContext object for your application.

Additionally, if you want Spring to be able to inject the values in `@Autowired` instance variables you need
to build the variables as `@Bean`s in the configuration class. If you don't do that, Spring won't find the
appropriate instances. Also note that these beans are created as singletons within the application context.

You can `@Autowired` directly at an instance variable. Or you can Autowired a setter. The preference is to
do it directly at the instance variable level to make thread safety easy. But if you can use the setter
especially if you set the `@Autowired(required=false)`. Then you can initiate the class which has the 
Autowired dependency later. With a setter like this.

```java
public class UserService {
    private UserRepository userRepository;
    
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
```

## Collections

If you have a class that has a collection or array of items in it, `@Autowire` will grab every instance
of the appropriate class and put it in the collection. This seems a bit overzealous. Look at the
ProductViewer class in my.spring.core.javaconfig.base.autowire.collection.

## Bean scope

. singleton - default - scopes a single bean definition to a single object instance for each Spring IoC container
. prototype - scopes a bean definition to any number of object instances
. request - scopes a single bean definition to the lifecycle of a single http request. That is, each http request
has its own instance of a bean created of the back of a single bean definition. Only valid in the context
of a web-aware Spring ApplicationContext
. session - scopes a single bean definition to the lifecycle of an http Session. Only valid in the context of
a web-aware Spring ApplicationContext
. application - scopes a single bean definition to the lifecycle of a ServletContext. Only valid in the context
of a web-aware Spring ApplicationContext
. websocket - Scopes a single bean definition to the lifecycle of a WebSocket. Only valid in the context of a 
web-aware Spring applicationContext.

# Spring Bean Lifecycle

At times, beans need to perform certain initialization before they are ready for use. For example:
open a file, allocate memory, initializing database or network connection.

Beans also need to make certain corresponding destruction tasks are invoked before the beans
are removed from the container.

`initMethod` and `destroyMethod` lifecycle callback methods help us achieve this.

## @PostConstructor and @PreDestroy

Can be used instead of initMethod and destroyMethod. Seems to be a bit better option because the bean
knows what it needs.

## BeanPostProcessor

Allows bea processing before and after the initialization callback.

It processes all beans in the Spring IoC container

Used to validate bean properties, alter bean properties on certain conditions or apply certain tasks
to beans in the container.

Has two methods: `postProcessBeforeInitalization()` and `post ProcessAfterInitialization()`.

If you use a BeanPostProcessor the order of things will be as follows:

. postProcessBeforeInitialization is called
. the bean's constructor is call
. the bean's PostConstructor method is called, if one is defined.
. postProcessAfterInitialization is called.

## Misc

Needed the `implementation ("javax.annotation:javax.annotation-api:1.3.2")` for FileMaker PostConstruct and PreDestroy 
annotations.
