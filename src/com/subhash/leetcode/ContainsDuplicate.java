package com.subhash.leetcode;

import javax.sound.midi.SoundbankResource;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int [] x = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate.containsDuplicate(x));

    }

    public boolean containsDuplicate(int [] nums){
        boolean retVal = false;
        Set<Integer> dups = new HashSet<>();
        int i =0;
        while(i<nums.length){
            if(dups.contains(nums[i])){
                retVal=true;
                break;
            }
            dups.add(nums[i]);
            i++;
        }

        return retVal;
    }
}
