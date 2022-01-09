package com.synechron;

import java.util.ArrayList;
import java.util.List;


public class MergeSortedArrays {

    public static void main(String[] args) {

       int arr1[]={1, 2, 2, 2, 3, 5, 6, 8, 9};
       int arr2[] = {2, 4, 5, 5, 9, 10};
       int n1 = arr1.length;
       int n2=arr2.length;
       int i =0, j=0;
       List<Integer> outputList = new ArrayList<>();
       while(i<n1 && j<n2){
              if(arr1[i]<arr2[j]){
                   outputList.add(arr1[i]);
                   i++;
               }else{
                   outputList.add(arr2[j]);
                   j++;
               }
       }

       while(i<n1){
           outputList.add(i);
           i++;
          }
       while(j<n2){
           outputList.add(j);
           j++;
       }


       outputList.stream().distinct().forEach(k1->System.out.printf("%d", k1));

    }
}
