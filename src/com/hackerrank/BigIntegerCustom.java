package com.hackerrank;


import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerCustom {

    public static void main(String[] args) {

        BigInteger x = new BigInteger("5000000000000000085858585858585858585");
        BigInteger y = new BigInteger("450544545");

        BigDecimal x1 = new BigDecimal("258978656787878787878787878787878778787856566565645859665336" +
                ".6878565656565655656");
        BigDecimal y1 = new BigDecimal("25897845859665336.6565656565655656");
        System.out.println(y1.multiply(x1));
        System.out.println(String.valueOf(y1.multiply(x1)));
      //  System.out.println(x1.multiply(y1));
      //  System.out.println(add(x,y));
      //  System.out.println(product(x,y));
    }

    public static BigInteger add(BigInteger a, BigInteger b){
        return a.add(b);
    }
    public static BigInteger product(BigInteger a, BigInteger b){
        return a.multiply(b);
    }
}
