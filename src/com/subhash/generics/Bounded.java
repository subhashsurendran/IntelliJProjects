package com.subhash.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Demonstration3 {
    public static void main( String args[] ) {
        NumberCollectionBounded<Long> myDoubleList = new NumberCollectionBounded<>();

        myDoubleList.add(54L);
        myDoubleList.add(41L);
        myDoubleList.printGreater(40L);
        List<String> xxx = Arrays.asList("Subhash", "Surendran");
        Collections.unmodifiableList(xxx);
        Collections.synchronizedList(xxx);
        Collections.singletonList(xxx);
       }

}

class NumberCollectionBounded<T extends Number> {

    List<T> list = new ArrayList<>();

    // Print if the integer portion is greater
    public void printGreater(T other) {
        for (T item : list) {
            if (item.intValue() > other.intValue())
                System.out.println(item);
        }
    }

    public void add(T item) {
        list.add(item);
    }
}
