package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target =9;
        //System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15},9)));
        System.out.println(" TWO SUM VALUES" +Arrays.toString(twoSumValues(nums, target)));
    }

    private static int[] twoSumValues(int[] nums, int target) {

        HashMap<Integer, Integer> xyz = new HashMap<>();

        for(int i =0;i<nums.length;i++){

            if(xyz.containsKey(nums[i])){
                return new int[]{xyz.get(nums[i]),nums[i],};
            }else{
                xyz.put(target-nums[i], nums[i]);
            }
        }
        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        TreeSet<Integer>x = new TreeSet<>();
        Iterator<Integer> iterator = x.iterator();
        if(iterator.hasNext()){

        }
        HashMap<Integer,Integer> indexFinder = new HashMap<>();
        int [] output = new int[2];
        for(int i =0;i<nums.length;i++){

            if(indexFinder.containsKey(nums[i])){

                output[0]=indexFinder.get(nums[i]);
                output[1]=i;
                return output;
            }else{
                indexFinder.put(target-nums[i],i);
            }

        }
        return output;

    }
}
