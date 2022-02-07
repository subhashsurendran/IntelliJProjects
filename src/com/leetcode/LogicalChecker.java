package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class LogicalChecker {
    public static void main(String[] args) {

        List<String> ypHolder1 = Arrays.asList("TP","YP","YT"); //Y
        String xyz1= "TSY";

        List<String> ypHolder2 = Arrays.asList("TP","YT"); // false
        String xyz2= "TSY";

        List<String> ypHolder3 = Arrays.asList("TP","YP","YT"); //false
        String xyz3= "SYT";

        List<String> ypHolder4 = Arrays.asList("TP","YT"); //false
        String xyz4= "TSYT";

        System.out.println(ypHolder1.contains("YP")&&xyz1.equalsIgnoreCase("TSY")?"Y":"false");
        System.out.println(ypHolder2.contains("YP")&&xyz2.equalsIgnoreCase("TSY")?"Y":"false");
        System.out.println(ypHolder3.contains("YP")&&xyz3.equalsIgnoreCase("TSY")?"Y":"false");
        System.out.println(ypHolder4.contains("YP")&&xyz4.equalsIgnoreCase("TSY")?"Y":"false");
    }
}
