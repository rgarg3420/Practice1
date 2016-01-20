package com.main.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class  ArrayExample<E>{
	
	LinkedList<E> linkedList = new LinkedList<E>();



static Integer[] intVal = new Integer[11];
public ArrayExample() {
}
List<Integer> aList = new ArrayList<>();

public static void main (String s[]){
int i = 0;
for(;i<10;i++){	
	
	Integer random =  (int) ((Math.random())*10);
	
	intVal[i] = random;
}
intVal[10] = 55;

Arrays.sort(intVal);

for(int ii : intVal){
	System.out.println(ii);
}

int is = Arrays.binarySearch(intVal, 55);
System.out.println("value :"+is);


ArrayExample ae = new ArrayExample<>();
ae.printAllList();

}

@SuppressWarnings("unchecked")
public void printAllList(){

Collections.addAll(aList,33,22,1,44,55,66,3);
Collections.sort(aList);

for(Integer i : aList){
	System.out.print(i+" " );
}
}



Collection<E> coll = new Collection<E>() {

	@Override
	public boolean add(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
};

}
