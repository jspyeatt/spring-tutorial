package my.spring.core.xmlconfig.constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This example uses an xml context file to define the beans as constructors
 */
public class PersonMain {
    private static final Logger log = LoggerFactory.getLogger(PersonMain.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
        Person p1 = context.getBean("person", Person.class);
        log.info("{}", p1);
        Person p2 = context.getBean("person2", Person.class);
        log.info("{}", p2);
        Person p3 = context.getBean("person3", Person.class);
        log.info("{}", p3);
    }
}
