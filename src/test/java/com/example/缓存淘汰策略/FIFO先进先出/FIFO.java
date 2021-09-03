package com.example.缓存淘汰策略.FIFO先进先出;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<10;i++){
            queue.offer(i);
            //假设超过5的时候，队列就满了，就把之前最早的元素丢弃掉，也就是出队
            if(i >=  5){
                queue.poll() ;
            }
        }

        //遍历队列
        queue.stream().forEach(item->{
            System.out.println(item);
        });


    }
}
