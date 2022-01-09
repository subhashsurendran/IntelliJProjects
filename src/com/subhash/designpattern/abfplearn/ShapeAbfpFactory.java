package com.subhash.designpattern.abfplearn;

public class ShapeAbfpFactory {

    public ShapeAbfp getShapeAbfp(String shapeType){

        if(shapeType.equals("CIRCLE")){
            return new CircleShapeAbfp();
        }else if(shapeType.equals("SQUARE")){
            return new SquareShapeAbfp();
        }else{
            return null;
        }
    }

}
