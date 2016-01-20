package com.main.Puzzles;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import com.main.Puzzles.Numbers.direction;

public class NextNumber {
	
	static ArrayList<Integer> intArray = new ArrayList<Integer>();
	static ArrayList<Integer> intArrayNew = new ArrayList<Integer>();
	public static void main(String[] args) {

// Remember : scanner(System.in).
		Scanner input = new Scanner(System.in);
			Integer number = input.nextInt();
		System.out.println("The number is :"+ number);
		Integer numberNew = number;
		
		
//--------------------------------------TESTING START---------------------------//		
// One way of converting integer into array of integer.		
		while(number>0){
		
			intArray.add(number%10);
			number = number/10;
		
		}
		Stack<Integer> st = new Stack<Integer>();
		for(Integer i : intArray){
			st.add(i);
			//System.out.println(i);
		}
		intArray.clear();
		while(!st.isEmpty()){
			intArray.add(st.pop());
		}
		/*System.out.println("First way ------------------");
		for(Integer i : intArray){
			
			System.out.println(i);
		}*/
		
// Second way of converting integer into integer array.
	System.out.println("Second way------------------");	
		String temp = numberNew.toString();
		int length = temp.length();
		int i = 0;
		while(i<length){
			intArrayNew.add(temp.charAt(i)-'0');
			i++;
		}
		
		for(Integer j : intArrayNew){
			
			System.out.println(j);
		}
//---------------------------TESTING END------------------------------//		
		// Array formed -------------further processing consider intArrayNew.
		//NextNumber n = new NextNumber();
		//n.methodCall();
		
		getNumber(intArrayNew);
		
		/*System.out.println("fianlly  after: ");
		 for(int itr :intArrayNew) {
			 System.out.println(itr);
		 }*/

		 
		 
	}

	
	private static void getNumber(ArrayList<Integer> numberArray) {
		int minimumIndex = 0;
		int maximumIndex = numberArray.size()-1;
		
		 int minIndex = minValueIndex(maximumIndex,minimumIndex );
		  
		// System.out.println("Min value found : "+ numberArray.get(minIndex) + " At index : "+minIndex);
		 
		 int secondMinIndex = minValueIndexSecond(minIndex+1 ,maximumIndex);
		
		// System.out.println("Min value found second time : "+ numberArray.get(secondMinIndex)+ " At index : "+secondMinIndex);
		
		 swapdata(minIndex,secondMinIndex);
		 
		 System.out.println("after swap : ");
		 for(int itr :intArrayNew) {
			 System.out.println(itr);
		 }
		 
		 
		 if(intArrayNew!=null && intArrayNew.size()>1){
		 quickSort(minIndex+1,maximumIndex );
		 }
		 
		 System.out.println("after sort : ");
		 for(int itr :intArrayNew) {
			 System.out.println(itr);
		 }
		 
	}

	private static void quickSort(int start, int end) {
		int pivot = start+(end-start)/2;
		int i = start;
		int j = end;
		
		while(i<=j){
		
		while(intArrayNew.get(i)<intArrayNew.get(pivot)){
			i++;
		}
		
		while(intArrayNew.get(j)>intArrayNew.get(pivot)){
			j--;
		}
		
	if(i<=j){
		swapdata(i,j);
		i++;j--;
	}
		
		}
		if(start<j)
		quickSort(start,j);
		if(i<end){
			quickSort(i,end);
		}
	}


	private static ArrayList<Integer> swapdata( int minIndex,
			int secondMinIndex) {
		
		int a = intArrayNew.get(minIndex);
		int b = intArrayNew.get(secondMinIndex);
		
		a = a+b;
		b= a-b;
		a= a-b;
		intArrayNew.set(minIndex, a);
		intArrayNew.set(secondMinIndex, b);
		return intArrayNew;
		
	}


	private static int minValueIndexSecond(int minimumIndex, int maximumIndex) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = minimumIndex;i<=maximumIndex; i++){
			
			if(intArrayNew.get(i) <= min){
			min = intArrayNew.get(i);
			minIndex = i;
			}
		}
		return minIndex;
	}


	private static int minValueIndex( int first , int last) {
		 int min= Integer.MAX_VALUE;
		int minIndex =0;
		for(int i = first ; i>last;i-- ){
			if(intArrayNew.get(i-1)<intArrayNew.get(i)){
				min = intArrayNew.get(i-1);
				minIndex = i-1;
			break;
			
		}
		}
		
		return minIndex;
	}
//------------------------TESTING METHODn START---------------------------//
	private void methodCall() {
		 int a = 2;
		 int b = 3;
		 Numbers num1 = new Numbers();
		 Numbers num2 = new Numbers();
		 num1.setNum(a);
		 num2.setNum(b);
		 System.out.println("Before :a : "+num1.getNum()+" b : "+num2.getNum());
		
		
		swap(a,b);
		System.out.println("After : a : "+a+" b : "+b);
		System.out.println("---------------------");
		System.out.println("Before :a : "+a+" b : "+b);
		swapNumbers(num1, num2);
		
		 System.out.println("After :a : "+num1.getNum()+" b : "+num2.getNum());
		
	}

	// swapping utility function.Integer do not swap as pass by value
	public  void swap(int a, int b){
		a = a+b;
		b=a-b;
		a = a-b;
		System.out.println("inside :a: "+a+ " b: "+b);
	}
	//object get swapped.
	public  void swapNumbers(Numbers a, Numbers b){
		int a1 = a.getNum();
		int b1 = b.getNum();
		a1 = a1+b1;
		b1=a1-b1;
		a1 = a1-b1;
		System.out.println("inside :a1: "+a1+ " b1: "+b1);
		a.setNum(a1);
		b.setNum(b1);
	}

}

class Numbers{

	int num ;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	enum direction{
		BACKWARD ,
		FORWARD;
	}
//--------------------------------TESTING END------------------------//	
	
}

