package com.subhash.algorithms.rewrite;

import java.util.Arrays;

public class Qsp {
    public static void main(String[] args) {
        Qsp qsp = new Qsp();
        int arr[] = {1,0,-1,5,8,11,15,9};
        qsp.quickSort(arr, 0, arr.length-1);
        qsp.printArray(arr);
    }

    private void printArray(int[] arr) {

        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int arr[] , int low, int high){

        if(arr.length==0 || arr==null){
            return;
        }
        if(low>=high){
            return;
        }

        int middle = low+(high -low)/2;
        int pivot = arr[middle];
        int i = low;
        int j = high;
        while(i<=j){

            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){

                j--;
            }

            if(i<=j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if(low<j){
            quickSort(arr, low, j);
        }
        if(high>i){
            quickSort(arr, i, high);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
