package my.spring.core.autowire.bytype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.StringJoiner;

public class Address {
    private static final Logger log = LoggerFactory.getLogger(Address.class);
    private String street;
    private String city;

    public Address(String s, String c) {
        log.info("constructing address {} {}", s, c);
        street = s;
        city = c;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        log.info("setStreet({})", street);
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        log.info("setCity({})", city);
        this.city = city;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("street='" + street + "'")
                .add("city='" + city + "'")
                .toString();
    }
}
