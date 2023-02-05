package my.spring.core.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import java.util.Locale;

public class Welcome implements MessageSourceAware {
    private static final Logger log = LoggerFactory.getLogger(Welcome.class);
    @Override
    public void setMessageSource(MessageSource messageSource) {
        log.info("getMessageSource(US) {} ", messageSource.getMessage("welc", null, Locale.US));
        log.info("getMessageSource(FR) {} ", messageSource.getMessage("welc", null, Locale.FRANCE));
        log.info("getMessageSource(DE) {} ", messageSource.getMessage("welc", null, Locale.GERMANY));
    }
}
