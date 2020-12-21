package com.subhash.designpattern.abfp;

public class AllRoundedShapeFactory extends AbstractShapeFactory{
    @Override
    ShapeInterface getShape(String shapeType) {
        if(shapeType.equals("CIRCLE")){
            return new CircleImple();
        }else if(shapeType.equals("OVAL")){
            return new OvalImple();
        }else{
            return null;
        }
    }
}
