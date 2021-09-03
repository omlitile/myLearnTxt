package com.example.排序.选择排序;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] a = {15,42,13,22,25,84,41};
        System.out.println(Arrays.toString(m.sort(a)));
    }

    private int[] sort(int[] arr){

        for (int i=0;i<arr.length;i++){
            int min = arr[i];
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        return arr;
    }
}
