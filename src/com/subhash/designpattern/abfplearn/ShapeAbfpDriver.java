package com.subhash.designpattern.abfplearn;

import com.subhash.designpattern.factoryPattern.Shape;

public class ShapeAbfpDriver {
    public static void main(String[] args) {
        ShapeAbfpFactory shapeAbfpFactory = new ShapeAbfpFactory();
        ShapeAbfp circle = shapeAbfpFactory.getShapeAbfp("CIRCLE");
        circle.draw();

    }
}
