package com.main.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MainClass<T> {

    public static <T> void main(String s[]) {

	LinkedList<Object> ll = new LinkedList<Object>();
	Object ob1 = new Object();
	ll.add(ob1);

	List<Object> ar = (List<Object>) new ArrayList<T>();
	Collections.addAll(ar, "Head", 1, "Tail", 2, "middle", 3, "Hello", 4, "bye", 5);

	Iterator<T> itr = (Iterator<T>) ar.iterator();
	Iterator<T> itrrota = (Iterator<T>) ar.iterator();

	while (itr.hasNext()) {
	    System.out.println("Iteration: " + itr.next());
	}

	Collections.rotate(ar, -2);

	while (itrrota.hasNext()) {
	    System.out.println("Iteration after rotation: " + itrrota.next());
	}

	HashMap<String, String> map = new HashMap<String, String>();

	map.put("1", "OneOne");
	map.put("2", "TwoTwo");
	map.put("3", "ThreeThree");
	map.put("4", "FourFour");
	map.put("5", "FiveFive");
	map.put("6", "FiveFive");
	map.put("7", "FiveFive");
	map.put("7", "SevenSeven");
	map.put("8", null);
	map.put(null, null);
	
	System.out.println("MAP VALUE");
for(Entry<String, String> entry :map.entrySet()){
	System.out.println(entry.getKey()+" : "+entry.getValue());
}
	
	HashMap<String, String> map2 = new HashMap<String, String>();
	map2.putAll(map);

/*	Iterator<String> itr2 = map.keySet().iterator();

	while (itr2.hasNext()) {

	    String key = itr2.next();
	    System.out.println("Key :" + key + " Value :" + map.get(key));
	}

	TreeMap<String, String> treeMap = new TreeMap<String, String>(map2);

	Iterator<Entry<String, String>> itr3 = treeMap.entrySet().iterator();

	while (itr3.hasNext()) {

	    Entry entry = itr3.next();
	    System.out.println("Treemap : key -->" + entry.getKey() + " value -->" + entry.getValue());
	}
*/
	HashSet<String> hSet = new HashSet<String>(map.keySet());

	Iterator<String> it5 = hSet.iterator();

	while (it5.hasNext()) {
	    String key = it5.next();

	    System.out.println("HashSet key -->" + key);

	}

	for (Object st : ar) {
	    System.out.println("before Value : " + st);
	}

	Collections.shuffle(ar);

	for (Object st : ar) {
	    System.out.println("after Shuffle : " + st);
	}

	List<String> star = new ArrayList<String>();
	star.add("CD");
	star.add("EF");
	star.add("AC");
	star.add("AD");

	Set<String> strSet = new HashSet<String>(star);

	for (String str : strSet) {
	    System.out.println("SET Value:" + str);
	}

	Collections.sort(star);

	for (Object st : star) {
	    System.out.println("before Value : " + st);
	}

	ar.add(2, "two");
	ar.add(3, "three");
	ar.add(5, "five");

	for (Object st : ar) {
	    System.out.println("after Value : " + st);
	}

	for (int i = 0; i < ar.size(); i++) {
	    System.out.println("Value ## : " + ar.get(i));
	}

	MainClass.addElement(ll);

	LinkedList<String> linkList = new LinkedList<String>();
	linkList.add("String1");
	linkList.add("String2");
	linkList.add("String3");
	linkList.add("String4");
	linkList.add("String5");
	linkList.add("String6");

	System.out.println("Linke list element : " + linkList.get(2));

	ArrayList<String> arrayList = new ArrayList<String>();
	int pos = Collections.binarySearch(linkList, "String6");
	System.out.println("Position :" + pos);

	Hashtable<String, String> hashTable = new Hashtable<String, String>();
	hashTable.put("one", "One One");
	hashTable.put("two", "One two");
	hashTable.put("three", "One three");
	hashTable.put("one", "One One");
	hashTable.put("four", "One four");

	System.out.println("Size of hash table : " + hashTable.size());

	Iterator<T> itrTable = (Iterator<T>) hashTable.keySet().iterator();
	while (itrTable.hasNext()) {
	    System.out.println("Values :" + hashTable.get(itrTable.next()));
	}

	MainClass<T> types = new MainClass<T>();

    }

    private static void addElement(LinkedList<Object> ll) {

	Object o2 = new Object();
	ll.add(o2);

    }

}
