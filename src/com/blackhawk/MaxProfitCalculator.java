package com.blackhawk;

import java.util.Arrays;
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

        int [] inputArr = {7, 1, 5, 3, 6, 4};
       // System.out.println(maximizeProfit(inputArr));
        System.out.println(maximizeProfitSlider(inputArr));
        System.out.println(maximizeProfit(inputArr));
        System.out.println(maxProfit(inputArr));
        System.out.println("MaxProfit Hard "+maxProfitHard(inputArr));
        System.out.println(maxProfitKTransactions(2, inputArr));
        System.out.println("Practice Hard "+ maxProfitHardP1(inputArr));
        System.out.println("Practice Hard 2 "+ practiceHard2KTransactions(2, inputArr));

    }

    private static int maximizeProfit(int[] prices) { int n = prices.length;
        int cost = 0;
        int maxCost = 0;

        if (n == 0) {
            return 0;
        }

        // store the first element of array in a variable

        int min_price = prices[0];

        for (int i = 0; i < n; i++) {

            // now compare first element with all the
            // element of array and find the minimum element

            min_price = Math.min(min_price, prices[i]);

            // since min_price is smallest element of the
            // array so subtract with every element of the
            // array and return the maxCost
            cost = prices[i] - min_price;

            maxCost = Math.max(maxCost, cost);
        }
        return maxCost;

    }


    private static int maximizeProfitSlider(int[] arr) {
            int min = arr[0];
            int max=0;
            int cost =0;

            for(int i =0;i<arr.length;i++){

                min = Math.min(arr[i], min);
                cost = arr[i]-min;
                max = Math.max(max, cost);

            }

        return max;

    }

    //Given an array, calculate the maximum profit you can get

    private static int maxProfit(int [] arr){

        int min = arr[0];
        int max = 0;
        int cost =0;

        for(int i =0;i<arr.length;i++){

            min = Math.min(min, arr[i]);
            cost =arr[i]-min;
            max = Math.max(max, cost);

        }

        return max;



    }


    //Hard problem - at most two transactions.
    public static int maxProfitHard(int[] prices) {

        int transaction1Cost = Integer.MAX_VALUE;
        int transaction1Profit=0;

        int transaction2Cost = Integer.MAX_VALUE;
        int transaction2Profit =0;

        //You would buy & sell again, only if it is profitable than your previous //transaction

        for(int i =0;i<prices.length;i++){

            transaction1Cost = Math.min(transaction1Cost, prices[i]);
            transaction1Profit = Math.max(transaction1Profit, prices[i]-transaction1Cost);

            transaction2Cost = Math.min(transaction2Cost, prices[i]-transaction1Profit);
            transaction2Profit = Math.max(transaction2Profit, prices[i]-transaction2Cost);

        }

        return transaction2Profit;


    }

    //Given an integer array, where prices[i] is the price of a given stock.
    // At most K transactions

    public static int maxProfitKTransactions(int k, int [] inputArr){
        int max =0;
        int [] transactions = new int [k];
        int profits[] = new int [k];

        int maxProfit = 0;
        Arrays.fill(transactions, Integer.MAX_VALUE);

        for(int i =0;i<inputArr.length;i++){
            int profit =0;
            for(int j =0;j<k; j++){
                transactions[j]= Math.min(transactions[j], inputArr[i]-profit);
                profits[j] = Math.max(profits[j], inputArr[i]-transactions[j]);
                profit = profits[j];
            }

            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

    private static int maxProfitHardP1(int [] arr){

         int t1Cost =Integer.MAX_VALUE;
         int t2Cost = Integer.MAX_VALUE;
         int t1Profit = 0;
         int t2Profit =0;
         for( int ar: arr){

             t1Cost = Math.min(t1Cost, ar);
             t1Profit = Math.max(t1Profit, ar-t1Cost);
             t2Cost = Math.min(t2Cost, ar-t1Profit);
             t2Profit = Math.max(t2Profit, t2Cost);
         }
                   return t2Profit;
       }

       private static int practiceHard2KTransactions(int k, int[]inputArr){

        int maxProfit =0;

        int [] transactions = new int [k];
        int [] profits = new int [k];

        Arrays.fill(transactions, Integer.MAX_VALUE);

        for(int i =0;i<inputArr.length;i++){

            int profit =0;
            for(int j=0;j<k;j++){

                transactions[j] = Math.min(transactions[j],inputArr[i]-profit);
                profits[j] = Math.max(profits[j], inputArr[i]-transactions[j]);
                profit = Math.max(profit, profits[j]);

            }
            maxProfit  = Math.max(maxProfit,profit);

        }

        return maxProfit;

       }


       private static int practiceKTransactionsMaxProfit(int k, int [] arr){

            int maxp=0;

            int [] transactions = new int[k];
            int [] profits = new int[k];
            Arrays.fill(transactions, Integer.MAX_VALUE);

            for(int i =0;i<arr.length;i++){

                int profit =0;

                for(int j =0;j<k;j++){

                 transactions[j] = Math.min(transactions[j], arr[i]-profit);
                 profits[j] = Math.max(profit, transactions[j]);
                 profit = Math.max(profits[j], profit);
                }
                maxp = Math.max(maxp, profit);

            }

            return maxp;

       }







}
