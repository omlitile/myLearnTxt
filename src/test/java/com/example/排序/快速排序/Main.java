package com.example.排序.快速排序;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,11,4,5,10,8,22,54,14,44,65,25,51,53,58,41};
        sort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int left,int right,int[] arr){
        if(left < right){
            int index = part(left,right,arr);
            sort(left,index,arr);
            sort(index+1,right,arr);
        }
    }

    public static int part(int left,int right,int[] arr){
        int base = arr[left];
        while(left < right){
            while(left < right && arr[right] > base){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= base){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = base;
        return left;
    }

}
