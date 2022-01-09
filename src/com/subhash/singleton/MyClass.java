package com.subhash.singleton;

public class MyClass {
    public static void main(String[] args) {
        SupermanEnum x = SupermanEnum.INSTANCE;
        x.fly();
    }
}
