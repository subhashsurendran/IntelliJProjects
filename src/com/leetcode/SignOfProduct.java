package com.leetcode;
/*
There is a function signFunc(x) that returns:
     1 if x is positive.
     -1 if x is negative.
     0 if x is equal to 0.
     You are given an integer array nums.
     Let product be the product of all values in the array nums.
*/


import java.math.BigInteger;
import java.util.Arrays;

public class SignOfProduct

{
    public static void main(String[] args) {

    }

    public int arraySign(int[] nums) {
        int sum =1;

        for(int num:nums){
            if(num<0){
                sum*=-1;
            }else if(num==0){
                return 0;
            }else{
                sum=1;
            }
        }
        return signFunc(sum);
    }

    public int signFunc(int product){
        int retVal=-1;
        if(product>0){
            retVal=1;
        }else if(product==0){
            retVal=0;
        }
        return retVal;
    }
}
