package my.spring.core.xmlconfig.constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.StringJoiner;

public class Address {
    private static final Logger log = LoggerFactory.getLogger(Address.class);
    private final String street;
    private final String city;

    public Address(String street, String city) {
        log.info("Constructing address {} {}", street, city);
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("street='" + street + "'")
                .add("city='" + city + "'")
                .toString();
    }
}
