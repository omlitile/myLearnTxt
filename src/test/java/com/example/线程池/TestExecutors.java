package com.example.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestExecutors {
    public static void main(String args[]){
        //Executors类里面提供了一些静态工厂，生成一些常用的线程池。这些方法的返回值是ExecutorService对象，该对象表示一个线程池，
        // 可以执行Runnable对象或者Callable对象代表的线程。


        //①newSingleThreadExecutor
        /**
         * 说明：初始化只有一个线程的线程池，内部使用LinkedBlockingQueue作为阻塞队列。
           特点：相当于单线程串行执行所有任务如果该线程异常结束，会重新创建一个新的线程继续执行任务，唯一的线程可以保证所提交任务的顺序执行
         */
//        ExecutorService oneService = Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 10; i++) {
//            oneSerivce.execute(new MyThread(i));
//        }
//        oneSerivce.shutdown();


        //②newFixedThreadPool
        /**
         * 说明：初始化一个指定线程数的线程池，其中corePoolSize == maxiPoolSize，使用LinkedBlockingQuene作为阻塞队列
         特点：每次提交一个任务就创建一个线程，直到线程达到线程池的最大大小。线程池的大小一旦达到最大值就会保持不变，即使当线程池没有可执行任务时，也不会释放线程。如果某个线程因为执行异常而结束，那么线程池会补充一个新线程。
         */
//        ExecutorService twoService = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 10; i++) {
//            twoService.execute(new MyThread(i));
//        }
//        twoService.shutdown();



        //③newCachedThreadPool
        /**
         *说明：初始化一个可以缓存线程的线程池，此线程池不会对线程池大小做限制，线程池大小完全依赖于操作系统（或者说JVM）能够创建的最大线程大小。线程池的线程数可达到Integer.MAX_VALUE，即2147483647，
         * 内部使用SynchronousQueue作为阻塞队列；
          特点：在没有任务执行时，当线程的空闲时间超过keepAliveTime，默认为60s，会自动释放线程资源；当提交新任务时，如果没有空闲线程，则创建新线程执行任务，会导致一定的系统开销；
          因此，使用时要注意控制并发的任务数，防止因创建大量的线程导致而降低性能。
         */
//        ExecutorService threeService = Executors.newCachedThreadPool();
//        for (int i = 0; i < 10; i++) {
//            threeService.execute(new MyThread(i));
//        }
//        threeService.shutdown();


        //④newScheduledThreadPool
        /**
         * 特定：初始化的线程池可以在指定的时间内周期性的执行所提交的任务，在实际的业务场景中可以使用该线程池定期的同步数据。
         */
        ScheduledExecutorService fourService = Executors.newScheduledThreadPool(5);
        //延迟三秒执行
//        fourService.schedule(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("delay 3 seconds");
//            }
//        }, 3, TimeUnit.SECONDS);
//        fourService.shutdown();

        //延迟1秒后每3秒执行一次。
        fourService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);


        //总结：除了newScheduledThreadPool的内部实现特殊一点之外，其它线程池内部都是基于ThreadPoolExecutor类（Executor的子类）实现的。

    }
}
