package my.spring.core.autowire.byname;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.StringJoiner;

public class Person {
    private static final Logger log = LoggerFactory.getLogger(Person.class);
    private String name;
    private Address address;

    public Person() {

    }
    public Person(String n, Address a) {
        name = n;
        address = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        log.info("setAddress({})", address);
        this.address = address;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("address=" + address)
                .toString();
    }
}
