package com.subhash.algoexpert;

import java.util.*;

public class TwoNumberSum {

    public static void main(String[] args) {
        TwoNumberSum twoNumberSum = new TwoNumberSum();

        int [] input ={3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        long start = System.nanoTime();
        System.out.println(Arrays.toString(twoNumberSum.returnIntArrayFirstSol(input, targetSum)));
        System.out.println(System.nanoTime()-start);
        long start2=System.nanoTime();
        System.out.println(Arrays.toString(twoNumberSum.returnIntArraySecondSolution(input,targetSum)));
        System.out.println(System.nanoTime()-start2);
        long start3=System.nanoTime();
        System.out.println(Arrays.toString(twoNumberSum.returnIntArrayThirdSolution(input,targetSum)));
        System.out.println(System.nanoTime()-start2);
    }

    //First Solution
    private int[] returnIntArrayFirstSol(int[] input, int targetSum){

        long start=System.nanoTime();
        for(int i =0;i<input.length-1;i++){
            for(int j =i+1; j<input.length;j++){

                if(input[i]+input[j]==targetSum){
                    return new int[]{input[i], input[j]};
                }
            }

        }

        return new int[]{};

    }

    //Second Solution
    private int [] returnIntArraySecondSolution(int [] input, int targetSum){

        Set<Integer> matchingArray = new HashSet<>();
        for (int i: input){

            int potentialMatch = targetSum-i;
            if(matchingArray.contains(potentialMatch)){
                return new int [] {potentialMatch, i};
            }else{
                matchingArray.add(i);
            }

        }

        return new int []{};
    }

    //Third Solution
    private int[] returnIntArrayThirdSolution(int[] input, int targetSUm){

        Arrays.sort(input);
        Map<Integer, String> mapOb = new HashMap<>();
        int left = 0;
        int right = input.length-1;
        while(left<right){

            int i = input[left] + input[right];
            if(i ==targetSUm){
                return new int [] {input[left], input [right]};
            }else if(i>targetSUm){
                right --;
            }else if(i<targetSUm){
                left++;
            }

        }

        return new int [] {};
    }
}
