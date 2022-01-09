package com.subhash.nike;

import javax.print.attribute.standard.PagesPerMinute;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class Mpasf {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
       // InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
      //  BufferedReader in = new BufferedReader(reader);
      //  String line;
      //  while ((line = in.readLine()) != null) {
            //System.out.println(line);

       //     String split[] = line.split(";");
//
        //    int targetSum = Integer.parseInt(split[1]);

        //    String [] integerVals = split[0].split(",");
       //     int [] pairArray = new int [integerVals.length];
          //  for(int i =0;i<integerVals.length; i++){

         //      pairArray[i] = Integer.parseInt(integerVals[i]);
          //  }

           /* ArrayList<Integer> integersList = targetPair(pairArray, targetSum);
            if(integersList.size()!=0){
                for(int i =0;i<integersList.size();i++){
                    if((i+1)%2!=0) {
                        System.out.print(integersList.get(i));
                    }else if((i+1)%2==0){
                        System.out.print(integersList.get(i)+";");
                    }else{
                        System.out.print(integersList.get(i)+",");
                    }
                }

            }else{
                System.out.println("NULL");
            }*/
            targetPairMap(new int[]{1, 2, 3, 4}, 5);
        }


    static ArrayList<Integer> targetPair(int [] inputArray, int targetSum){

        int low = 0;
        int high = inputArray.length - 1;
        ArrayList<Integer> formattedOutput = new ArrayList<>();
        while (low < high) {
            if (inputArray[low] + inputArray[high] == targetSum) {

                formattedOutput.add(inputArray[low]);
                formattedOutput.add(inputArray[high]);
            }
            if (inputArray[low] + inputArray[high] > targetSum) {
                high--;
            }
            else {
                low++;
            }
        }
        return formattedOutput;
    }



    static void targetPairMap(int [] arr, int sum) {

        Map<Integer, Integer> returnMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,
                Integer> mp = new HashMap<Integer,
                Integer>();

        // Traverse through all elements
        for (int i = 0; i < arr.length; i++) {

            // Search if a pair can be formed with
            // arr[i].
            int rem = sum - arr[i];
            if (mp.containsKey(rem)) {
                int count = mp.get(rem);
                System.out.println("count is "+count);
                list.add(rem);
                list.add(arr[i]);
            }
         //   if (mp.containsKey(arr[i])) {
         //       mp.put(arr[i], mp.get(arr[i]) + 1);
           // }
            else {
                mp.put(arr[i], arr[i]);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}