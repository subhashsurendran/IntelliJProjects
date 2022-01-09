package com.subhash.Threads;

public class ClassSecond implements Runnable{

    private AThread athread;

    ClassSecond(AThread athread){
        this.athread=athread;

    }

    public static void main(String[] args) {

        AThread athread = new AThread();
        Thread t1 = new Thread(new ClassSecond(athread), "T1Thread");
        Thread t2 = new Thread(new ClassSecond(athread), "T2Thread");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        try {
            athread.method(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}


class AThread {
    volatile int i;
    synchronized void method(int i) throws InterruptedException {

        if (i != 0){

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
        }
        else {
            i = 10;
            System.out.println(Thread.currentThread().getName() + ": " + i);
            notify();
        }
    }
}
