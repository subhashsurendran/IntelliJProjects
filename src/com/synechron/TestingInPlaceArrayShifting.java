package com.synechron;

public class TestingInPlaceArrayShifting {

    public static void main(String[] args) {
        int arr[]= {1,1,1,2,2,2,3,4,5,5,5,6};
        int [] res =shiftArray(arr);
        //for(int i=0;i<res.length;i++)
          //  System.out.print(arr[i]+ " ");
    }

    public static int [] shiftArray(int[] input){

        int i =0;
        int j =0;

        for(i=0;i<input.length;i++){

            if(input[j]!=input[i]){
                j++;
                swap(input, i, j);
            }

        }
        for( i = j+1; i<input.length;i++) {
            input[i] = Integer.MIN_VALUE;
        }
        System.out.println("Unique Element Count :" + (j+1));
        for(i=0;i<j+1;i++){
            //System.out.println("First Unique Elements: ");
            System.out.print(" " + input[i]);
        }
        return input;

    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
