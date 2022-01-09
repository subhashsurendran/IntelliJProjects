package com.subhash.codinggame;

import java.util.Locale;

public class TeacherChocolates {


    //In mathematics exam N students passed and some others failed !
    //The teacher John decided to give sweets to students .
    // He will distribute the sweets to students who passed the exam in the order of
    // 1 sweet for first student 3 sweets for second student
    // 5 sweets for third student and so on ...
     //the sweets are in packets. Each packet contains 10 sweets.
    // how many packets are needed for giving sweets for students.
    // He said that next time the failed students will study because of this !



    public static void main(String[] args) {
        int passed = 1;
        System.out.println(numberOfPackets(passed));
    }

    public static int numberOfPackets(int passedCount){
        int chocolates = 1;
        int totalChocolates = 0;
        for(int i =1;i<=passedCount;i++){
            totalChocolates = totalChocolates+chocolates;
            chocolates = chocolates+2;
        }
        return totalChocolates/10;
    }
}
