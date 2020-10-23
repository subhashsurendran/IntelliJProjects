package com.subhash.leetcode;

import java.util.*;

public class TargetSumIndices {

    public static void main(String[] args) {
        TargetSumIndices targetSumIndices = new TargetSumIndices();

        int nums[] = {3,3};
        int target1 = 6;
        System.out.println(Arrays.toString(targetSumIndices.targetSumIndices(nums, target1)));
    }


    public int [] targetSumIndices(int [] nums, int target){

        Map<Integer, Integer> potentialtarget = new HashMap<>();
        for(int i =0; i<nums.length; i++){

            if(potentialtarget.containsKey(nums[i])){

                return new int[]{potentialtarget.get(nums[i]), i};
            }else{
                potentialtarget.put(target-nums[i], i);

            }

        }

        return null;
    }

}
