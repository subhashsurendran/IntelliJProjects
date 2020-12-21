package com.subhash.algorithms.rewrite;

import com.subhash.algorithms.QuickSortAlgorithm;

public class QuickSortAlgorithmRewrite {

    public static void main(String[] args) {
        QuickSortAlgorithmRewrite quickSortAlgorithmRewrite = new QuickSortAlgorithmRewrite();
        int [] input = {1,5,7,2,4,9,11};
        quickSortAlgorithmRewrite.sort(input, 0, input.length-1);
        quickSortAlgorithmRewrite.printArray(input);
    }

    public void sort(int [] arr, int low, int high){

        if(low<high){

            int partitionIndex = partition(arr, low, high);
            sort(arr, low, partitionIndex-1);
            sort(arr, partitionIndex+1, high);
        }

    }
    public int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j<high; j++){

            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, high);
        return i+1;
    }
    public static void printArray(int arr[]){

        for(int i =0; i<arr.length;i++)
            System.out.println(arr[i]+ " ");
        System.out.println();
    }
    public void swap(int [] arr, int i, int j){

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;

    }
}
