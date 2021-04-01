package com.subhash.leetcode;

import java.util.*;


public class SumofThreeNumbers {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
      /*  Set<Pair<Integer, Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++){
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] > 0) k--;
                else if(nums[i] + nums[j] + nums[k] < 0) j++;
                else{
                    if(!set.contains(new Pair(nums[i], nums[j]))){
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        set.add(new Pair(nums[i], nums[j]));
                    }
                    j++;
                    k--;
                }
            }
        }*/

        return res;
    }

    public int[] twoSum(int[] nums, int target) {

        if(nums ==null || nums.length ==0){
            return null;
        }
        int returnArr[] = new int [2];

        int remainder =0;
        Map<Integer, Integer> returnMap = new HashMap<>();
        for(int i =0;i<nums.length;i++){

            remainder = target - nums[i];
            if(returnMap.containsKey(remainder)){
                Integer integer =returnMap.get(remainder);
                returnArr[0]=integer;
                returnArr[1]=i;
            }else{
                returnMap.put(nums[i],i);
            }
        }

        return returnArr;
    }

    public int[] twoSumSorted(int[] numbers, int target) {

        if(numbers==null || numbers.length==0){
            return null;
        }
        int [] subArr = new int [2];
        Map<Integer, Integer> returnMap = new HashMap<>();

        for(int i =0;i<numbers.length;i++){

            int remainder = target-numbers[i];
            if(returnMap.containsKey(remainder)){

                Integer integer =returnMap.get(remainder);
                if(integer<i){
                    subArr[0]=integer;
                    subArr[1]=i;

                }else{
                    subArr[1]=integer;
                    subArr[0]=i;
                }
            }else{
                returnMap.put(numbers[i],i);
            }
        }
        return subArr;
    }

}
