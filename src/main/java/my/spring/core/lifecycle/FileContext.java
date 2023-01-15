package my.spring.core.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileContext {
    private static final Logger log = LoggerFactory.getLogger(FileContext.class);

    public void init() {
        log.info("init()");
    }
    public void destroy() {
        log.info("destroy()");
    }
    public void readFile() {
        log.info("readFile()");
    }
}
