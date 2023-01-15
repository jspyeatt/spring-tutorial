package my.spring.core.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileReader implements Reader{
    private static final Logger log = LoggerFactory.getLogger(FileReader.class);
    @Override
    public void read() {
        log.info("read()");
    }
}
