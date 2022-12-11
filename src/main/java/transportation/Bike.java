package transportation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bike implements Vehicle {
    private static final Logger log = LoggerFactory.getLogger(Bike.class);
    @Override
    public void drive() {
        log.info("drive bike");
    }
}
