package com.subhash.generics;

public class GenericImpl <T> {

    public static void main(String[] args) {

            GenericImpl g = new GenericImpl();

            g.createGenericArray();

    }

    public void printMessage (T t){
        System.out.println("Generic value printed as " + t.toString());
    }

    public  void createGenericArray(T... args){

        T[] genArra= args;
        for (int i = 0; i < genArra.length; i++) {
            System.out.println(genArra[i].toString());
        }
            
    }
}
