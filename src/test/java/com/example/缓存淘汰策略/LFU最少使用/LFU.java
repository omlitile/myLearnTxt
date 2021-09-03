package com.example.缓存淘汰策略.LFU最少使用;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LFU {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        for (int i=0;i<100;i++){
            String temp = String.valueOf(Math.random()*10+1);
            if(map.size() < 50){
                if(map.get(temp) == null){
                    map.put(temp,1);
                }else{
                    map.put(temp,map.get(temp)+1);
                }
            }else{
                //淘汰掉最少使用的
                Map<String,Integer> sortMap = new LinkedHashMap<>();
                map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(b->sortMap.put(b.getKey(),b.getValue()));
                sortMap.

            }




        }


    }
}
