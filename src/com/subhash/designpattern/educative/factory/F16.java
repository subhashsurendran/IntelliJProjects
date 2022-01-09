package com.subhash.designpattern.educative.factory;

public class F16 {

    IEngine engine;
    ICockpit cockpit;

    protected F16 makeF16(){
        engine = new F16Engine();
        engine.buildEngine();
        cockpit = new F16Cockpit();
        cockpit.buildCockpit();
        return this;
    }
    public void taxi(){
        System.out.println("F16 Taxing");
    }

    public void fly(){
        F16 f16 = makeF16();
        f16.taxi();
        System.out.println("F16 flying");
    }
}
