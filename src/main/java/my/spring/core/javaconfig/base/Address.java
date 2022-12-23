package my.spring.core.javaconfig.base;

import java.util.StringJoiner;

public class Address {
    private String street;
    private String city;

    public Address(String s, String c) {
        street = s;
        city = c;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("street='" + street + "'")
                .add("city='" + city + "'")
                .toString();
    }
}
