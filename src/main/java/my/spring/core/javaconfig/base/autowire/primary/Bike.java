package my.spring.core.javaconfig.base.autowire.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bike extends Vehicle {
    private static final Logger log = LoggerFactory.getLogger(Bike.class);

    @Override
    public void drive() {
        log.info("drive()");
    }
}
