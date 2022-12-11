package my.spring.core.javaconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This example uses a configuration class (ArtistConfiguration) to define the objects via constructors.
 *
 * You need the @Configuration declared in the ArtistConfiguration class so the context can scan for the
 * configuration.
 */
public class ArtistMain {
    private static final Logger log = LoggerFactory.getLogger(ArtistMain.class);
    public static void main(String[] args) {

        // defining the app context. Note the use of the AnnotationConfigApplicationContext.
        ApplicationContext context = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        Artist artist = context.getBean("myartist", Artist.class);
        log.info("{}", artist);

        // Can also define it as a BeanFactory instead of ApplicationContext

        BeanFactory factory = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        Artist artist2 = factory.getBean("yourartist", Artist.class);
        log.info("{}", artist2);

        Artist artist3 = factory.getBean("myartist", Artist.class);
        log.info("{}", artist3);
    }
}
