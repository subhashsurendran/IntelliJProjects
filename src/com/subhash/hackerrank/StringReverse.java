package com.subhash.hackerrank;

import java.util.Locale;
import java.util.Stack;

public class StringReverse {

    public static void main(String[] args) {

        String s = "subhash";
        s = null;
       // System.out.println(s.equals("subhash"));
        System.out.println("subhash".equals(s));
        System.out.println("1st Method");
        reverseStringUsingStack(s);
        System.out.println("2ndMethod");
        reverseUsingStringBuilder(s);
        System.out.println("3rdMethod");
        reverseUsingCharSwap(s);
    }

    private static void reverseStringUsingStack(String input){
        long t = System.nanoTime();
        if(input==null || input.length()==0){
            System.out.println("NULL");

        }else {
            Stack<Character> stackChar = new Stack<>();
            StringBuilder reversedStr = new StringBuilder();
            char[] stringCharArr = input.toCharArray();
            for (int i = 0; i < input.length(); i++) {
                stackChar.push(stringCharArr[i]);
            }
            while (!stackChar.isEmpty()) {
                Character pop = stackChar.pop();
                reversedStr.append(pop);
            }
            System.out.println(reversedStr.toString());
            System.out.println(System.nanoTime() - t);
        }
    }

    private static void reverseUsingCharSwap(String input){
        long t = System.nanoTime();
        if(input==null || input.length()==0){
            System.out.println("NULL");
        }else {
            char[] charArr = input.toCharArray();
            int n = charArr.length;
            for (int i = 0; i < charArr.length / 2; i++) {
                swap(charArr, i, n - i - 1);
            }

            System.out.println(String.valueOf(charArr));
            System.out.println(System.nanoTime() - t);
        }

    }

    static void swap(char a[], int index1, int index2){
        char temp = a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }

    private static void reverseUsingStringBuilder(String input){
        long t = System.nanoTime();
        if(input==null || input.length()==0){
            System.out.println("NULL");
        }else {
            StringBuilder x = new StringBuilder(input);
            System.out.println(x.reverse().toString());
            System.out.println(System.nanoTime() - t);
        }



    }
}
