package com.synechron;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyTest {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        Map<Integer, String> map3 = new HashMap<>();
        Map<Integer, String> map4 = new HashMap<>();

        map1.put(1,"Subhash");
        map2.put(2,"Subhash2");
        map2.put(1,"Subhash1");
        map3.put(2,"Subhash1");
        map3.put(3,"Subhash3map4");
        map4.put(4,"Subhash");
        map4.put(3,"Subhash3map4");
        boolean returnFlag = false;
        for(Map.Entry<Integer, String> entry : map1.entrySet()){

            if(map2.containsKey(entry.getKey())){
                for(Map.Entry<Integer, String> map2Entry : map2.entrySet()){
                    if(map3.containsKey(map2Entry.getKey())){
                        for(Map.Entry<Integer, String> map3Entry : map3.entrySet()){
                            if(map4.containsKey(map3Entry.getKey())){
                                    returnFlag=true;
                                System.out.println("Return flag set to true");
                            }
                        }
                    }
                }
            }
        }
        System.out.println(returnFlag);

    }

}
