package com.subhash.maps;

public class GenericTest<T> {

    private T t;
    public void set(T t){
        this.t=t;
    }
    public T get() {
        return t;
    }

    public <U> void inspect(U u){
        System.out.println("T: "+ t.getClass().getName());
        System.out.println("U: "+ u.getClass().getName());
    }

    public static void main(String[] args) {
        GenericTest<Integer> integerBox = new GenericTest<>();
        integerBox.set(10);
        integerBox.inspect(2);


       // ()->{};
        
    }
}
