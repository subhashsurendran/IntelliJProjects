package com.subhash.designpattern.abfplearn;

import javax.swing.*;

public class MasterFactory {

    ShapeAbfpAbstract getAbstractFactory(boolean isCircular){
        if(isCircular){
            return new RoundedShapeAbfp();
        }else{
            return new BoxBasedShapeAbfp();
        }
    }
}
