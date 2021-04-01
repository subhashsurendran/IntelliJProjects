package com.blackhawk;

import java.util.Iterator;

public interface SimpleHashSet {

    public boolean add(Object element);
    public boolean remove(Object element);
    public int size();
    public Iterator iterator();
    public boolean contains(Object element);
}
