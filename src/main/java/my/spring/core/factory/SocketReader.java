package my.spring.core.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocketReader implements Reader {
    private static final Logger log = LoggerFactory.getLogger(SocketReader.class);
    public void read() {
        log.info("read()");
    }
}
