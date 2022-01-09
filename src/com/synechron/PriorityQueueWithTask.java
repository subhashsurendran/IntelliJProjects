package com.synechron;

import java.util.PriorityQueue;

public class PriorityQueueWithTask {

    private Task [] heap;
    private int heapSize;
    private int capacity;
    PriorityQueue<Integer> x = new PriorityQueue<>();
    public PriorityQueueWithTask(int capacity){
        this.heapSize=0;
        this.capacity=capacity+1;
        heap = new Task[this.capacity];
    }

    public boolean isFull(){
        return this.heapSize==capacity-1;
    }

    public boolean isEmpty(){
        return this.heapSize==0;
    }

    public void insert(String job, int priority){
        Task newJob = new Task(job, priority);


    }
}

class Task{

    String job;
    int priority;

    public Task(String job, int priority){
        this.job = job;
        this.priority=priority;
    }
}
