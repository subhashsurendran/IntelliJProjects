package com.subhash.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

      public  static List<String> armstrongNumber(List<Integer> arr) {


          List<String>returnString = new ArrayList<>();
          List<Integer> clone = new ArrayList<>();

          for(Integer i : arr){

              clone.add(new Integer(i));
              int sum = 0;

              while(i>0){

               sum+=Math.pow(i%10, 3);
               i = i/10;
           }
            if(sum == clone.get(0)){
                returnString.add("It is an ARMSTRONG number");
            }else{
                returnString.add("It is NOT an ARMSTRONG number");
            }
            clone.remove(0);
       }
        return returnString;
    }

    public static void main(String[] args) {

          List<Integer> xx = new ArrayList<>();
          xx.add(153);
        List<String> strings = armstrongNumber(xx);
        System.out.println(Arrays.toString(strings.toArray()));
    }
}