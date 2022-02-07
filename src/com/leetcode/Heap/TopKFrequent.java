package com.leetcode.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TopKFrequent {

    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3};
        int k =2;
        System.out.println(Arrays.toString(topKFrequent2(nums,k)));
    }

    public static int[] topKFrequent2(int[] nums, int k) {

        if(k==nums.length){
            return nums;
        }

        HashMap<Integer, Integer> countChecker =new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(countChecker.containsKey(nums[i])){
                countChecker.put(nums[i],countChecker.get(nums[i])+1);
            }else{
                countChecker.put(nums[i],1);
            }
        }
        ArrayList<Integer> returnList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: countChecker.entrySet()){
            if(entry.getValue()>=k){
                returnList.add(entry.getKey());

            }
        }
        int returnArr[]=new int[returnList.size()];

        for(int i =0;i<returnList.size();i++){
            returnArr[i]=returnList.get(i);
        }
        return returnArr;
    }
}