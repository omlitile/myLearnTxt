package com.example.排序.堆排序;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String args[]){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); //小顶堆，默认容量为11
        minHeap.add(77);
        minHeap.add(45);
        minHeap.add(32);
        minHeap.add(99);
        minHeap.add(13);
        minHeap.add(2);
        minHeap.add(17);
        minHeap.add(23);
        minHeap.add(25);
        minHeap.add(21);
        minHeap.add(16);
        minHeap.add(19);
        minHeap.add(42);
        System.out.println(minHeap.peek());
        Object[] arr = minHeap.toArray();
        Arrays.stream(arr).forEach(x -> System.out.print(x));


//        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11,new Comparator<Integer>(){ //大顶堆，容量11
//            @Override
//            public int compare(Integer i1,Integer i2){
//                return i2-i1;
//            }
//        });
    }

}
