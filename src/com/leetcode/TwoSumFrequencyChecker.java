package com.leetcode;

public class TwoSumFrequencyChecker {

    public static void main(String[] args) {
        int input[] = {3,2,1,5,4};
        int k =2;
        System.out.println(countKDifference(input,k));
    }


    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        int[] freq = new int[101];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - k >= 0) count += freq[nums[i] - k];
            if (nums[i] + k < 101) count += freq[nums[i] + k];
            freq[nums[i]]++;
        }
        return count;
    }
}
