package com.main.LinkList;

public class LinkList {
	
private Node head;
private int listSize;

// initializing linkList. 
//The first node is created with no value , size is 0.
LinkList(){
	head = new Node(null);
	listSize = 0;
	
}

//Add node to the end of the list , with value as data
/**
 * @param data
 */
public void add(Object data){

// creating node to be added.	
Node temp = new Node(data);  
/* first node in the list, if first element is to be added , the temp value is assigned to this.*/
Node current = head;   
	
//iterate over the list to reach the end.
while(current.getNext()!= null){
	current = current.getNext();
}

//when the current node's next is null, we set the new value to that next node.
current.setNext(temp);

//increasing the size of the list after adding node
listSize++;
}

public void add(Object data, int index){
	
//setting value in temp Node, setting current node as head.
Node temp = new Node(data);
Node current = head;
int i = 1;

//iterate till index node and next node should not be null
while(current.getNext()!= null &&  i<index){	
current = current.getNext();
i++;	
}

//make next node of current as next node of temp
temp.setNext(current.getNext());                    //current-->next as current-->temp-->next
// set next node of current as temp 
current.setNext(temp);

//increament list size
listSize++;	
}

//get the data of node at position index
public Object get(int index){

//validate index
	if(index<=0){
		return null;
	}
	
	Node current = head ;
	int i =1 ;
	
	// iterate to the index node.
	while(current.getNext()!= null && i< index){	
		current = current.getNext();
		i++;	
	}
	// return the node value.
	return current.getNext().getData();
}

public int size(){
	return listSize;
}

public boolean remove(int index){
	
//validate index 
if(index<=0 || index>size()){
	return false;
}

Node current = head;
int i =  1;
//iterate to index position .
while(i< index){
	//if next node is null , return false;
if(current.getNext()==null){
	return false;
}
//reach to index node.
current = current.getNext();
	i++;	
}
// current-->node-->next to current-->next. link to node is removed 
current.setNext(current.getNext().getNext());

//decrease size of list
listSize--;
return true;	
}

public void print(){
	Node current = head;
	String output = "";
	for(int i = 0 ; i<listSize && current.getNext()!=null; i++){
		current = current.getNext();
		output = output+ current.getData().toString()+",";
		
	}
	System.out.println(output);
}


public void reverseLinkedList(){
	
	if (head == null) {
        return;
    }
    Node current = head;
    Node after = head.next;
    while (after != null) {
        Node tmp = after.next; // preserve what will come later.
        after.next = current;  // reverse the pointer
        current = after;       // advance the cursor
        after = tmp;   
       
        // the node after is the one preserved earlier.
    }
    head.next = null;         // null-out next on what was the start element 
    head = current;// move the start to what was the end.
    String output = "";
	for(int i = 0 ; i<listSize && head.getNext()!=null; i++){
		output =  output+head.getData().toString()+",";
		head = head.getNext();
		
		
	}
	System.out.println(output);
}



public static void main(String s[]){
	
LinkList ll = new LinkList();

ll.add(1);
ll.add(2);
ll.add(3);
ll.add(4);
System.out.println("Size: "+ll.size());
ll.print();
ll.add(5, 3);
ll.add(6, 2);
System.out.println("New Size: "+ll.size());
ll.print();
ll.remove(3);
System.out.println("After delete Size: "+ll.size());
ll.print();

ll.reverseLinkedList();
}





}
