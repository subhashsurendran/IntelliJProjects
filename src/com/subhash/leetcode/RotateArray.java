package com.subhash.leetcode;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int [] inputArray = {-1,-100,3,99};
        int steps = 2;

    }

    private void rotateArray(int []nums, int k){

        k %=nums.length;
        int previous, temp;
        for(int i =0; i<k; i++){

            previous = nums[nums.length-1];
            for(int j=0;j<nums.length;j++){
                temp = nums[j];
                nums[j]=previous;
                previous = temp;


            }
        }


    }

    private void rotateArray2(int [] nums, int k){
        int []a = new int [nums.length];

        for(int i =0;i< nums.length;i++){
            a[(i+k)%nums.length]= nums[i];
        }
        for(int i =0;i<a.length;i++){
            nums[i]=a[i];
        }

    }
}
