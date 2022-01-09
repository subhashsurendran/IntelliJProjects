package com.leetcode;

import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {



    public boolean validParenthesisCheck(String inputStr) {
/*
        Map<Character, Character> mapper = Map.of(   '(',')',
                                                            '{','}',
                                                            '[',']'
        );
        Stack<Character> myStack = new Stack<>();


        for(char c:inputStr.toCharArray()){
            if(mapper.containsKey(c)){
                myStack.push(c);
            }else{
                if(myStack.isEmpty()){
                   return false;
                }else{
                    Character pop = myStack.pop();
                    if(pop!=mapper.get(pop)){
                        return false;
                    }
                }
            }
        }
        return myStack.isEmpty();
    }*/
        return false;
    }
}
