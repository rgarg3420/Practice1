package com.main.collections;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

class  HashSetTest<K,V> {
	Hashtable<K, V> hashTable = new Hashtable<>();
    public static void main(String args[]) {

	HashSet<String> al = new HashSet<String>();
	al.add("Ravi");
	al.add("Vijay");
	al.add("Ravi");
	al.add("Ajay");
	al.add("Ajay");
	al.add(null);

	Iterator<String> itr = al.iterator();
	while (itr.hasNext()) {
	    System.out.println(itr.next());
	}
	
	
}
}