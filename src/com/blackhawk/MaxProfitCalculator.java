package com.blackhawk;

import java.util.HashSet;
import java.util.Set;

public class MaxProfitCalculator {


    // Problem Statement

    //- The cost of a stock on each day is given in an array,
    // find the max profit that you can make by buying and selling in those days.
    // For example, if the given array is
    // Input Array = {100, 180, 260, 310, 40, 535, 695},
    // One can only buy the stock once and sell it once, we need to maximize the profit.
    public static void main(String[] args) {

        int [] inputArr = {100, 180, 260, 310, 535, 695, 40};
        System.out.println(maximizeProfit(inputArr, inputArr.length, 1));

    }

    private static int maximizeProfit(int[] arr, int n, int k) {
            int maximumProfit =0;

            int minimumVal =arr[0];
            for(int i =0;i<arr.length;i++){

               minimumVal = Math.min(minimumVal, arr[i]);

            }

            for(int i=0;i<arr.length;i++){

               maximumProfit = Math.max(maximumProfit, arr[i]-minimumVal);

            }

            return maximumProfit;

    }
}
