package com.subhash.singleton;

public enum SupermanEnum {

    INSTANCE;

    private String firstName = "Clark";
    private String lastName = "Kent";
    public void fly(){
        System.out.println("I'm flying");
    }
}
