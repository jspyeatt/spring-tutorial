package my.spring.core.factory.staticfactory;

import my.spring.core.factory.*;

public class ReaderFactory {

    public static Reader getReader(ReaderType type) {
        switch (type) {
            case FILE:
                return new FileReader();
            case SOCKET:
                return new SocketReader();
            case DB:
                return new DBReader();
            default:
                throw new IllegalArgumentException("Type not found");
        }
    }
}
