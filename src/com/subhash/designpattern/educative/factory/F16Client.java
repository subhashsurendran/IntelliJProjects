package com.subhash.designpattern.educative.factory;

import java.util.ArrayList;
import java.util.Collection;

public class F16Client {
    public static void main(String[] args) {
        Collection<F16> x = new ArrayList<F16>();
        F16 first = new F16();
        F16A second = new F16A();
        F16B third = new F16B();
       // x.add(first);
        x.add(second);
        x.add(third);

        for(F16 f16 : x){
            f16.fly();
        }

    }
}
