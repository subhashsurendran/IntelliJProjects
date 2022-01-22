package com.leetcode.Heap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class  PriorityQueueHeap  {

    //In java, heap is implemented through
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) throws IOException {

        List<Integer> integers = Arrays.asList(1, 3, 5, 2, 6);
        Collections.sort(integers,Collections.reverseOrder());
        System.out.println(integers.toString());

        InputStream obj = new FileInputStream("/Users/subhashsurendran/Desktop/IntelliJProjects/src/com/leetcode/Heap/PriorityQueueHeap.java");
        System.out.println(obj.available());
    }
}
