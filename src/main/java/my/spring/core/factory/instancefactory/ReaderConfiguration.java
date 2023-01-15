package my.spring.core.factory.instancefactory;

import my.spring.core.factory.Reader;
import my.spring.core.factory.ReaderType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReaderConfiguration {

    @Bean
    public ReaderFactory readerFactory() {
        return new ReaderFactory();
    }

    @Bean
    public Reader fileReader() {
        return readerFactory().createReader(ReaderType.FILE);
    }
    @Bean
    public Reader socketReader() {
        return readerFactory().createReader(ReaderType.SOCKET);
    }
    @Bean
    public Reader dbReader() {
        return readerFactory().createReader(ReaderType.DB);
    }
}
