package com.example.排序.插入排序;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] a = {5,14,21,16,14,8,3,26,58,45};
        m.sort(a);
        System.out.println(Arrays.toString(a));
    }

    private void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }

}
