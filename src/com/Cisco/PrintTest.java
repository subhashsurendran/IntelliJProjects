package com.Cisco;

public class PrintTest {

    PrintTest(){
        System.out.println("Print1");
    }

    public void testMethod(){
        System.out.println("Print2");
    }
    {
        System.out.println("Print3");
    }
    public void PrintTest(){
        System.out.println("Print4");
    }
    static{
        System.out.println("Print5");
    }

    public static void main(String[] args) {
        PrintTest test1 = new PrintTest();
        test1.PrintTest();
        test1.testMethod();
    }
}
