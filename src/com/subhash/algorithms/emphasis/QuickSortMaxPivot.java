package com.subhash.algorithms.emphasis;

import java.util.Arrays;

public class QuickSortMaxPivot {

    public static void main(String[] args) {
        QuickSortMaxPivot quickSortMaxPivot = new QuickSortMaxPivot();
        int arr[] = {5,1,4,8,7,18,79};
        quickSortMaxPivot.quickSort(arr, 0, arr.length-1);
        quickSortMaxPivot.printArray(arr);
    }

    private void quickSort(int[] arr, int low, int high) {

        if(low<high){
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<high; j++){

            if(arr[j]<pivot){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, i+1, high);

        return i+1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

}
