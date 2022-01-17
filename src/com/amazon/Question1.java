package com.amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given an array of distinct elements and a number x,
// find if there is a pair with product equal to x.
public class Question1 {

    public static void main(String[] args) {
        int [] inputArr = {1,2,3,4,5,6};
        int inputNumber = 12;

        pairFinder(inputArr,inputNumber);
        pairFinder2(inputArr,inputNumber);

    }


    private static void pairFinder(int [] inputArray, int inputValue){
        Map<Integer, Integer> pairFinder = new HashMap<>();
        Map<Integer, Integer>outputMap = new HashMap<>();
        System.out.println("--------Pair 1 method START-------");
        for(int i =0;i<inputArray.length;i++){

            if(pairFinder.containsKey(inputArray[i])){
                outputMap.put(inputValue/inputArray[i],inputArray[i]);
            }else{
                pairFinder.put(inputValue/inputArray[i],i);
            }
        }
        outputMap.forEach((k,v)-> System.out.println("Key: " + k +", Value: "+v));
        System.out.println("--------Pair 1 method END-------");
        System.out.println("\n");
    }



    private static void pairFinder2(int [] inputArr, int inputVal){
        System.out.println("--------Pair 2 method START-------");
        HashSet<Integer> pairSet = new HashSet<>();

        boolean found = false;
        for(int i:inputArr){

            if(pairSet.contains(i)){
                 found=true;
                System.out.println("Pair is " + i + ", "+ inputVal/i);
            }else{
                pairSet.add(inputVal/i);
            }
        }
        if(!found){
            System.out.println("No pair exists");
        }
        System.out.println("--------Pair 2 method END-------");
    }
}
