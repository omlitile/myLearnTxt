package com.example.排序.希尔排序;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Main m = new Main();
    int[] a = {51,41,8,21,26,23,15,64};
        System.out.println(Arrays.toString(m.sort(a)));
    }

    private int[] sort(int[] arr){
        //增量是i
        for(int i=arr.length/2;i>0;i /= 2){
            for(int j=i;j<arr.length;j++){
                for(int k=j; k>0 && k-i >= 0; k -=i){
                    if(arr[k] < arr[k-i]){
                        int temp = arr[k];
                        arr[k] = arr[k-i];
                        arr[k-i] = temp;
                    }
                }
            }
        }
        return arr;
    }

}
