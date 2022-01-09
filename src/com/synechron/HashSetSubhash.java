package com.synechron;

import java.util.Arrays;
import java.util.Iterator;

public class HashSetSubhash implements HashSetSubhashInterface{

    private static class Entry{
        Entry next;
        Object key;
    }

    private Entry [] buckets;
    private int size;

    public HashSetSubhash(int capacity){
        this.size = capacity;
        buckets = new Entry[size];
    }

    public int hashCode(int hashCodeVal){

        int index = hashCodeVal;
        if(index<0){
            index = -index;
        }
        return index%buckets.length;
    }

    @Override
    public boolean add(Object element) {

        int hash = hashCode(element.hashCode());
        Entry current = buckets[hash];

        while(current!=null){
            if(current.key.equals(element)){
                return false;
            }
            current = current.next;
        }

        Entry entry = new Entry();
        entry.key = element;
        entry.next = buckets[hash];
        buckets[hash] = entry;
        size++;
        return true;

    }

    @Override
    public boolean remove(Object element) {

        int hash = hashCode(element.hashCode());
        Entry current = buckets[hash];
        Entry previous = null;

        while(current!=null){

            if(current.key.equals(element)){

                if(previous == null){
                    buckets[hash] = current.next;

                }else{
                    previous.next = current.next;

                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "HashSetSubhash{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean contains(Object element) {

        int hash = hashCode(element.hashCode());
        Entry current = buckets[hash];

        while(current!=null){
            if(current.key.equals(element)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new SimpleHashSetIterator();
    }


    private class SimpleHashSetIterator implements Iterator {

        private int currentBucket;
        private int previousBucket;
        private Entry currentEntry;
        private Entry previousEntry;

        public SimpleHashSetIterator(){
            currentEntry = null;
            previousEntry = null;
            currentBucket=-1;
            previousBucket=-1;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
