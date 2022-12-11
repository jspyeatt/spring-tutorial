package my.spring.core.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-collections.xml");
        CollectionHolder ch = context.getBean("myCollection", CollectionHolder.class);
        log.info("Final ch {}", ch);
    }
}
