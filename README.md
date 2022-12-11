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




