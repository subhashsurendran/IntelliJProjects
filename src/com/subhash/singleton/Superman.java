package com.subhash.singleton;

import java.io.ObjectStreamException;
import java.lang.reflect.Constructor;

public class Superman {

    private static volatile Superman superman;

    private Superman(){

    }
    public static Superman getInstance(){
        if(superman == null){

            synchronized ((Superman.class)){
                if(superman==null){
                    superman = new Superman();
                }
            }
        }

        return superman;
    }

    private Object readResolve() throws ObjectStreamException {
        return superman;
    }
}

class x {

    public static void main(String[] args) {
        Class<Superman> supermanClass = Superman.class;
        final Constructor<?>[] declaredConstructors = supermanClass.getDeclaredConstructors();

        SupermanEnum instance = SupermanEnum.INSTANCE;
        instance.fly();
    }

}