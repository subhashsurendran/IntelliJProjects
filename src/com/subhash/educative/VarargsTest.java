package com.subhash.educative;

public class VarargsTest {

    public static void main(String[] args) {

        VarargsTest varargsTest = new VarargsTest();
        varargsTest.addChildrenNames();
        varargsTest.addChildrenNames("Subhash");
        varargsTest.addChildrenNames("Example", "Contains");
    }

    public void addChildrenNames(String... names){
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
