package com.subhash.hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Subset_sum
{
    static  int countStrings(int n)
    {
        int a[] = new int [n];
        int b[] = new int [n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        return a[n-1] + b[n-1];
    }
    /* Driver program to test above function */
    public static void main (String args[])
    {
       // System.out.println(countStrings(3));
        System.out.println("First Length of "+lengthOfLongestSubstring("abcdagh"));

        System.out.println("Second: "+getUniqueCharacterSubstring("abcdagh"));

        System.out.println("Third "+longestContinuousNRStringCount("abcdagh"));
        System.out.println("Baeldung "+getUniqueCharacterSubstring("abcdagh"));
        System.out.println(">>> "+longestContinuousNRStringObj("abcdagh"));

        System.out.println("Subhash Practice "+longestCNRStringUsingMap("abcdaghaaaaa"));
        System.out.println("First Length of Subhash "+lengthOfLongestSubstring("abcdaghaaaaa"));

        splitIntegers(13);

        streamsExamples();
    }


    public static int lengthOfLongestSubstring(String s) {
        char[] stringCharArr= s.toCharArray();
        Set<Character> charSetObj = new HashSet<>();
        int l = 0,r=0;
        int currentLongest=0;
        while(r<s.length()&& l<s.length()){
            if(!charSetObj.contains(stringCharArr[r])){
                charSetObj.add(stringCharArr[r]);
                r++;
                currentLongest = Math.max(currentLongest, r-l);
            }else{
                charSetObj.remove(stringCharArr[l]);
                l++;
            }
        }
        return currentLongest;
    }


    public static String getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return output;
    }


    private static void splitIntegers(int n){

        int max =0;

        String s1 = Integer.toString(n, 2);
        System.out.println("Integer to String: " + s1);
        System.out.println("Long Object "+Long.parseLong(s1));
        String s = Integer.toBinaryString(n);
        System.out.println("Integer to Binary String "+s);
        System.out.println(max);


    }



    private static String longestCNRStringUsingMap(String input){
        String output ="";
        int left =0;
        int right =0;

        List<Integer> x = new LinkedList<>();

        Map<Character, Integer> mapObj = new HashMap<>();

        while(right<input.length()){
            char inputChar = input.charAt(right);
            if(mapObj.containsKey(inputChar)){
                int i = mapObj.get(inputChar) + 1;
                left = Math.max(i, left);
            }
            if(output.length()<right-left+1){
                output = input.substring(left, right+1);
            }
            mapObj.put(input.charAt(right), right);
            right++;
        }

        return output;

    }

    private static void streamsExamples(){

        ArrayList<Integer> numbersList
                = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        ArrayList<Integer> numbersList2
                = new ArrayList<>(Arrays.asList(10, 12, 23, 34, 35, 36, 49, 58, 46, 56, 66, 7, 8));

        Map<Integer, Long> elementCountMap = numbersList.stream()
                .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));

        List<ArrayList<Integer>> arrayLists = Arrays.asList(numbersList, numbersList2);

        List<Integer> collect = arrayLists.stream().flatMap(d -> d.stream()).collect(Collectors.toList());
        System.out.println("Printing subhash");
        System.out.println(collect);



        System.out.println(elementCountMap);
    }



    private static String longestContinuousNRStringObj(String input){

        String longestSubstring ="";
        if(input ==null || input.length()==0){
            return null;
        }
        HashMap<Character, Integer> visitedMap = new HashMap<>();
        int left =0;
        int right =0;

       while(right<input.length()){

           char currentChar = input.charAt(right);
           if(visitedMap.containsKey(currentChar)){
               left = Math.max(visitedMap.get(currentChar)+1,left);
           }

           if (longestSubstring.length() < right - left + 1) {
               longestSubstring = input.substring(left, right+1);
           }
           visitedMap.put(currentChar,right);
           right++;
       }

        return longestSubstring;

    }


    private static int longestContinuousNRStringCount(String input){
        int longestSR =0;
        if(input.length()==0 || input ==null){
            return 0;
        }
        Set<Character> setObj = new HashSet<>();
        int left =0; int right =0;
        while(right<input.length()&&left<input.length()){
            if(!setObj.contains(input.charAt(right))){
                setObj.add(input.charAt(right));
                right++;
                longestSR = Math.max(longestSR, right-left);
            }else{
                    setObj.remove(input.charAt(left));
                    left++;
            }
        }
        return longestSR;
    }



    private static String longestContinuousNRString(String inputString){

        StringBuilder longestSubstring = new StringBuilder();

        if(inputString == null || inputString.length()==0){
            return null;
        }
        Set<Character> uniqueChars = new HashSet<>();

        char inputStrArr [] = inputString.toCharArray();
        int left=0;
        int right=0;

        StringBuilder newSubString = new StringBuilder();

        while(right<inputStrArr.length && left<=right){

            if(!uniqueChars.contains(inputStrArr[right])) {
                //Increment right pointer
                uniqueChars.add(inputStrArr[right]);
                newSubString.append(inputStrArr[right]);
                right++;

            }else{
                System.out.println(right + " , " + left);
                //longestSubstring.remove(inutStrArr[right]);
                System.out.println(inputStrArr[left]);
                //uniqueChars.remove(inputStrArr[left]);

                //System.out.println("Working "+newSubString.toString().substring(0,1));
                //newSubString= newSubString.toString().substring(left,newSubString.toString().length());
                left++;

            }

        }

        //iterate through my set, append the chars & fetch the output.toString
    /*
    Iterator iterator = uniqueChars.iterator();
    while(iterator.hasNext()){

      //System.out.println(longestSubstring.toString());
      longestSubstring.append(iterator.next());
     }*/


        return newSubString.toString();
    }
}