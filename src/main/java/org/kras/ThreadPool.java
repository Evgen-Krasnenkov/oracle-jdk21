package org.kras;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadPool {
    public static void main(String[] args) {
        ThreadFactory factory = Thread.ofVirtual().factory();
        Thread newed = factory.newThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("Virtual thread completed");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        newed.start();
        boolean daemon2 = newed.isDaemon();
        boolean virtual1 = newed.isVirtual();
        try {
            newed.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try (ExecutorService executorService = Executors.newWorkStealingPool();) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                        System.out.println("Task 1 completed");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
            executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "Thank you";
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        var start = Thread.ofVirtual().start(() -> {
            try {
                Thread.sleep(1000);
                Thread thread = Thread.currentThread();
                thread.setPriority(Thread.NORM_PRIORITY);
                boolean daemon = thread.isDaemon();
                thread.setDaemon(false);
                boolean daemon1 = thread.isDaemon();
                boolean virtual = thread.isVirtual();
                System.out.println("Another virtual thread completed");
            } catch (InterruptedException e) {
                Thread thread = Thread.currentThread();
                boolean daemon = thread.isDaemon();
                thread.interrupt();
            }
        });
        try {
            start.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
