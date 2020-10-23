package com.subhash.leetcode;

import java.util.List;

public class SubtractProduct {

    public static void main(String[] args) {
        SubtractProduct subp = new SubtractProduct();
        int n = 35;
        System.out.println(SubtractProduct.subtractProduct(n));

    }


    private static int subtractProduct(int n) {

        List<String> x = List.of("x", "yz");
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int tempNum = n % 10;
            product = product * tempNum;
            sum += tempNum;
            n = n / 10;
        }

        return product - sum;

    }
}
