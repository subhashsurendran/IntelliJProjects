package com.subhash.hashsetImpl;

public class Entry<E> {

    // instance variables
    private E key;
    private Entry<E> next;

    public E getKey() {
        return key;
    }
    public void setKey(E key) {
        this.key = key;
    }

    public Entry<E> getNext() {
        return next;
    }
    public void setNext(Entry<E> next) {
        this.next = next;
    }

}