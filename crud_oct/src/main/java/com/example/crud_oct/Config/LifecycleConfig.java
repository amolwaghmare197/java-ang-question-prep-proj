package com.example.crud_oct.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class LifecycleConfig {

    @Bean(name = "lifecycleExecutor")
    public Executor lifecycleExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        executor.setCorePoolSize(2);       // Step 1: Up to 2 tasks run instantly
        executor.setQueueCapacity(3);     // Step 2: Next 3 tasks wait in line
        executor.setMaxPoolSize(4);        // Step 3: Next 1 task triggers emergency thread

        executor.setThreadNamePrefix("DemoPool-");

        // Step 4: Throw an explicit exception when completely full
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());

        executor.initialize();
        return executor;
    }
}