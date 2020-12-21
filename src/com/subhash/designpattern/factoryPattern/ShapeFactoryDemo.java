package com.subhash.designpattern.factoryPattern;

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}
