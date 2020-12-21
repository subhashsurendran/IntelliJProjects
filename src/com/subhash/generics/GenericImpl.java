package com.subhash.generics;

public class GenericImpl <T> {

    public static void main(String[] args) {



    }

    public void printMessage (T t){
        System.out.println("Generic value printed as " + t.toString());
    }
}
