package com.subhash.nick;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;

public class March3 {

    public static void main(String[] args) {
        March3 march3 = new March3();
        int number = 14;
        int[]nums1={1,2,5,8,9};
        march3.numbersSmallerThanClone(nums1);
        System.out.println(march3.reduceNumberToZero(number));
    }

    private int reduceNumberToZero(int number){
        int counter =0;

        while (number!=0){

        counter++;
        if(number%2==1){
            number=number-1;
        }else {
            number = number / 2;

        }
        }
        return counter;
    }

    private int [] numbersSmallerThan(int []nums){

        int[] freq = new int[101];
        for(int x: nums) {
            ++freq[x];
        }
        for(int i=1; i<101; ++i) {
            freq[i] += freq[i-1];
        }
        for(int i=0; i<nums.length; ++i) {
            nums[i] = nums[i]==0?0:freq[nums[i]-1];
        }
        return nums;
    }



    private int [] numbersSmallerThanClone(int []nums){

        int[]numsClone = nums.clone();
        int [] result = new int [nums.length];
        Arrays.sort(nums);
        HashMap<Integer, Integer>maps = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if(!maps.containsKey(nums[i])){
                maps.put(nums[i],i);
            }

        }

        for(int i =0;i<numsClone.length;i++){

            result[i]=maps.get(numsClone[i]);

        }
        return result;
    }
}
