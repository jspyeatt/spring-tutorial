package my.spring.core.javaconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.StringJoiner;

public class Artist {
    private static final Logger log = LoggerFactory.getLogger(Artist.class);
    private String firstName;
    private String lastName;

    public Artist(String firstName, String lastName) {
        log.info("Constructing {} {}", firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Artist.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .toString();
    }
}
