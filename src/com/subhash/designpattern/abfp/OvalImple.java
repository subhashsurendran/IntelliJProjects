package com.subhash.designpattern.abfp;

import com.subhash.designpattern.factoryPattern.Shape;

public class OvalImple implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Oval Implementation");
    }
}
