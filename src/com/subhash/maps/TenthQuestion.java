package com.subhash.maps;

import java.io.IOException;

public class TenthQuestion {
}

class A{
    public void process() throws IOException{
        System.out.println("A");
    }
}

class B extends A{
    public void process() throws IOException{
        super.process();
        System.out.println("B");
        throw new IOException();
    }

    public static void main(String[] args) {
        try{
            new B().process();
        }catch(IOException e){
            System.out.println("Exception");
        }
    }
}
