package my.spring.core.javaconfig.base.dependson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Initialization {
    private static Logger log = LoggerFactory.getLogger(Initialization.class);
    public void print() {
        log.info("print()");
    }
}
