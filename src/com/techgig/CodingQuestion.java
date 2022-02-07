package com.techgig;

import java.util.*;

public class CodingQuestion {

    /*

    Miss Rosy teaches Mathematics in the college, St. Stephens, and is noticing for last few lectures that the turn around in class is not equal to the number of attendance. The fest is going on in college and the students are not interested in attending classes. The friendship is at its peak and students are taking turns for classes and arranging proxy for their friends. They have been successful till now and have become confident. Some of them even call themselves pro.
    One fine day, the proxy was called in class as usual but this time Miss Rosy recognized the student with his voice. When caught, the student disagreed and said that it was a mistake and Miss Rosy has interpreted his voice incorrectly. Miss Rosy let it go but thought of an idea to give attendance to the students present in class only.


In the next lecture, Miss Rosy brought a voice recognition device which would save the voice of students as per their roll number and when heard again will present the roll number on which it was heard earlier. When the attendance process is complete, it will provide a list which would consist of the number of distinct voices. The student are unaware about this device and are all set to call their proxies as usual. Miss Rosy starts the attendance process and the device is performing its actions. After the attendance is complete, the device provides a list.


Miss Rosy presents the list to you and asks for the roll numbers of students who were not present in class. Can you provide her with the roll number of absent students in increasing order.


Note: There is at least one student in the class who is absent.

Input Format
The first line of input consists of the actual number of students in the class, N. The second line of input consists of the list (N space-separated elements) presented to you by Miss Rosy as recorded by the voice recognition device.

Constraints
1<= N <= 100

1<= List_elements <=N
Output Format
Print the roll number of students who were absent in class separated by space.

Input
7
1 2 3 3 4 6 4
Output
5 7
     */

    /* Read input from STDIN. Print your output to STDOUT*/


    public static void main(String args[]) throws Exception {

        //Write code here
       // Scanner scan = new Scanner(System.in);
       // int a = scan.nextInt();
        //int[] inputArr = new int[a];
        /*for (int i = 0; i < a; i++) {
            inputArr[i] = scan.nextInt();
        }*/

        int inputArr[]= {1,2,3,3,4,6,4};
        int[] ints = returnAbsent(inputArr);
        for(int i =0;i<ints.length;i++){
            System.out.print(ints[i]+" ");;
        }

    }


    public static int[] returnAbsent(int[] input) {

        int length = input.length;
        if (length == 0 || length == 1) {
            return input;
        }

        boolean [] isPresent = new boolean[length+1];
        HashMap<Integer, Boolean> presentMapper = new HashMap<>();

        for(int i =0;i<length;i++){
            isPresent[i]=false;
        }

        for(int i =0;i<length;i++){

            presentMapper.put(input[i],true);
        }

        for (Map.Entry<Integer,Boolean> entry : presentMapper.entrySet()){
            int isPresentIndexer = entry.getKey();
            isPresent[isPresentIndexer]=true;
        }

        ArrayList<Integer> absentFinder = new ArrayList<>();

        for(int i =1;i<isPresent.length;i++){
            if(isPresent[i]==false){
                    absentFinder.add(i);
            }
        }

        int [] absentArray = new int[absentFinder.size()];
        for(int i =0;i<absentFinder.size();i++){
            absentArray[i]=absentFinder.get(i);
        }

        return absentArray;
    }

}
