package com.blackhawk;

import java.util.Iterator;

public class SimpleHashSetImpl implements SimpleHashSet{

    private class Entry{
        Object key;
        Entry next;
    }

    private int hashSetsize;
    private Entry[] buckets;

    public SimpleHashSetImpl(int size){
        buckets = new Entry[size];
        hashSetsize=0;
    }

    private int hashCode(int hashCode){
        int hash = hashCode;
        if(hash<0){
            hash =-hash;
        }
        return hash%buckets.length;
    }

    @Override
    public boolean add(Object element) {

        int i = hashCode(element.hashCode());
        Entry current = buckets[i];
        while(current!=null){

            if(current.key.equals(element)){
                return false;
            }
            current = current.next;
        }

        Entry newEntry = new Entry();
        newEntry.key=element;
        newEntry.next =buckets[i];
        buckets[i] = newEntry;
        hashSetsize++;

        return false;
    }

    @Override
    public boolean remove(Object element) {

        int index = hashCode(element.hashCode());
        Entry current = buckets[index];
        Entry previous = null;
        while(current!=null){

            if(current.key.equals(element)){

               if(previous==null){
                   buckets[index] = current.next;
               }else{
                   previous.next= current.next;
               }
               hashSetsize--;
               return  true;
            }
            previous=current;
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return hashSetsize;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean contains(Object element) {


        return false;
    }
}
