package com.subhash.educative;

import java.util.*;

public class HelloWorld {
    public static void main(String args[]) {
        // create an array of string objs
        String initList[] = { "One", "Two", "Four", "One",};

        String jsonString = "Your JSON string";


        // create one list
        List list = new ArrayList(Arrays.asList(initList));

        System.out.println("List value before: "+list);
        list = Collections.unmodifiableList(list);
        System.out.println("After unmodifiable " + list);
        // create singleton list
        list = Collections.singletonList("OnlyOneElement");
       // list.add("five"); //throws UnsupportedOperationException
        System.out.println("List value after singleton: "+list);
    }
}