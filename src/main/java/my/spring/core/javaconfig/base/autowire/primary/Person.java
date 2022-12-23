package my.spring.core.javaconfig.base.autowire.primary;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    // As we have it configured, vehicle will get a bike bean because we labeled the bike() method
    // as the primary in VehicleConfiguration. We could override this here by adding @Qualifier("car")
    // here if we want the car.
    @Autowired
    private Vehicle vehicle;
    public void driveVehicle() {
        vehicle.drive();
    }
}
