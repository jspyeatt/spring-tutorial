package my.spring.core.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Album implements ApplicationContextAware {
    private static final Logger log = LoggerFactory.getLogger(Album.class);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("{} {}", applicationContext.getDisplayName(), applicationContext.getId());
    }
}
