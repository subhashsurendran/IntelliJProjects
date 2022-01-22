package com.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class BigDecimalCustom {
    public static void main(String[] args) {

    }


    public static void sortInDescending(String [] s){

        Comparator<String> myCustomComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal b1 = new BigDecimal(o1);
                BigDecimal b2 = new BigDecimal(o2);
                return b2.compareTo(b1);
            }
        };

        Arrays.sort(s, 0,s.length, myCustomComparator);


        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}
