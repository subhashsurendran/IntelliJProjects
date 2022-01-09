package com.subhash.designpattern.factoryPattern;

public class ShapeFactory {

    public Shape getShape(String shape){
        if(shape == null ){
            return null;
        }
        else if(shape.equals("CIRCLE")){
            return new CircleShape();
        }
        else{
            return new RectangleShape();
        }
    }
}
