package my.spring.core.events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessageConfiguration.class);

        // put this one in to show application context listener

        context.start();
        context.getBean(MessagePublisher.class).publishMessage();
        Thread.sleep(5000);
        context.stop();
        context.close();
    }
}
