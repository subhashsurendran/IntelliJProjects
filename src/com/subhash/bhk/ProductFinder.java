package com.subhash.bhk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductFinder {

    public static void main(String[] args) {

        //use case would be

        int [] inptArr = {1,2,3};
        int product =6;
        System.out.println(productAvailable(inptArr,product));

    }


    public boolean containsNearbyDuplicatesMap(int [] nums, int k){
        Map<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(nums[i])) {
                int index = res.get(nums[i]);
                if (Math.abs(index - i) <= k) return true;
            }
            res.put(nums[i] ,i);
        }

        return false;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }



    static boolean productAvailable(int arr[], int n){

        boolean productAvlble=false;

        if(arr.length<2){
            return false;
        }
        //n is the target sum
        //Map<Integer, Integer> productComp = new HashMap<>();

        HashSet<Integer> productComp = new HashSet<>();
        for(int i =0;i< arr.length;i++){

            if(arr[i] == 0)
            {
                if(n == 0)
                    return true;
                else
                    continue;
            }

            if(n%arr[i]==0){
               if(productComp.contains(n/arr[i])){
                   return true;
               }
               else{
                   productComp.add(i);
               }
           }

        }

        return productAvlble;

    }
}
