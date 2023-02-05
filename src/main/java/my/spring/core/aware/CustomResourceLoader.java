package my.spring.core.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.nio.file.Files;

public class CustomResourceLoader implements ResourceLoaderAware {
    private static final Logger log = LoggerFactory.getLogger(CustomResourceLoader.class);
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        log.info("setResourceLoader()");
        Resource simpleTextFile = resourceLoader.getResource("simple.txt");
        try {
            String data = Files.readString(simpleTextFile.getFile().toPath());
            log.info(data);
        } catch (IOException e) {
            log.error("Unable to read simple.txt {}", e.getMessage());
        }
    }
}
