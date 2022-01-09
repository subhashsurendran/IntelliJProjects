package com.subhash.codinggame;

class Parent
{
    final public int calc(int a, int b) { return 1; }

    int x;
}
class Child extends Parent
{
  public Child(int x ){
      super.x=x;

  }
}
public class Writeout
{
    public static void main(String args[])
    {
        Child c = new Child(5);
        System.out.print("c is:" + c.calc(0,1));
    }
}