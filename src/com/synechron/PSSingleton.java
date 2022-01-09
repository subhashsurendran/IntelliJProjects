package com.synechron;

public class PSSingleton {

    private static final PSSingleton pssingleton = new PSSingleton();

    public static PSSingleton buildFactory(){
        return pssingleton;
    }
    private PSSingleton(){}
}
