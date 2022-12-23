package my.spring.core.javaconfig.base.autowire.multi.locations;

import java.util.StringJoiner;

public class Artist {
    private Instrument instrument;

    public Artist(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Artist.class.getSimpleName() + "[", "]")
                .add("instrument=" + instrument)
                .toString();
    }
}
