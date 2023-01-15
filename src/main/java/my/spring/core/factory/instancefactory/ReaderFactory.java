package my.spring.core.factory.instancefactory;

import my.spring.core.factory.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ReaderFactory {
    private static final Logger log = LoggerFactory.getLogger(ReaderFactory.class);
    private static final Map<ReaderType, Reader> readers =
            Map.of(ReaderType.FILE, new FileReader(),
                    ReaderType.SOCKET, new SocketReader(),
                    ReaderType.DB, new DBReader());

    public Reader createReader(ReaderType type) {
        log.info("createReader({})", type);
        if (readers.containsKey(type)) {
            return readers.get(type);
        }
        throw new IllegalArgumentException("Invalid reader type: " + type);
    }
}
