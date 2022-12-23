package my.spring.core.javaconfig.base.autowire.multi.locations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        // one way of inserting multiple configurations is by loading them in the context here.
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(InstrumentConfiguration.class, ArtistConfiguration.class);

        // another way is to just load the context of the ArtistConfiguration here, then in the ArtistConfiguration class
        // add the @Import annotation
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        log.info("artist: {}", applicationContext.getBean(Artist.class));

    }
}
