package com.example.crud_oct.Service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LifecycleWorkerService {

    @Async("lifecycleExecutor")
    public void executeLongTask(int taskId) {
        String threadName = Thread.currentThread().getName();
        System.out.println("▶️ [" + threadName + "] Started processing Task #" + taskId);

        try {
            // Keep the thread busy for 5 seconds to simulate heavy work
            Thread.sleep(5000);
            System.out.println("✅ [" + threadName + "] Completed Task #" + taskId);
        } catch (InterruptedException e) {
            System.err.println("❌ [" + threadName + "] Task #" + taskId + " was interrupted!");
        }
    }
}