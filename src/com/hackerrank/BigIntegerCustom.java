package com.hackerrank;


import java.math.BigInteger;

public class BigIntegerCustom {

    public static void main(String[] args) {

        BigInteger x = new BigInteger("50000000000000000");
        BigInteger y = new BigInteger("450544545");
        System.out.println(add(x,y));
        System.out.println(product(x,y));
    }

    public static BigInteger add(BigInteger a, BigInteger b){
        return a.add(b);
    }
    public static BigInteger product(BigInteger a, BigInteger b){
        return a.multiply(b);
    }
}
