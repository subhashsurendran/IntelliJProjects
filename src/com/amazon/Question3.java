package com.amazon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Question3 {

    /*

    There is one meeting room in a firm. There are N meetings in the form of (start[i], end[i])
    where start[i] is start time of meeting i and end[i] is finish time of meeting i.
    What is the maximum number of meetings that can be accommodated in the meeting
    room when only one meeting can be held in the meeting room at a particular time?

     */
    public static void main(String[] args) {

    }

    public static int maxMeetings(int start[], int end[], int n) {
        Stack<Integer> returnList = new Stack<>();
        int count = 0;

        for (int i = 1; i < start.length; i++) {
            if (n == 0 || n == 1) {
                return n;
            }
            if (count == 0) {
                count = 1;
                returnList.add(start[0]);
                returnList.add(end[0]);
            }

            if ((start[i]) > returnList.peek()) {
                returnList.add(start[i]);
                returnList.add(end[i]);
            }
        }
        return returnList.size() / 2;
    }


    public static int maxMeetings2(int start[], int end[], int n) {

        if (n==0 || n ==1){
            return n;
        }

        Pair [] pairs = new Pair[n];

        for(int i=0;i<start.length;i++){
            pairs[i] = new Pair(start[i],end[i]);
        }

        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.end-o2.start;
            }
        });
        int last =0;
        int result =0;
        for(int i =0;i<n;i++){
            if(pairs[i].start>last){
                result++;
                last=pairs[i].end;
            }
        }

        return result;
    }
}

class Pair{

    int start;
    int end;

    Pair(int start,int end){
        this.start=start;
        this.end=end;
    }

}