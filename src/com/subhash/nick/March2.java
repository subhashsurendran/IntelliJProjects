package com.subhash.nick;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class March2 {







    public static void main(String[] args) {
        March2 march2 = new March2();
        String inputString = "leetcodeisacommunityforcoders";
        System.out.println(march2.removeVowels(inputString));

    }

    private String removeVowels(String inputString){
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<inputString.length();i++) {

            Character c = inputString.charAt(i);

            if (!vowels.contains(c)) {
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
