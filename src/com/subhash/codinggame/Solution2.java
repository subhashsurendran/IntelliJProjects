package com.subhash.codinggame;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Solution2 {

    public static void main(String args[]) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String first=null;
        String second = null;
        for (int i = 0; i < n; i++) {
            String b = in.next();
            first = b;
            String d = in.next();
            second = d;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(differenceInYears(first,second));


    }

    public static long differenceInYears(String a, String b) throws ParseException {
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(a);
        Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(b);
        long diffInMillies = Math.abs(date2.getTime() - date1.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff/365;
    }
}