package com.subhash.generics;

import java.util.*;

class Demonstration2 {
    public static void main(String args[]) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List objList = intList;
        List<String> strList = Arrays.asList("This looks bad");

        Demonstration2.<List<String>>createArray(strList, objList);
        System.out.println("Compiles with warnings.");
    }

    static <T> void createArray(T... args) {
    }
}

