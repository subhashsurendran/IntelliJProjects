package com.Cisco;

public class Main {

    public static void main(String[] args) {

       // ClassB

    }


}

class ClassA{
    ClassA(){
        System.out.println("ClassA constructor with no arguments");
    }

    protected void show(){
        System.out.println("Class A show method");
    }
    public static void methodA(){
        System.out.println("Class A method");
    }
}

class ClassB extends ClassA{
ClassB(){
    System.out.println("ClassB constructor with no arguments");
    //super();
}
public void show(){
    System.out.println("Class B show method");
    super.show();
}

public static void methodA(){
    System.out.println("ClassB method");
}


}

