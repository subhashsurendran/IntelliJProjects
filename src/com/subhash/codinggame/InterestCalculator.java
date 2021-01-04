package com.subhash.codinggame;


import java.util.ArrayList;
import java.util.List;

/*

You borrowed N dollars from the bank. The compound interest accrues I % each month. You will pay the interest in M months. Then how many $s you have to pay to the bank after M months?
The result will be always an integer.
 */
public class InterestCalculator {
    public static void main(String[] args) {
       // System.out.println(addString("bogus"));
        int [] arrr = {4,3,1,2};
       // System.out.println(minimumSwaps(arrr));

        String x = null;
        String y =null;

        if(x.equals(y) ){
            System.out.println("IF loop");
        }
    }



    //Clash 2
    //Character addition
    static String addString(String input){

        char[] alpha = new char[26];
        for(int i = 0; i < 26; i++){
            alpha[i] = (char)(97 + i);
        }

        List<char[]> charList = new ArrayList<>();

        charList.add(alpha);
        StringBuilder x = new StringBuilder();

        for(int i =0;i<input.length();i++){
            char c = input.toCharArray()[i];
            int newC = (int)c+i;
            char newChar = (char)newC;
             x.append(newChar);
        }


        return x.toString();
    }




    //minimumswaps

    static int minimumSwaps(int[] arr) {

        int counter =0;

        for(int i =0;i<arr.length;i++){

            if(arr[i]==(i+1)){
                continue;
            }else{
                int j =i;
                while(arr[j]!=i+1) {
                    j++;
                }
                swap(arr, i, j);
                counter++;

            }

        }
        return counter;

    }

    private static void swap(int[] arr, int i, int i1) {

        int temp = arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;

    }

}
