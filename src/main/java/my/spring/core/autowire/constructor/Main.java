package my.spring.core.autowire.constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-autowire-constructor.xml");
        Person p1 = context.getBean("person1", Person.class);
        Person p2 = context.getBean("person2", Person.class);
        log.info("Final person {}", p1);
        log.info("Final person {}", p2);
    }
}
