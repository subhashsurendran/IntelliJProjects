package com.techgig;


public class Question3 {
    public static void main(String[] args) {
        B obj2=new B();
        obj2.i=1;
        obj2.j=2;
        C r;
        r = obj2;
        r.display();
    }
}

class C{
    int i;
    public void display(){
        System.out.println(i);
    }

}

class B extends C{
    int j;


    public void display() {
        System.out.println(j);
    }
}