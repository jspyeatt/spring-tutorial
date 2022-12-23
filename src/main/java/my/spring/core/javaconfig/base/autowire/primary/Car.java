package my.spring.core.javaconfig.base.autowire.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car extends Vehicle {
    private static final Logger log = LoggerFactory.getLogger(Car.class);

    @Override
    public void drive() {
        log.info("drive()");
    }
}
