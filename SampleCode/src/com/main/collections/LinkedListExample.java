package com.main.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String args[]) {

	int pos = 3;// Integer.valueOf(args[0]);
	int temp = 0;

	LinkedList<Integer> ll = new LinkedList<Integer>();

	for (int i = 1; i <= 10; i++) {
	    ll.add(i);
	}

	int listLength = ll.size();

	int headElement = ll.get(pos - 1);
	int tailElement = ll.get((listLength) - pos);

	System.out.println("head :" + headElement + " tail :" + tailElement);

	temp = headElement;
	headElement = tailElement;
	tailElement = temp;

	ll.set(pos - 1, headElement);
	ll.set((listLength) - pos, tailElement);

	for (int i = 0; i <= ll.size() - 1; i++) {
	    System.out.print(ll.get(i) + " --> ");
	}

	LinkedList<Integer> cloneList = (LinkedList<Integer>) ll.clone();
	System.out.println("\n");
	for (Integer element : cloneList) {
	    System.out.print(element + "-->");
	}

	Iterator<Integer> reverseIt = cloneList.descendingIterator();
	System.out.println("\n" + "Reverse order :");
	while (reverseIt.hasNext()) {
	    System.out.print(reverseIt.next() + " -->");
	}
	System.out.println("\n" + "naturally sorted order :");
	Collections.sort(cloneList);
	for (Integer element : cloneList) {
	    System.out.print(element + "-->");
	}
	System.out.println("\n" + "Iterate form given index: ");
	ListIterator<Integer> listIt = cloneList.listIterator(2);
	while (listIt.hasNext()) {
	    System.out.print(listIt.next() + " -->");
	}

	int lastOccurance = cloneList.lastIndexOf(8);
	System.out.println("\n" + "Last occurance of 8 is :" + lastOccurance);
    }

}
