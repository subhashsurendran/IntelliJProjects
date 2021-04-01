package com.subhash.maps;

import java.util.HashSet;

public class WrappedString {

    private String s;
    public WrappedString(String s){
        this.s=s;
    }

    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();
        WrappedString ws1= new WrappedString("aardvark");
        WrappedString ws2 = new WrappedString("aardvark");
        String s1 = new String("aardvark");
        String s2 = new String("aardvark");

      //  hs.add(ws1);
        //hs.add(ws2);
        //hs.add(s1);
        //hs.add(s2);

        String s ="abcd";
        String snew=new String("abcd");
        String s2new = "abcd";
        String s3 = new String("abcd").intern();

        hs.add(s);
        hs.add(snew);
        hs.add(s2new);
        hs.add(s3);

        System.out.println(hs.size());
    }
}
