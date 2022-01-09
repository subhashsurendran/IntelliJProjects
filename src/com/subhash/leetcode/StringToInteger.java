package com.subhash.leetcode;

import java.util.Arrays;
import java.util.List;

public class StringToInteger {

    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        System.out.println(stringToInteger.stringToInteger("     -42"));

    }

    private int stringToInteger(String input) {

        String updatedInput = input.replaceAll("\\s+", "");
        List<Integer> asList = Arrays.asList(48, 49, 50, 51, 52, 53, 54, 55, 56, 57);
        StringBuilder updatedBuilder = new StringBuilder();
        char[] chars = updatedInput.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '-' || c == '+') {
                updatedBuilder.append(c);
                continue;

            } else if (asList.contains((int) c)) {
                updatedBuilder.append(c);
                continue;
            } else {
                break;
            }

        }
        if(updatedBuilder.toString().length()==0){
            return 0;
        }else {

            Integer integer = Integer.valueOf(updatedBuilder.toString());
            if (integer < -Math.pow(2, 15)) {
                return Integer.MIN_VALUE;
            } else if (integer > Math.pow(2, 16) - 1) {
                return Integer.MAX_VALUE;
            } else {
                return integer;
            }
        }

    }

}
