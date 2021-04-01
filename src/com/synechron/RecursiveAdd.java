package com.synechron;

import java.io.Console;

public class RecursiveAdd {

    static final int N =10;
   // static int n=1;
    public static void main(String[] args) {
        func1(1);
    }

    static void func1(int n){
        if(n<=N){
            System.out.println(n);
            //n++;
            func1(n+1);
        }else{
            System.exit(0);
        }
    }


    static void printNumDown(int num){

        if(num<10){
            System.out.println(num);
        }
        else{
            printNumDown(num+1);
        }
    }
}
