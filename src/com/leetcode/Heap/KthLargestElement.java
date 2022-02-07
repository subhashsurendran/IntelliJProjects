package com.leetcode.Heap;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        return helper(nums, 0, nums.length - 1, k);
    }

    private int helper(int[] nums, int start, int end, int k) {
        if (start == end) {
            return nums[start];
        }

        int left = start, right = end;
        int pivot = nums[start + (end - start)/2];

        while (left <= right) {
            while (left <= right && nums[left] > pivot) {
                left++;
            }
            while (left <= right && nums[right] < pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }


        if (start + k - 1 <= right) {
            return helper(nums, start, right, k);
        }

        if (start + k - 1 >= left) {
            return helper(nums, left, end, start + k - left);
        }

        return nums[right+1];
    }
}