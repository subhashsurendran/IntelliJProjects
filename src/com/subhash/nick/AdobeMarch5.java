package com.subhash.nick;

import java.util.Arrays;
import java.util.Stack;

public class AdobeMarch5 {

    public static void main(String[] args) {
        AdobeMarch5 march = new AdobeMarch5();

        int [] temp ={73, 74, 75, 71, 69, 72, 76, 73};

        int[] ints = march.dailyTemperatures(temp);
        System.out.println(Arrays.toString(ints));
    }

    public int[] dailyTemperatures(int[] T) {

        int[] returnArr = new int[T.length];

        Stack<Integer>stackpeek = new Stack<>();

        for(int i = T.length-1; i >=0; i--){

            while(!stackpeek.isEmpty()&& T[stackpeek.peek()]<=T[i]){
                stackpeek.pop();
            }
            if(stackpeek.isEmpty()){
                returnArr[i]=0;
            }else{

                returnArr[i]=stackpeek.peek()-i;
            }
            stackpeek.push(i);
        }



        return returnArr;

    }

}
