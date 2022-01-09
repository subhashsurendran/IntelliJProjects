package com.subhash.designpattern.abfp;

public class AllRectangleShapeFactory extends AbstractShapeFactory{
    @Override
    ShapeInterface getShape(String shapeType) {

        if(shapeType.equals("RECTANGLE")){
            return new RectangleImple();
        }
        else if(shapeType.equals("PARALLELOGRAM")){
            return new PulledRectangle();
        }else if (shapeType.equals("SQUARE")){
            return new SquareImple();
        }else {
            return null;
        }

    }
}
