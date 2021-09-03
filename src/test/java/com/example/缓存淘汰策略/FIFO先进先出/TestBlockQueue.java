package com.example.缓存淘汰策略.FIFO先进先出;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 使用阻塞队列，实现生产-消费者模式
 *
 *     篮子：容量为5，用来装苹果
 *     生产者：不断往篮子里放苹果
 *     消费者：不断往篮子里取苹果
 *
 * 这个生产消费则模式，我是从网上一篇文章看来的，但是，经过测试，发现并不严谨，主要的原因是，
 * blockQueue其实并不是一个线程安全的类，他的take方法，put方法没有锁，所以还是会出现一些意想不到的情况。
 *
 */
public class TestBlockQueue {

    static Basket basket = new Basket();
    public static void main(String[] args) {

        new Thread(() -> {
            while(true){
                try {
                    basket.product();
                    System.out.println("生产者=====》当前苹果数量：" + basket.getSize());
                    //生产者，每秒生产一个苹果
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        new Thread(() -> {
            while(true){
                try {
                    basket.consume();
                    System.out.println("消费者=====》当前苹果数量：" + basket.getSize());
                    //消费者，每2秒取走一个苹果
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }

    public static   class Basket{
        volatile BlockingQueue<String> basket = new ArrayBlockingQueue<>(5);

        public  void product() throws InterruptedException {
            basket.put("apple");
        }

        public  String consume() throws InterruptedException {
            String apple = basket.take();
            return apple;
        }
        public int getSize(){
            return basket.size();
        }

    }


}


