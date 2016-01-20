package com.main.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class SyncMap {

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	hmap.put(2, "Anil");
	hmap.put(33, "Ajit");
	hmap.put(1, "Brad");
	hmap.put(4, "Sachin");
	hmap.put(55, "XYZ");

	Map<Integer, String> map = Collections.synchronizedMap(hmap);
	Set<Entry<Integer, String>> set = map.entrySet();
	synchronized (map) {
	    Iterator i = set.iterator();
	    // Display elements
	    while (i.hasNext()) {
		Map.Entry me = (Map.Entry) i.next();
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
		Integer key = (Integer) me.getKey();

	    }
	}

	ConcurrentNavigableMap concurrentSkipListMap = new ConcurrentSkipListMap();
	concurrentSkipListMap.put("3", "Apple");
	concurrentSkipListMap.put("2", "Ball");
	concurrentSkipListMap.put("1", "Car");
	concurrentSkipListMap.put("5", "Doll");
	concurrentSkipListMap.put("4", "Elephant");

	Iterator<String> itr0002 = concurrentSkipListMap.keySet().iterator();

	while (itr0002.hasNext()) {
	    String s = (String) itr0002.next();
	    System.out.println("Key :" + s);
	}

	System.out.println("ceilingEntry-2: " + concurrentSkipListMap.ceilingEntry("2"));
	NavigableSet navigableSet = concurrentSkipListMap.descendingKeySet();
	System.out.println("descendingKeySet: ");
	Iterator itr = navigableSet.iterator();
	while (itr.hasNext()) {
	    String s = (String) itr.next();
	    System.out.println(s);
	}
	System.out.println("firstEntry: " + concurrentSkipListMap.firstEntry());
	System.out.println("lastEntry: " + concurrentSkipListMap.lastEntry());
	System.out.println("pollFirstEntry: " + concurrentSkipListMap.pollFirstEntry());
	System.out.println("now firstEntry: " + concurrentSkipListMap.firstEntry());
	System.out.println("pollLastEntry: " + concurrentSkipListMap.pollLastEntry());
	System.out.println("now lastEntry: " + concurrentSkipListMap.lastEntry());

	Iterator<String> itr001 = concurrentSkipListMap.keySet().iterator();

	while (itr001.hasNext()) {
	    String key = itr001.next();
	    if (Integer.valueOf(key) % 2 == 0) {
		concurrentSkipListMap.remove(key);
	    } else {
		System.out.println("skip value :" + concurrentSkipListMap.get(key));
	    }
	}

	ConcurrentHashMap<Integer, Integer> concMap = new ConcurrentHashMap<Integer, Integer>();

	HashMap<Integer, Integer> hsMap = new HashMap<Integer, Integer>();

	for (int i = 0; i < 10; i++) {
	    concMap.put(i, i * 10);
	    hsMap.put(i, i + 10);
	}

	Iterator<Entry<Integer, Integer>> it10 = concMap.entrySet().iterator();

	while (it10.hasNext()) {

	    Entry<Integer, Integer> entry = it10.next();
	    if (entry.getKey() % 2 == 0) {
		concMap.remove(entry.getKey());
	    } else {
		System.out.println("Value of conc hashmap :" + entry.getValue());
	    }
	}

	Map<Integer, Integer> newMap = Collections.synchronizedMap(hsMap);
	synchronized (newMap) {
	    Iterator<Entry<Integer, Integer>> it11 = newMap.entrySet().iterator();
	    while (it11.hasNext()) {

		Integer key = it11.next().getKey();
		if (key % 2 == 0) {
		    newMap.remove(key);
		} else {
		    System.out.println("Value of hash map :" + newMap.get(key));
		}
	    }
	}

    }
}
