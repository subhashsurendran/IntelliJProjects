package com.subhash.designpattern.singleton;

import java.io.ObjectStreamException;

public class SingletonPatternImpl {

    private static volatile SingletonPatternImpl singletonPattern;

    private SingletonPatternImpl(){

    }

    public SingletonPatternImpl getInstance(){
        if(singletonPattern == null) {
            synchronized (SingletonPatternImpl.class) {
                if(singletonPattern == null) {
                    singletonPattern = new SingletonPatternImpl();
                }
            }
        }
        return singletonPattern;
    }

    private Object readResolve() throws ObjectStreamException {
        return singletonPattern;
    }
}
