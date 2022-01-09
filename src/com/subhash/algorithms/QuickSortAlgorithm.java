package com.subhash.algorithms;
//partitioning algorithm
public class QuickSortAlgorithm {

    public static void main(String[] args) {

        int[] toBeSorted = {10, 80, 30, 90, 40, 50, 70};
        int length = toBeSorted.length;
        QuickSortAlgorithm qsp = new QuickSortAlgorithm();
        qsp.sort(toBeSorted, 0, length - 1);
        printArray(toBeSorted);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public void sort(int[] arr, int low, int high) {

        if (low < high) {

            int partitionIndex = partition(arr, low, high);
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);

        }
    }

    public int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }
}
