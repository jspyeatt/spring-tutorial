package my.spring.core.xmlconfig.setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This example uses a application context xml file and setters instead of constructors.
 */
public class ArtistMain {
    private static final Logger log = LoggerFactory.getLogger(ArtistMain.class);
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-setter.xml");
        my.spring.core.xmlconfig.setter.Artist artista = context.getBean("artist1", my.spring.core.xmlconfig.setter.Artist.class);
        log.info("{}", artista);
        my.spring.core.xmlconfig.setter.Artist artistb = context.getBean("artist2", my.spring.core.xmlconfig.setter.Artist.class);
        log.info("{}", artistb);

    }
}
