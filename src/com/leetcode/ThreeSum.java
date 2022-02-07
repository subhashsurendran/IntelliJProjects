package com.leetcode;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        if (lists != null) {
            for (int i = 0; i < lists.size(); i++) {
                System.out.println("[");
                for (int j = 0; i < lists.get(i).size(); i++) {

                    System.out.print(lists.get(i).get(j));
                    System.out.println(",");

                }
                System.out.println("]");

            }
        } else {
            System.out.println("Lists is null");
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int k = 0;

        if (nums.length < 3) {
            return null;
        }
        List<List<Integer>> returnList = new ArrayList<>();

        int firstNum = nums[0];
        int secondNum = nums[1];
        int thirdNum = nums[2];

        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer, Integer> pairFinder = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {

                if (pairFinder.containsKey(nums[j])) {
                    ArrayList x = new ArrayList<>();
                    x.add(nums[i]);
                    x.add(nums[j]);
                    x.add(pairFinder.get(nums[j]));
                    returnList.add(x);
                } else {
                    pairFinder.put(-nums[i] - nums[j], 1);
                }

            }
        }
        return returnList;
    }


    public List<List<Integer>> threeSumLeetcode(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res);
    }
}
