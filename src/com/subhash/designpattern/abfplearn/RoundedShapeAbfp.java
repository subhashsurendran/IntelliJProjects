package com.subhash.designpattern.abfplearn;

public class RoundedShapeAbfp extends ShapeAbfpAbstract{
    @Override
    ShapeAbfp getFactory(String shape) {

        if(shape.equals("CIRCLE")){
            return new CircleShapeAbfp();
        }else if(shape.equals("OVAL")){
            return new OvalAbdfp();
        }else {
            return null;
        }
    }
}
