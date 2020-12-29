package com.subhash.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class LonelyInteger {

    public static void main(String[] args) {

        int[] a = {1,2,2,1,4,4,5};

        int [] b = {7,6,6,7,2};

        System.out.println( lonelyInteger(a));
        System.out.println(loneyIntegerXOR(b));
    }

    public static int lonelyInteger(int arr[]){
        int size = arr.length;
        Map<Integer, Integer> uniqueness = new HashMap<>();
        for (int i =0; i < size; i++){
            if(uniqueness.containsKey(arr[i])){
                uniqueness.put(arr[i],uniqueness.get(arr[i])+1);
            }else {
                uniqueness.put(arr[i], 1);
            }
        }
        int uniq=0;
        List<Map.Entry<Integer, Integer>> collect = uniqueness.entrySet().stream().filter(e -> e.getValue() == 1).collect(Collectors.toList());
        System.out.println("Heehaw " + collect.get(0));
        for (Map.Entry<Integer, Integer> entry : uniqueness.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if (v == 1) {
                return k;
            }
        }

        return 0;
    }


    public static int loneyIntegerXOR(int [] arr){
        int result =0;

        for (int i : arr ){

            result = result ^ i;
        }
        return result;

    }
}
