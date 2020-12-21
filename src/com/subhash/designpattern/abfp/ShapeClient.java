package com.subhash.designpattern.abfp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ShapeClient {

    public static void main(String[] args) {

        ShapeFactoryParent shapeFactoryParent = new ShapeFactoryParent();
        AbstractShapeFactory shapeType = shapeFactoryParent.getFactory(false);
        ShapeInterface rectangle = shapeType.getShape("RECTANGLE");
        rectangle.draw();

        AbstractShapeFactory factory = shapeFactoryParent.getFactory(true);
        ShapeInterface oval = factory.getShape("OVAL");
        oval.draw();

        ExecutorService location = Executors.newFixedThreadPool(5);

    }
}
