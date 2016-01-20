package com.main.LinkList;

public class Node {
	
Node next;
Object data;

Node(Object dataValue){
	
	data= dataValue;
	next = null;
}

Node(Object dataValue, Node nextValue){
	data = dataValue;
	next = nextValue;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}

public Object getData() {
	return data;
}

public void setData(Object data) {
	this.data = data;
}




}
