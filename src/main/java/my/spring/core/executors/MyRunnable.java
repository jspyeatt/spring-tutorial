package my.spring.core.executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(MyRunnable.class);
    private final int count;
    private final int sleepMs;

    public MyRunnable(int count, int sleepMs) {
        this.count = count;
        this.sleepMs = sleepMs;
    }

    @Override
    public void run() {
        log.info("run()");
        for (int i = 0; i < count; i++) {
            log.info("count {}", i);
            try {
                TimeUnit.MILLISECONDS.sleep(sleepMs);
            } catch (InterruptedException e) {
                // no opt
            }
        }
    }
}
