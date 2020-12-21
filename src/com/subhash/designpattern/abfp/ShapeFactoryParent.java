package com.subhash.designpattern.abfp;

public class ShapeFactoryParent {

   public AbstractShapeFactory getFactory(boolean isCircular){
       if(isCircular){
           return new AllRoundedShapeFactory();
       }else{
           return new AllRectangleShapeFactory();
       }
   }
}
