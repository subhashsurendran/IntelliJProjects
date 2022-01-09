package com.subhash.designpattern.educative.factory;

public class F16A extends F16{
    @Override
    public void taxi() {
        System.out.println("F16A taxiing");
    }

    @Override
    public void fly() {
        makeF16();
        taxi();
        System.out.println("F16A Flying");
    }

    @Override
    public F16 makeF16() {
        engine = new F16AEngine();
        engine.buildEngine();
        cockpit = new F16ACockpit();
        return this;
    }
}
