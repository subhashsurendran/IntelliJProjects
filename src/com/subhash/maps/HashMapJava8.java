package com.subhash.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapJava8 {

    public static void main(String[] args) {

        Map<String, String> hash  = new HashMap<>();
        hash.put("S", "subhash");
        hash.put("V","viveka");

        Map<String, String> map  = new HashMap<>();
        map.put("C", "c");
        map.put("B", "b");
        map.put("Z", "z");

        HashMapJava8 hashMapJava8 = new HashMapJava8();
        //hashMapJava8.forEach(hash);-
        //hashMapJava8.getorGetDefault(hash);
        hashMapJava8.sortMap(map);
    }

    public void forEach(Map<String,String> hashmap){
        Map<String, String> mapVal = hashmap;
        mapVal.forEach((k, v) -> System.out.println("Key is " + k + " Value is " + v));

    }

    public void getorGetDefault(Map<String, String> hashmap){

        Map<String, String> mapVal = hashmap;
        System.out.println(mapVal.getOrDefault("X","Default"));
    }

    public void sortMap(Map<String, String> map){
        List<Map.Entry<String, String>> sortedByKey = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList());
        sortedByKey.forEach(System.out::println);

    }
}
