package com.subhash.codinggame;

import java.math.BigInteger;
import java.util.Scanner;

public class AsciiFinder {


}
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        // Write an answer using Sys90 98 105 67 69 75tem.out.println()
        // To debug: System.err.println("Debug messages...");

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<str.toCharArray().length;i++){


            if(" ".equals(str.toCharArray()[i])){
                int x = Integer.valueOf(sb.toString());
                System.out.println(sb.toString());
                System.out.println(x);
                IntToCharExample1(x);
                sb = null;

            }else{
                sb.append(str.toCharArray()[i]);
            }
            if(i==str.toCharArray().length){
                int x = Integer.valueOf(sb.toString());
                System.out.println(sb.toString());
                System.out.println(x);
                IntToCharExample1(x);
            }

        }

        if(sb!=null){
            int x = Integer.valueOf(sb.toString());
            System.out.println(sb.toString());
            System.out.println(x);
            IntToCharExample1(x);
        }

    }

    public static void IntToCharExample1(int a){
            char c=(char)a;
            System.out.print(c);
        }

}