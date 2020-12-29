package com.subhash.codinggame;

public class Pangram {

    //A pangram is a sentence that uses every letter of the alphabet at least once.
    //
    //Your program must indicate whether the given string is a pangram or not.
    //
    //INPUT:
    //S a string.
    //
    //OUTPUT:
    //true if S is a pangram, false otherwise.
    //
    //CONSTRAINTS:
    //S contains at least 1 character.
    //S contains less than 256 characters.
    //S contains only alphanumeric characters and spaces.
    //
    //EXAMPLE:
    //Input
    //Abcde fghij klmno pqrs tuv wxyz
    //Output
    //true
    //


    public static void main(String[] args) {
        System.out.println(checkPangram("quick fox jumps over the lazy dog"));
    }

    public static boolean checkPangram(String inputStr){

        boolean[] indexList = new boolean[26];
        int index =0;
        int a = 'A';
        System.out.println(a);

        for(int i =0; i<inputStr.length();i++){

            if(inputStr.charAt(i)>='A' && inputStr.charAt(i)<='Z'){
                index = inputStr.charAt(i)-'A';
            }else if(inputStr.charAt(i)>='a' && inputStr.charAt(i)<='z'){
                index = inputStr.charAt(i)-'a';
            }else{
                continue;
            }
            indexList[index]=true;
        }

        for(int i =0; i<indexList.length;i++){
            if(indexList[i] == false){
                return false;
            }
        }
        return true;

    }

}
