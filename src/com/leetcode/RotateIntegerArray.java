package com.leetcode;

import java.util.Arrays;

public class RotateIntegerArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k =3;

        int [] nums2 = {-1,-100,3,99};
        int k2=2;
        System.out.println(Arrays.toString(rotateIntegerArrayInPlace(nums,k)));
        System.out.println(Arrays.toString(rotateIntegerArrayInPlace(nums2,k2)));
    }

    public static int [] rotateIntegerArray(int [] inputArr, int k){

        int length = inputArr.length;
        if(length==1 || length==0 || inputArr==null || k ==1 || k == length){
            return inputArr;
        }
        int [] outputArray = new int[inputArr.length];

        for(int i=0;i<=length;i++){
            int index = i+k;
            if(index>length){
                index=index-length;
            }
            outputArray[index]=inputArr[i];

        }

        return outputArray;
    }



    public static int [] rotateIntegerArrayInPlace(int [] inputArr, int k){

        int length = inputArr.length;
        if(length==1 || length==0 || inputArr==null  || k == length){
            return inputArr;
        }
        k =k%length;

        reverse(inputArr,0,length-1);
        reverse(inputArr,0,k-1);
        reverse(inputArr,k,length-1);

        return inputArr;
    }


    public static void reverse(int [] input, int left, int right){

        while(left<right){
            int temp = input[left];
            input[left]=input[right];
            input[right]=temp;
            left++;
            right--;
        }
    }
}
