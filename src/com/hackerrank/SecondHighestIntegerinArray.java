package com.hackerrank;

public class SecondHighestIntegerinArray {
    public static void main(String[] args) {

        int [] array = {12, 31,35, 1, 10, 1};
        System.out.println(secondHighestInteger(array));
    }

    public static int secondHighestInteger(int [] inputArray){

        int max=Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i =0;i<inputArray.length;i++){

            int tmp=inputArray[i];

            if(max<tmp){
                secondMax=max;
                max=tmp;
            }else if(max>tmp && secondMax<tmp){
                secondMax=tmp;
            }

        }
        return secondMax;
    }
}
