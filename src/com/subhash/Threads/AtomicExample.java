package com.subhash.Threads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    private final AtomicInteger counter = new AtomicInteger(0);


    public static void main(String[] args) {
        AtomicExample atomicExample = new AtomicExample();
        atomicExample.increment();

        ArrayList<String> x = new ArrayList<>();
    }

    public void increment() {
        while(true) {
            int existingValue = getValue();
            System.out.println(existingValue);
            int newValue = existingValue + 1;
            System.out.println(newValue);
            if(counter.compareAndSet(existingValue, newValue)) {
                counter.set(newValue);
                System.out.println(true);
                if(newValue == 10){
                    System.out.println("Double True");
                    return;
                }
            }
        }
    }
    public int getValue() {
        return counter.get();
    }

}
