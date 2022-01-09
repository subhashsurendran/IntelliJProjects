package com.subhash.generics;

import java.util.Arrays;
import java.util.Collections;

public class VariableArray {
    public static void main( String args[] ) {
        String[] array = someMethod("I love ", "Educative!");
       int [] x = {1,2,3,4,5};
        int[][] ints = someMethod(x);

      for(int[] insingle : ints){
          System.out.println("Size is "+insingle.length);
          for(int i =0;i<insingle.length;i++) {
              System.out.println(insingle[i]);
          }
      }
        for(String str : array)
            System.out.print(str);
    }

    @SuppressWarnings("unchecked")
    static <T> T[] someMethod(T... args) {
        return args;
    }

}