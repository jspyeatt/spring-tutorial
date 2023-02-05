package my.spring.core.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // calls the beanAware methods in the beans created in the awareconfig class before anything else
        // is even referenced.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // create an environment with properties for demonstrating EnvironmentAware
        StandardEnvironment se = new StandardEnvironment();
        MutablePropertySources mps = se.getPropertySources();
        Map<String, Object> map = Map.of("first", "John", "last", "Smith");
        mps.addFirst(new MapPropertySource("custom", map));
        context.setEnvironment(se);
        context.scan("my.spring.core.aware");
        context.refresh();  // it seems that if you have the refresh() call here, you can't define the
                            // Configuration in the constructor of AnnotationConfigApplicationContext().

    }
}
