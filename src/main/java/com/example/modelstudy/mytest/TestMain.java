package com.example.modelstudy.mytest;

import sun.nio.cs.ext.MacArabic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.*;

public class TestMain {
    public static void main(String[] args){
        String SLJS = "44010032A60/已收/20210901153103/农行淘金社保卡中心";
        System.out.println(SLJS != null && !"".equals(SLJS));
        String[] arr = "44010032A60/已收/20210901153103/农行淘金社保卡中心".split("/");

        System.out.println(arr.length);
        String receiveTime = "";
        if(arr.length == 3){
            receiveTime = arr[1];
        }else{
            receiveTime = arr[2];
        }
        System.out.println(receiveTime);
        TestMain main = new TestMain();
        System.out.println(main.formatTime(receiveTime));
//        String arr[] = { "a", "b", "c"};
//        int all = arr.length;
//        int nbit = 1 << all;
//        System.out.println(nbit);
//        for (int i = 0; i < nbit; i++) {
//            StringBuffer sb = new StringBuffer();
//            for (int j = 0; j < all; j++) {
//                if ((i & (1 << j)) != 0) {
//                    sb.append(arr[j]);
//                }
//            }
//            System.out.println(sb);
//        }

//
//        int[] arr1 = new int[]{1,2,3,4,5};
//        int[] arr2 = new int[10];
//        int[] a = Arrays.copyOf(arr1, 3);
//        System.arraycopy(arr1,2,arr2,2,2);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println("02银行IP参数项为空".startsWith("02"));
//        String s = "<ERR>00</ERR><MAX>1</MAX><1>陈金水;440122195403011520;440100_广州市;95599_农业银行;6228230085299434468;1_正常;</1>";
//        String SS = s.replaceAll("\\d+>", "ROW>");
//        System.out.println(SS);
    }

    private String formatTime(String time) {
        if (time != null && time != "") {
            String year = time.substring(0, 4);
            String month = time.substring(4, 6);
            String day = time.substring(6, 8);
            String hour = time.substring(8, 10);
            String minute = time.substring(10, 12);
            String second = time.substring(12, 14);
            return year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second;
        }
        return "";
    }

}
