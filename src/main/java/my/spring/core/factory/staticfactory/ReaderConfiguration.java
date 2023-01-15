package my.spring.core.factory.staticfactory;

import my.spring.core.factory.Reader;
import my.spring.core.factory.ReaderType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReaderConfiguration {
    @Bean
    public Reader fileReader() {
        return ReaderFactory.getReader(ReaderType.FILE);
    }
    @Bean
    public Reader socketReader() {
        return ReaderFactory.getReader(ReaderType.SOCKET);
    }
    @Bean
    public Reader dbReader() {
        return ReaderFactory.getReader(ReaderType.DB);
    }
}
