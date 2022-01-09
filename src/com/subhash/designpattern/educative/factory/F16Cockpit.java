package com.subhash.designpattern.educative.factory;

public class F16Cockpit implements ICockpit{
    @Override
    public void buildCockpit() {
        System.out.println("F16 Cockpit built");
    }
}
