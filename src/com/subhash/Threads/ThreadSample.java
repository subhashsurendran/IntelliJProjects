package com.subhash.Threads;

import java.util.concurrent.CountDownLatch;

class Demonstration {

    public static void main(String args[]) {
        Deadlock deadlock = new Deadlock();
        try {
            deadlock.runTest();
        } catch (InterruptedException ie) {
        }
    }
}

class Deadlock {

    private int counter = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    CountDownLatch latch = new CountDownLatch(2);

    Runnable incrementer = new Runnable() {

        @Override
        public void run() {
            try {
                for (int i = 0; i < 100; i++) {
                    incrementCounter();
                    System.out.println("Incrementing " + i);
                }
            } catch (InterruptedException ie) {
            }
        }
    };

    Runnable decrementer = new Runnable() {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                decrementCounter();
                System.out.println("Decrementing " + i);
            }
        }
    };

    public void runTest() throws InterruptedException {

        Thread thread1 = new Thread(incrementer);
        Thread thread2 = new Thread(decrementer);

        CountDownLatch x = new CountDownLatch(5);

        thread1.start();
        // sleep to make sure thread 1 gets a chance to acquire lock1
        Thread.sleep(100);
        thread2.start();

        System.out.println("Done : " + counter);
    }

    void incrementCounter() throws InterruptedException {
        synchronized (lock1) {
            latch.countDown();
            System.out.println("Acquired lock1");
            latch.await();
            synchronized (lock2) {
                counter++;
            }
        }
    }

    void decrementCounter() {
        synchronized (lock2) {
            System.out.println("Acquired lock2");
            latch.countDown();
            synchronized (lock1) {
                counter--;
            }
        }
    }
}