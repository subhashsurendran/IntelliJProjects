package com.subhash.designpattern.abfp;

import com.subhash.designpattern.factoryPattern.Shape;

public class RectangleImple implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Rectangle implementation");
    }
}
