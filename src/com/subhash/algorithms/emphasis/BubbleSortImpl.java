package com.subhash.algorithms.emphasis;

import java.util.Arrays;

public class BubbleSortImpl {

    public static void main(String[] args) {
        BubbleSortImpl bubbleSort = new BubbleSortImpl();
        int arr[] = {5,8,7,11,1,2,0};
        bubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr) {
        int length = arr.length;
        int k = 1;
        for(int i =0;i<length;i++){
            for(int j = 0; j<length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    k =0;
                    System.out.println("K set to 0");
                    swap(arr, j, j+1);
                }
            }
            if(k==1){
                System.out.println("K value is 1");
            }
        }
        if(k==0){
            sort(arr);
        }

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
