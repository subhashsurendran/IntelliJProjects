package com.subhash.tidbitsd;

import java.util.Arrays;

public class SplitStringArray {
    public static void main(String[] args) {

        String [] splitter = {"dev","outbound", "inbound"};
        System.out.println(Arrays.stream(splitter).anyMatch(i->i=="outbound"))  ;
    }

}
