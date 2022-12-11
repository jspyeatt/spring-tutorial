package transportation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Vehicle {
    private static final Logger log = LoggerFactory.getLogger(Car.class);
    @Override
    public void drive() {
        log.info("drive car");
    }
}
