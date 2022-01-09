package com.subhash.designpattern.abfplearn;

public class BoxBasedShapeAbfp extends ShapeAbfpAbstract{
    @Override
    ShapeAbfp getFactory(String shape) {
        if(shape.equals("RECTANGLE")){
            return new RectangleAbfp();
        }else if(shape.equals("SQUARE")){
            return new SquareShapeAbfp();
        }else{
            return null;
        }
    }
}
