package my.spring.core.profile;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Note: In this implementation we DON'T set the configuration class as part of the first
        // argumnet to the AnnotationConfigApplicationContext() constructor. I'm reall not certain
        // why. But if you put it in there, it doesn't work.

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // Note you can set the active profile at Runtime with a -Dspring.profiles.active=dev|test
        context.getEnvironment().setActiveProfiles("prod");
        context.getEnvironment().setDefaultProfiles("dev"); // if active profile isn't set, it uses this one.
        context.scan("my.spring.core.profile");
        context.refresh();
        DatabaseConfigurationHandler handler = context.getBean("databaseConfigurationHandler", DatabaseConfigurationHandler.class);
        handler.print();
    }
}
