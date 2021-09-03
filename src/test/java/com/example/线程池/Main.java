package com.example.线程池;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String args[]){
        // 线程
        final  int corePoolSize = 5;
        // 最大线程数
        final  int maximumPoolSize = 10;
        // 空闲存活时间
        final  long keepAliveTime = 0;
        // 存活时间的单位
        final  TimeUnit unit = TimeUnit.SECONDS;
        // 线程数
        final  int threads = 20;
        // 计数器，用于等待子线程执行完毕
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        // 线程池的阻塞队列 LinkedBlockingQueue、SynchronousQueue、ArrayBlockingQueue、LinkedTransferQueue、PriorityBlockingQueue
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize,
                keepAliveTime, unit,
                linkedBlockingQueue);
        for (int i = 0; i < threads; i++) {
            final int finalI = i;
            threadPoolExecutor.execute(() -> {
                try {
                    System.out.println(Thread.currentThread().getName());
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    countDownLatch.countDown();
                }
            });
        }

    }
}
