package com.subhash.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class LonelyInteger {

    public static void main(String[] args) {

        int[] a = {1,2,2,1,4,4,5};

        int [] b = {7,6,6,7,2};

        int []c ={23,12,11,11,21,21,7,7,5,2,2,4,5,8,9,76,74,13,19,13,19};

        //System.out.println( lonelyInteger(a));
       //System.out.println(loneyIntegerXOR(b));
        System.out.println(findLonelyPrime(c));
    }


    public static int howMany(String sentence) {
        // Write your code here
        int wordCount = 0;
        String []arrayOfWords = sentence.split("\\s");

        List<String> strings = Arrays.asList(arrayOfWords);

        //Remove all possibilities that could be number strings
        for(int i =0;i<strings.size();i++){

            String temp = strings.get(i);

            if(temp.matches("\\d+")){
                strings.remove(i);
            }

        }
        return strings.size();

    }

    public static int efficientJanitor(List<Float> weight) {

        Float[] floatArr=new Float[weight.size()];
        for(int i=0;i<weight.size();i++){
            Float aFloat = weight.get(i);
            floatArr[i]= aFloat.floatValue();
        }
        Arrays.sort(floatArr);
        int left = 0;
        int right = floatArr.length - 1;
        int count = 0;
        while(left <= right){
            if(left == right){
                count++;
                break;
            }
            if(floatArr[left] + floatArr[right] <= 3.0){
                left++;
                right--;
                count++;
            }
            else{
                right--;
                count++;
            }
        }
        System.out.println(count);
        // Write your code here
        return count;
    }


    static int substrings(String s, int k)
    {
        int count = 0;
        for (int i = 0; i< s.length(); i++)
        {
            int freq[] = new int[26];
            for (int j = i; j<s.length(); j++)
            {
                int index = s.charAt(j) - 'a';
                freq[index]++;
                if (freq[index] > k) {
                    break;
                }
                else if (freq[index] == k && check(freq, k) == true)
                {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean check(int freq[], int k)
    {
        for (int i = 0; i < 26; i++)
            if (freq[i] !=0 && freq[i] != k) {
                return false;
            }
        return true;
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

    public static int findLonelyPrime(int [] arr){
        Set<Integer> integers = fetchUniqueUsingXOR(arr);

        Iterator<Integer> iterator = integers.iterator();
        int flag =0;
        int prnumber=0;
        while(iterator.hasNext()){
            Integer next = iterator.next();
            prnumber=next;
            flag=0;
            for(int i =2; i<=next/2;i++){
                if(next%i==0){
                    flag =1;
                    break;
                }
            }
            if(flag==0){
                return prnumber;
            }
        }
        return prnumber;

    }

    public static Set<Integer> fetchUniqueUsingXOR(int [] arr){

       Set<Integer> x = new HashSet<>();
       for(int i =0;i<arr.length;i++){
           if(x.contains(arr[i])){
               x.remove(arr[i]);
           }else{
               x.add(arr[i]);
           }
       }
        return x;
    }
}
