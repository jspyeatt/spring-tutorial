package my.spring.core.javaconfig.base.autowire.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(VehicleConfiguration.class);
        Person person = applicationContext.getBean(Person.class);
        person.driveVehicle();
    }
}
