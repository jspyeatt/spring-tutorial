package my.spring.core.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FileMaker {
    private static final Logger log = LoggerFactory.getLogger(FileMaker.class);

    @PostConstruct
    public void init() {
        log.info("init()");
    }
    @PreDestroy
    public void destroy() {
        log.info("destroy()");
    }
}
