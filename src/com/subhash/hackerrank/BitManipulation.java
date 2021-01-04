package com.subhash.hackerrank;

import java.math.BigInteger;
import java.util.Arrays;

public class BitManipulation {

    public static void main(String[] args) {
        long l = minOperations(50000);
        System.out.println(l);
    }


    /*
     * Complete the 'minOperations' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long minOperations(long n) {
        // Write your code here
        System.out.println("First N " + n);
        int bit = n < 0 ? 1 : 0;
        BigInteger result = BigInteger.valueOf(bit);
        for (int i = 0; i < 63; i++) {
            n = n << 1;
            int sign = n < 0 ? 1 : 0;
            bit = (bit + sign) % 2;
            result = result.shiftLeft(1).add(BigInteger.valueOf(bit));
        }
        return result.longValue();

    }

    static void minimumBribes(int[] q) {

        int arrayLength = q.length;

        int [] originalArray = q.clone();
        int bribeCounter =-1;
        for(int i = arrayLength-1;i>=0; i--){

            if(q[i] == originalArray[i]){
                continue;
            }else if(i<arrayLength && (i-1)>0 && (i-2)>0){
                if(q[i-1]==originalArray[i]||q[i-2]==originalArray[i]){
                    bribeCounter++;
                }else{
                    System.out.println("Too chaotic");
                    break;
                }
            }

        }
        if(bribeCounter>=0){
            System.out.println(bribeCounter);
        }
    }
}
