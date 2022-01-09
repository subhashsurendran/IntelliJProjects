package com.subhash.designpattern.abfplearn;

import java.util.*;

public class MasterFactoryDriver {

    public static void main(String[] args) {
        MasterFactory x = new MasterFactory();
        ShapeAbfpAbstract abstractFactory = x.getAbstractFactory(false);
        ShapeAbfp circle = abstractFactory.getFactory("RECTANGLE");
        circle.draw();

        Hashtable<String, String> hashtable = new Hashtable<>();

        HashMap<String, String> hashmap  = new HashMap<>();
        hashmap.put("Key1", "Chaitanya");
        hashmap.put("Key2","Ajeet");
        hashmap.put("Key3","Peter");
        hashmap.put("Key4","Ricky");
        hashmap.put("Key5","Mona");
        hashmap.put("Key5","ss");
        hashmap.put("XX", null);

        /*Iterator iterator = hashmap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry pair = (Map.Entry)iterator.next();
            System.out.println(pair.getKey() + " "+ pair.getValue());
        }*/



        hashtable.put("Key1", "Chaitanya");
        hashtable.put("Key2","Ajeet");
        hashtable.put("Key3","Peter");
        hashtable.put("Key4","Ricky");
        hashtable.put("Key5","Mona");
        hashtable.put("Key6","ss");
        hashtable.put("Key8",null);

        Enumeration names;
        names = hashtable.keys();
        String key;
        while(names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +
                    hashtable.get(key));
        }

    }
}
