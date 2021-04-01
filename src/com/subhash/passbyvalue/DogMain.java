package com.subhash.passbyvalue;

import com.subhash.hackerrank.Solution1;

public class DogMain {

    public static void main(String[] args) {

        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;
        foo(aDog);
        System.out.println(aDog.getName().equals("Max")); // true
        System.out.println(aDog.getName().equals("Fifi")); // false
        System.out.println(aDog == oldDog);
        System.out.println(aDog.getName());

    }

    static void foo(Dog d){
        d.getName().equals("Max");
        d = new Dog("Fifi");
        d.getName().equals("Fifi");

    }
}
