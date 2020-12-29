package com.subhash.doSelect;

public class MainFile {
}

class Point{

    int x;
    int y;

    public int Point(int x, int y){
        this.x=x;
        this.y=y;
        return x+y;
    }

    public Point(){

    }

}
class Quadrilateral extends Triangle{
    int p4;

    public Quadrilateral(int p1, int p2, int p3, int p4){
        this.p4=p4;
        super.p1=p1;
        super.p2=p2;
        super.p3=p3;
    }
    public Quadrilateral(){

    }

    @Override
    public double getArea(){

        return super.getArea();

    }

}
class Triangle extends Point{

    int p1, p2, p3;

    public Triangle(int p1, int p2, int p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    public Triangle(){

    }

    public double getArea(){

        return p1*p2*p3/3;

    }

}
