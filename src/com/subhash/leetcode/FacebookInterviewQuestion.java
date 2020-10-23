package com.subhash.leetcode;

public class FacebookInterviewQuestion {

    public static void main(String[] args) {
        FacebookInterviewQuestion facebookInterviewQuestion = new FacebookInterviewQuestion();
        int nums [] = {1,2,3,4};
        int[] intsOutput = facebookInterviewQuestion.productExceptSelf(nums);
    }

    public int[] productExceptSelf(int[] nums) {

        int [] leftproduct=new int [nums.length];
        int [] rightproduct = new int [nums.length];

        leftproduct[0]=1;
        rightproduct[nums.length-1]=1;

        for(int i =1; i<nums.length;i++){

            leftproduct[i]=leftproduct[i-1]*nums[i-1];
        }
        for(int i = nums.length-1;i<0;i--){
            rightproduct[i]=rightproduct[nums.length-1]*nums[nums.length-1];
        }

        for(int i =0;i<nums.length;i++){

            nums[i]=leftproduct[i]*rightproduct[i];

        }

return null;

    }

}
