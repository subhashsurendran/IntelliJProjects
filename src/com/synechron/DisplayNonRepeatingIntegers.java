package com.synechron;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DisplayNonRepeatingIntegers {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4, 5, 4, 4, 5, 7, 5, 7);

        integers.stream().filter(i->Collections.frequency(integers,i)==1).forEach(i->System.out.printf("%s ",i));
    }
}
