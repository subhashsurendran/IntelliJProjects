package com.synechron;

public class MaxAndMinCalculator {
    public static void main(String[] args) {

        int [] input = {0,1,5,8,79,8};
        maxAndMinCalculator(input);

    }

    public static void maxAndMinCalculator(int [] inputArr){


        int min = inputArr[0];
        int max = inputArr[0];

        for(int i=0;i<inputArr.length;i++){

           min= Math.min(inputArr[i], min);
           max= Math.max(inputArr[i], max);

        }
        System.out.println("Minimum Number: "+ min);
        System.out.println("Maximum Number: "+ max);

    }


    //Element of Array could be 0 or 1 or 2
    //Sorting Algorithm
   //input Array = {0, 2 ,1, 3, 5};
    //

    public static void customSort(int [] arr){
        // Edge Cases:
        if(arr.length == 0 || arr == null){
            System.out.println("Invalid Input");

        }else{

            int left = 0;
            int right = arr.length-1;
            int middlePivot = (left+right)/2;

            while(left<=right){

                while(arr[left]>middlePivot){

                    left++;
                }
                while(arr[right]<middlePivot){
                    right--;
                }

                if(left<=right){

                    swap(arr, left, right);
                    left++;
                    right--;

                }

                if(left<right){


                }

            }



        }



    }

    private static void swap(int [] inputArr, int i, int j) {

        int temp  = inputArr[i];
        inputArr[i] = inputArr[j];
        inputArr[j]= temp;

    }



    private static int [] customSort2(int [] arr, int low, int high){

      int i =low;
      int j = high;
      int middlePivot = (low+high)/2;

      while(i<=j){
          while(arr[i]>middlePivot){
              i++;
          }
          while(arr[j]<middlePivot){
              j--;
          }

          if(i<j){

              swap(arr, i, j);
              i++;
              j--;
          }

      }
      if(low<j){

          customSort2(arr, low,j);

      }
      if(high>i){
          customSort2(arr, i, high);
      }


     return arr;
    }



}


// Design a stack to fetch the minimum element from the Array in O(1)

// Stack is Last in first out

/*

Stack<Integer[]> stackArray = new Stack<>();
stackArray.push(input[]);

stack.peek();

            listObject.stream.filter((condition ). (i)->System.out.println("Input is "+ i)));

            Design a vending machine

            Functionalities:
               1) displayAllOptionsWithSelections(); [Objective is to show all items available, Has to update whenever
               the inventory
                is updated]
               2) selectAnItem(input is SelectedItem);
                            - Objective is to take in user input, check if it is available,
                            - If available, output the price to the user
                            - Update my inventory i.e. reduce the count
                            - my input type is itemCode




 */



