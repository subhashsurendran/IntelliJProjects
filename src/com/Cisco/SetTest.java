package com.Cisco;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        Set x= new TreeSet();
        x.add(2);
        x.add(3);
        x.add(1);

        Iterator iterator = x.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next()+"");
        }
    }


}
