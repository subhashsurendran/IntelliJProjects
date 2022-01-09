package com.leetcode.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLRUCache_Learn extends LinkedHashMap<Integer, Integer> {

    private static int capacity;

    public MyLRUCache_Learn(int capacity){
        super(capacity, 0.75f, true);
        this.capacity=capacity;
    }

    public int get(int key){
        return super.getOrDefault(key,-1);
    }

    public void put(int key, int value){
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
        return size() > capacity;
    }
}
