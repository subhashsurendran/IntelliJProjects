package com.subhash.leetcode;

import java.util.*;

public class NumSalutes {

    public static void main(String[] args) {

        System.out.println(num_salutes("--<-->--"));
    }

    public static int num_salutes(String hallway) {
        if(hallway==null || hallway.length()==0){
            return 0;
        }

        int numSalutes =0;
        char [] inputCharArr = hallway.toCharArray();
        for(int i =0;i<inputCharArr.length;i++){

            if(inputCharArr[i] =='>'){
                numSalutes+=countSalutes(hallway.substring(i,hallway.length()), '<');

            }else if(inputCharArr[i]=='<'){
                numSalutes+=countSalutesReverse(hallway.substring(0,i), '>');
            }

        }

        return numSalutes;

    }

    private static int countSalutes(String stri, char c) {
        int count=0;
        char [] charArr=stri.toCharArray();
        for(int m =0; m< charArr.length; m++){
            if(c==charArr[m]){
                count++;
            }
        }

        return count;
    }

    private static int countSalutesReverse(String inputStr, char c) {

        int count =0;
        char [] inputCharArr=inputStr.toCharArray();
        for(int m = inputCharArr.length-1; m>=0;m--){
            if(c==inputCharArr[m]){
                count++;
            }
        }

        return count;
    }



}
