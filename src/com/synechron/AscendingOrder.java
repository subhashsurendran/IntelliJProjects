package com.synechron;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class AscendingOrder {

    public static void main(String[] args) {

        PriorityQueue<Integer> x = new PriorityQueue<>();
        List<Integer> integers = Arrays.asList(-12, 9, 8, 6, -22, -23, -56, 2);
        //integers.stream().sorted().forEach(x ->System.out.printf("%s ", x));

        int [] inputArr = {0,1,2,4,5,7};
        int [] arr = {0,1,2,0,0,0,1,2,2,2,0,2};
        Arrays.sort(arr);
        System.out.println("Printed & Sorted " + Arrays.toString(arr));

        for(int i =0;i<inputArr.length;i++){

            if(i==inputArr[i]){
                continue;
            }else{
                System.out.println(i);
                break;
            }

        }

        String input = "d5e3427ba5s8s91n30n611";
        System.out.println("Printing missing digits of " + input);
        boolean [] indicator = new boolean[10];
        for(int i =0;i<input.length();i++){
            if(isDigit(input.charAt(i))){
                int digit = input.charAt(i)-'0';
                indicator[digit]=true;
            }
        }
        int counter =0;
        for(int i =0;i<indicator.length;i++){
            if(indicator[i]==false){
                counter++;
                System.out.println(i);
            }
        }
        if(counter ==0){
            System.out.println("No digits available");
        }


    }

    private static boolean isDigit(char charAt) {
        if(charAt>='0'&& charAt<='9'){
            return true;
        }
        return false;
    }
}
