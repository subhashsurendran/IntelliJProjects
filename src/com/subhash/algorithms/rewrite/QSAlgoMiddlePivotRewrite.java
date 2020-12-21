package com.subhash.algorithms.rewrite;

public class QSAlgoMiddlePivotRewrite {
    public static void main(String[] args) {
        QSAlgoMiddlePivotRewrite qsAlgoMiddlePivotRewrite = new QSAlgoMiddlePivotRewrite();
        int arr[] = {4,1,2,5,9,10,3};
        qsAlgoMiddlePivotRewrite.quickSort(arr, 0, arr.length-1);
        qsAlgoMiddlePivotRewrite.printArry(arr);
    }

    private void printArry(int[] arr) {
        for(int i =0; i<arr.length;i++)
            System.out.println(arr[i]+ " ");
        System.out.println();
    }

    public void quickSort(int arr[], int low, int high){

        if(arr.length==0|| arr == null){
            return;
        }
        if(low>=high){
            return;
        }
        int i = low;
        int j = high;

        int middle = low+(high-low)/2;
        int pivot = arr[middle];

        while(i<=j){

            while(arr[i] < pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }

            if(i<=j){
                swap(arr, i ,j);
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
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
