package com.subhash.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionBubble {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                }
                swap(a[j], a[j + 1]);
            }
        }
        int swapCount = 0;
        System.out.println("Array is sorted in " + swapCount + "swaps");
        System.out.println("First Element:" + a[0]);
        System.out.println("Last Element:" + a[a.length - 1]);
    }

    private static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

    }

}


