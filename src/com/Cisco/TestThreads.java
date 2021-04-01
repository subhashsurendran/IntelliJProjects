package com.Cisco;

public class TestThreads {

    public static void main(String[] args) {
        Thread t = new MyThread(){

            @Override
            public void run(){
                System.out.println("Hi");
            }
        };
        t.start();
    }
}

class MyThread extends Thread{
    MyThread(){
        System.out.println("My Thread");
    }
    @Override
    public void run(){
        System.out.println("run");
    }

    public void run(String s){
        System.out.println("RUn with parameters");
    }
}
