package com.example.排序.冒泡排序;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {21,13,52,11,8,46,25};
        Main m  = new Main();
        System.out.println(Arrays.toString(m.sort(arr)));
    }


    private int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
