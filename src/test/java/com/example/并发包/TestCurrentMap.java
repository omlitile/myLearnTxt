package com.example.并发包;

import com.alibaba.fastjson.support.odps.udf.CodecCheck;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TestCurrentMap {
    public static void main(String[] args){
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap();
        map.put("aaa",123);
        map.put("bbb",456);
        map.put("ccc",789);
        System.out.println(map.get("aaa"));

        AtomicInteger a = new AtomicInteger(1);
        System.out.println(a.addAndGet(5));
    }
}
