package com.subhash.designpattern.educative.factory;

public class F16B extends F16{
    @Override
    public void taxi() {
        System.out.println("Short taxiing");
    }

    @Override
    public void fly() {
        makeF16();
        taxi();
        System.out.println("F16B Flying");
    }

    @Override
    protected F16 makeF16() {
        super.makeF16();
        return this;
    }
}
