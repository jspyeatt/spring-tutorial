package my.spring.core.javaconfig.base.dependson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Init {
    private static final Logger log = LoggerFactory.getLogger(Init.class);
    static {
        log.info("static block in {}", Init.class.getSimpleName());
    }
}
