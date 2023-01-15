package my.spring.core.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FileConfiguration.class);
        FileContext fc = applicationContext.getBean(FileContext.class);
        fc.readFile();
        FileMaker fm = applicationContext.getBean(FileMaker.class);
        applicationContext.close();
    }
}
