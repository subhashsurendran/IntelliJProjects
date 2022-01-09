package com.synechron;

import java.util.*;
import java.util.stream.Collectors;

public class DisplayNonRepeatingIntegers {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4, 5, 4, 4, 5, 7, 5, 7,-20,20);
        Integer integer = integers.stream().filter(i -> (Math.abs(20) == i)).findFirst().get();
        System.out.println(integer);



        List<Integer>lObj= new ArrayList<Integer>(
                Arrays.asList(10, -20, 20, -20, 20, 30, 30, -30, -40, -50, -60, 70, 90)
        );

        int key= 20;
        OptionalInt res= lObj.stream().mapToInt(x-> Math.abs(x)).filter(x->x==key).findFirst();
        System.out.println(res);
        integers.stream().filter(i->Collections.frequency(integers,i)==1).forEach(i->System.out.printf("%s ",i));
    }


}

enum StockAction{

    BUY,
    SELL
}
