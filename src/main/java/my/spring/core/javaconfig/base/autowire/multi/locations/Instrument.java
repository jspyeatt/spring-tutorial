package my.spring.core.javaconfig.base.autowire.multi.locations;

import java.util.StringJoiner;

public class Instrument {
    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Instrument.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
