package com.subhash.nick;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HackerRank {

    public static void main(String[] args) {
        HackerRank x = new HackerRank();

        int[][] arrayTobeRotated = {{1,2,3},{4,5,6},{7,8,9}};
       // int[][] ints = x.rotateMatrix(arrayTobeRotated);
        int [][] xx=x.rotateAntiClockWise(arrayTobeRotated);




        System.out.println("Completed");

                   for(int i =0;i<xx.length;i++){

                       System.out.println(Arrays.toString(xx[i]));
                   }
    }


    public int [][] rotateAntiClockWise(int [][]matrix) {


        int n = matrix.length;

        //step 1 transpose

        int[][] ints = step1TransposeArray(matrix, n);

        //Step 2 rotate anticlockwise

           for(int j =0;j<n;j++){

               for (int i =0;i<n/2;i++){

                   int temp = ints[i][j];
                   ints[i][j]=   ints[i][n-1-j];
                   ints[i][n-1-j]=temp;

               }
           }

        return ints;



    }



    public int [][] rotateMatrix(int [][] arrayTobeRotated){
               int n = arrayTobeRotated.length;  

        //Step 1 Transpose array
        int [][] rotateMatrix = step1TransposeArray(arrayTobeRotated, n);

        //Step 2 - Flip numbers within the rows

        for(int i =0;i<rotateMatrix[0].length;i++){

            for (int j=0;j<n/2;j++){


                int temp = rotateMatrix[i][j];
                 rotateMatrix[i][j]=rotateMatrix[i][n-1-j];
                 rotateMatrix[i][n-1-j]=temp;
            }
        }



        return rotateMatrix;
        
    }

    private int [][] step1TransposeArray(int[][] arrayTobeRotated, int n) {
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int temp = arrayTobeRotated[i][j];
                arrayTobeRotated[i][j] = arrayTobeRotated[j][i];
                arrayTobeRotated[j][i] = temp;
            }

        }

        return arrayTobeRotated;
    }
}
