package com.example.排序.快速排序;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args){
        int[] arr = {6,1,2,7,9,11,4,5,10,8,22,54,14,44,65,25,51,53,58,41};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr,int left ,int right){
        if(left < right){
            int index = partition(arr,left,right);
            sort(arr,left,index);
            sort(arr,index+1,right);
        }
    }

    public static int partition(int[] arr,int left,int right){
        int base = arr[left];
        while(left < right){
            while (left < right && arr[right] >base){
                right--;
            }
            arr[left]  = arr[right];
            while(left < right && arr[left] <= base){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = base;
        return left;
    }

}
