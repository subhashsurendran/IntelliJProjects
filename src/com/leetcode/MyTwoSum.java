package com.leetcode;

import java.util.Arrays;

public class MyTwoSum {

    public static void main(String[] args) {
        MyTwoSum myTwoSum = new MyTwoSum();
        myTwoSum.add(1);
        myTwoSum.add(3);
        myTwoSum.add(5);
        System.out.println(myTwoSum.find(4));
    }

        private int[] data = new int[10];
        private int len = 0;
        private int min = Integer.MAX_VALUE;
        private int max = Integer.MIN_VALUE;

        /** Initialize your data structure here. */

        /** Add the number to an internal data structure.. */
        public void add(int number) {
            if (data.length == len) {
                int[] nextData = new int[(int) (data.length * 1.3)];
                System.arraycopy(data, 0, nextData, 0, len);
                this.data = nextData;
            }

            int i = Arrays.binarySearch(data, 0, len, number);
            if (i < 0) {
                i = Math.abs(i) - 1;
            }
            System.arraycopy(data, i, data, i + 1, len - i);
            data[i] = number;
            len++;

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        /** Find if there exists any pair of numbers which sum is equal to the value. */
        public boolean find(int value) {
            if (len < 2 || value > max * 2 || value < min * 2) return false;
            int lo = 0;
            int hi = len - 1;
            while (lo < hi) {
                if (data[lo] + data[hi] == value) return true;
                else if (data[lo] + data[hi] > value) hi--;
                else lo++;
            }
            return false;
        }
}
