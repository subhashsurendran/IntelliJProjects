package com.subhash.algorithms;

public class QuickSortAlgorithmMiddlePivot {

    public static void main(String[] args) {
        QuickSortAlgorithmMiddlePivot quickSortAlgorithmMiddlePivot = new QuickSortAlgorithmMiddlePivot();
        int [] arr = {7,5,1,9,12,5,9};
        quickSortAlgorithmMiddlePivot.quickSort(arr, 0, arr.length-1);
        quickSortAlgorithmMiddlePivot.printArray(arr);
    }


    public void quickSort(int arr[] , int low, int high){

        if(arr.length==0 || arr ==null){
            return;
        }
        if(low>=high){
            return;
        }
        int middle = low+(high-low)/2;
        int pivot = arr[middle];
        int i = low, j = high;
        while(i<=j){

            while(arr[i]<pivot){

                i++;
            }
            while(arr[j]>pivot){

                j--;
            }
            if(i<=j){
                swap(arr, i,j);
                i++;
                j--;
            }

        }
        if(low<j){
                quickSort(arr, low, j );
        }
        if(high > i){
            quickSort(arr, i, high);
        }

    }

    public void printArray(int arr[]){

        for(int i =0; i<arr.length; i++)
           System.out.println(arr[i]+ " " );
        System.out.println();
    }
    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
