package com.subhash.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BitManipulation {

    public static void main(String[] args) {
        //long l = minOperations(8);
        //System.out.println(l);

        String a = "al"+"ice";
        String b ="ali"+"ce";
     //   System.out.println(a==b);

      //  BigInteger x =  BigInteger.valueOf(Integer.MAX_VALUE);
      //  System.out.println(x.bitCount());
      //  System.out.println(x);
      //  Integer y = Integer.MAX_VALUE;
      //  System.out.println(y);
        //System.out.println();


        ArrayList<Integer> numbersList
                = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        Map<Integer, Long> elementCountMap = numbersList.stream()
                //.collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
        .collect(Collectors.toMap(Function.identity(), v->1L, Long::sum));

        System.out.println(Function.identity());
        System.out.println(elementCountMap);
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
