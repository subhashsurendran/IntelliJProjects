package com.subhash.Threads;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingQueueProducerConsumerProblem {



    public static void main(String[] args) {

        BlockingQueue<Integer> linkedBlocking = new LinkedBlockingDeque<>();
        producer p1 = new producer(linkedBlocking);
        consumer c1 = new consumer(linkedBlocking);

        Thread producerThread = new Thread(p1);
        Thread consumerThread = new Thread(c1);

        producerThread.start();
        consumerThread.start();
    }




}

class producer implements Runnable{

    BlockingQueue<Integer> blockingQueue;

    public producer(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {

        for(int i =0;i<4;i++){
            try{
                blockingQueue.put(i);
                System.out.println("Put " + i);

            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

class consumer implements Runnable {
    BlockingQueue<Integer> blockingQueue;
    int limit=0;

    public consumer(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {
        while (limit != 4) {
            try {
                limit = blockingQueue.take();
                System.out.println("Consumed " + limit);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
