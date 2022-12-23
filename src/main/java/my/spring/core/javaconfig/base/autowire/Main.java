package my.spring.core.javaconfig.base.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfiguration.class);

        UserService userService1 = applicationContext.getBean("userService1", UserService.class);
        UserService userService2 = applicationContext.getBean("userService2", UserService.class);
        userService1.save();
        userService2.save();
    }
}
