package com.subhash.generics;

import java.util.Arrays;

class Demonstration {
    public static void main( String args[] ) {
        String[] strArray = Demonstration.<String>createGenericArray(String.class, 10);
        strArray[1]="Subhash";
        System.out.println(Arrays.toString(strArray));
    }

    @SuppressWarnings("unchecked")
    static <T> T[] createGenericArray(Class<T> type, int size) {

        // Causes an unchecked cast warning
        T[] arr = (T[]) java.lang.reflect.Array.newInstance(type, size);
        return arr;
    }

}