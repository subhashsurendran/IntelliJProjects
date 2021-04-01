package com.subhash.maps;

import com.subhash.hackerrank.Solution1;

public class Outer {


    public static int temp1=1;
    public static int temp2 = 2;

    public int temp3=3;
    public int temp4=4;

    public static class Inner{
        public static int temp5=5;
        public static int getSum(){
            return 0;
          //  return (temp1+temp2+temp3+temp4+temp5);
        }
    }

    public static void main(String args[]){
        Outer.Inner obj = new Outer.Inner();
        System.out.println(obj.getSum());
    }
}
