package com.subhash.algorithms.emphasis;

import java.util.Arrays;

public class QuickSortMiddlePivot {

    public static void main(String[] args) {

        int arr[] = {1,5,4,2,11,8};
        QuickSortMiddlePivot quickSortMiddlePivot = new QuickSortMiddlePivot();
        quickSortMiddlePivot.quickSort(arr, 0, arr.length-1);
        quickSortMiddlePivot.printArray(arr);
    }

    public static void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int [] arr, int low, int high){

        if(arr.length==0|| arr == null || low>=high){
            return;
        }
        int middle = low + (high - low)/2;
        System.out.println("middle is "+ middle);
        int pivot = arr[middle];
        int i = low, j=high;
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

    private static void swap(int[] arr, int low, int j) {
        int temp = arr[low];
        arr[low]= arr[j];
        arr[j]=temp;
    }

}
