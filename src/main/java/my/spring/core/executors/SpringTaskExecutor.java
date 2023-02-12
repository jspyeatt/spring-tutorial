package my.spring.core.executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;

public class SpringTaskExecutor {
    private static final Logger log = LoggerFactory.getLogger(SpringTaskExecutor.class);
    @Autowired
    private SimpleAsyncTaskExecutor simpleAsyncTaskExecutor;
    @Autowired
    private SyncTaskExecutor syncTaskExecutor;
    @Autowired
    private TaskExecutorAdapter taskExecutorAdapter;

    public void doExecute(Runnable task) {
        log.info("doExecute()");
        taskExecutorAdapter.execute(task);
    }

}
