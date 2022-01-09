package com.leetcode;


//Given an array of integers, remove an element based on the index given.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveAnElementFromArray {

    public int [] removeElement(int [] input, int index){

        List<Integer> ints = IntStream.of(input).boxed().collect(Collectors.toList());
        ints.remove(index);
        return ints.stream().mapToInt(Integer::intValue).toArray();
    }
}
