package com.main.LinkList;

public class LinkListMain {

    public static void main(String[] args) {
	DoublyLinkedList theList = new DoublyLinkedList();

	theList.insertFirst(22);
	theList.insertFirst(44);
	theList.insertFirst(66);

	theList.insertLast(11);
	theList.insertLast(33);
	theList.insertLast(55);

	System.out.println(theList);

	theList.deleteFirst();
	theList.deleteLast();
	theList.deleteKey(11);

	System.out.println(theList);

	theList.insertAfter(22, 77);
	theList.insertAfter(33, 88);

	System.out.println(theList);
	
	int N = theList.getNth(3);
	System.out.println(N);
    }
}
