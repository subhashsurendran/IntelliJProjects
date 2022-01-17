package com.amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Given a string ‘str’ of digits and an integer ‘n’,
// build the lowest possible number by removing ‘n’ digits from
// the string and not changing the order of input digits.
public class Question2 {

    public static void main(String[] args) {

        String inp="81234558";
        int n=2;
        System.out.println(lowestNumber(inp,n));
    }

    private static String lowestNumber(String inputStr, int n){

        /*Algorithm
            Given a sequence of digits
            D1,D2,D3,..,Dn
            if D2 is less than D1, then we should remove D1
         */

        LinkedList<Character> stack = new LinkedList<>();

        for(char digit:inputStr.toCharArray()){
            while(stack.size()>0&&n>0&& stack.peekLast()>digit){
                stack.removeLast();
                n--;
            }
            stack.addLast(digit);
        }

        for(int i=0; i<n; ++i) {
            stack.removeLast();
        }
        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        for(char digit: stack) {
            if(leadingZero && digit == '0') continue;
            leadingZero = false;
            ret.append(digit);
        }

        /* return the final string  */

        return ret.toString();
    }
}
