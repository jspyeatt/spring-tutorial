package my.spring.core.lifecycle.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // before we even try to create the action bean, the PrintBeanNameBeanPostProcessor class is initiated
        // and the before and after initialization methods are called.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

    }
}
