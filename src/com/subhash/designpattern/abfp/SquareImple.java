package com.subhash.designpattern.abfp;

import com.subhash.designpattern.factoryPattern.Shape;

public class SquareImple implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Square Implementation");
    }
}
