package my.spring.core.javaconfig.base.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Initialization initialization = applicationContext.getBean((Initialization.class));
        initialization.print();
    }
}
