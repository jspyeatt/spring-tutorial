package my.spring.core.factory.staticfactory;

import my.spring.core.factory.Reader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfiguration.class);
        context.getBean("fileReader", Reader.class).read();
        context.getBean("socketReader", Reader.class).read();
        context.getBean("dbReader", Reader.class).read();
    }
}
