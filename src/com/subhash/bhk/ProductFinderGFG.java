package com.subhash.bhk;
// Java program if there exists a pair for given product
import java.util.HashSet;

public class ProductFinderGFG
{
    // Returns true if there is a pair in arr[0..n-1]
    // with product equal to x.
    static boolean isProduct(int arr[], int n, int x)
    {

        HashSet<Integer> hset = new HashSet<>();

        if(n < 2)
            return false;


        for(int i = 0; i < n; i++)
        {
            // 0 case must be handles explicitly as
            // x % 0 is undefined
            if(arr[i] == 0)
            {
                if(x == 0)
                    return true;
                else
                    continue;
            }

            // x/arr[i] exists in hash, then we
            // found a pair
            if(x % arr[i] == 0)
            {
                if(hset.contains(x / arr[i]))
                    return true;

                // Insert arr[i]
                hset.add(arr[i]);
            }
        }
        return false;
    }

    // driver code
    public static void main(String[] args)
    {
        int arr[] = {-1, 2, 3};
        int x = 6;
        int n = arr.length;

        if(isProduct(arr, arr.length, x))
            System.out.println("Yes");
        else
            System.out.println("No");

        x = 190;

        if(isProduct(arr, arr.length, x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

