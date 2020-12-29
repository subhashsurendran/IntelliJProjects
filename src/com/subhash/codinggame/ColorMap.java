package com.subhash.codinggame;

import java.util.HashMap;
import java.util.Map;

/*


You must output values of resistors based on their three strips of colors.
The first strip is the first digit of value.
The second strip is the second digit of value.
The third strip is the multiplier.

Table of colors :
black → digit : 0, multiplier : 1
brown → digit : 1, multiplier : 10
red → digit : 2, multiplier : 100
orange → digit : 3, multiplier : 1,000
yellow → digit : 4, multiplier : 10,000
green → digit : 5, multiplier : 100,000
blue → digit : 6, multiplier : 1,000,000
violet → digit : 7, multiplier : 10,000,000
grey → digit : 8, multiplier : 100,000,000
white → digit : 9, multiplier : 1,000,000,000

Example :
yellow violet blue
yellow : 4, violet : 7, blue : 1,000,000 → value of resistor is 47,000,000 Ω.
 */
public class ColorMap {
    public static HashMap<String, HashMap<Integer, Integer>> global = new HashMap<>();
    public static void main(String[] args) {
        setUp();
        String [] inputArr = {"yellow","violet","blue"};
        System.out.printf("%.0f\n", resistorOutput(inputArr));

    }



    public static Double resistorOutput(String[] arr){
        double returnVal =0;

            HashMap<Integer, Integer> multiplier = global.get(arr[0]);
            for(Map.Entry <Integer, Integer> entry: multiplier.entrySet()){
                returnVal+=entry.getKey()*10;

            }
            for(Map.Entry<Integer, Integer> entry: global.get(arr[1]).entrySet()){
                returnVal+=entry.getKey();
            }
            for(Map.Entry<Integer, Integer> entry: global.get(arr[2]).entrySet()){
            returnVal*=entry.getValue();
            }
        return returnVal;
    }
    public static void setUp(){

        int multiplier =1;
        String [] colorList = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        for(int i =0;i<10;i++){
            HashMap<Integer, Integer> digiMulp = new HashMap<>();
            digiMulp.put(i, multiplier);
            global.put(colorList[i],digiMulp);
            multiplier=multiplier*10;
        }
        String x = null;
        global.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" " + e.getValue()));
    }
}
