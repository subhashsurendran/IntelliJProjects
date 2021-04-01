package com.subhash.Threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerLinkedBlockingQueueExample {

    public static void main(String[] args)  {

    BlockingQueue <Integer> blockingQueue = new LinkedBlockingDeque<>();

    ProducerExample producerExample = new ProducerExample(blockingQueue);
    ConsumerExample consumerExample = new ConsumerExample(blockingQueue);

    Thread t1 = new Thread(producerExample);
    Thread t2 = new Thread(consumerExample);

    t1.start();
    t2.start();

    }

}

class ConsumerExample implements  Runnable{
    private BlockingQueue<Integer> blockingQueue;
    int limit =0;

    ConsumerExample(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        while (limit <= 4) {
            try {
                limit = blockingQueue.take();
                System.out.println("Consumed item " + limit);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ProducerExample implements Runnable{
    private BlockingQueue<Integer> blockingQueue;
    int limit =4;
    ProducerExample (BlockingQueue blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {

            try {
                for (int i = 0; i < limit; i++) {
                    blockingQueue.put(i);
                    System.out.println("Added item " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
