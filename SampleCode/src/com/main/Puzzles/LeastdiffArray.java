package com.main.Puzzles;

import java.util.Scanner;

//Second Approach
/*1. Divide the array into two sets 
2. sort the sets. 
3. compute sum and find the closest number to the difference using binary search (lower bound) and move it to the other set. 
4. Repeat until the difference remains constant 
5. should converge really quick*/

public class LeastdiffArray {

	 static Integer[] intArray ;
	public static void main(String[] args) {
		
	 
		System.out.println("Enter the number of elements for the array:");
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		
		 intArray = new Integer[size];
		
		System.out.println("Enter the number of elements for the array:");
		
		Scanner inputArray = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		
		while( i <size){
			intArray[i] = inputArray.nextInt();
			sum = sum +intArray[i];
			i++;
		}
		input.close();
		inputArray.close();
		System.out.println("The sum is :"+sum);
		
		/*System.out.println("Before sorting: ");
		for(int val :intArray){
			System.out.println(val);
		}*/

		// sort in descending order.
		sortDecending(0,size-1);
		/*System.out.println("After sorting: ");
		for(int val :intArray){
			System.out.println(val);
		}
*/      int min = Integer.MAX_VALUE;
		int k = 0;
		int diff= 0;
		
		
		do{
			int sum2 = 0;
		for(int count =0;count<k+1;count++ ){
			sum2 = sum2 + intArray[count];
		}
		
		int sum1 = 0;
		for(int count =k+1;count<=size-1;count++ ){
			sum1 = sum1 + intArray[count];
		}
		
		diff = sum1 - sum2;	
			if(diff<min && diff>=0){
				min = diff;
				k++;
			}
		}while(diff>=0);
		
		Integer[] subArray1 = new Integer[k];
		System.out.println("Sub array 1 ");
		for(int j = 0 ; j<k;j++){
			subArray1[j] = intArray[j];
			System.out.println(subArray1[j]);
		}
		Integer[] subArray2 = new Integer[size-(k-1)];
		System.out.println("Sub array 2 ");
		for(int j = k ; j<=size-1;j++){
			subArray2[j] = intArray[j];
			System.out.println(subArray2[j]);
		}
		
		// REST LOGIC to be written 
		//1. pick one element at a time from end of the subarray2 and add to sum1, if diff is greater than initial ,continue else
		// set element in subarray1 and set index of that element in sub array as null.
		//2 .keep doing this till diff is minimum, break when the diff starts increasing and the element being tested is greater than 0.
		
		
		
		
	}
	private static void sortDecending(int low, int high) {
		
		int i = low;
		int j = high;
		// getting pivot element 
		int mid = i+(j-i)/2;
		
		while(i<=j){
			
		while(intArray[i]>intArray[mid]){
			i++;
		}
			
		while(intArray[j]<intArray[mid]){
			j--;
		}
		
		if(i<=j){
			swap(i,j);
			i++;
			j--;
		}
		
		if(low<j){
			sortDecending(low,j);
		}
		if(i<high){
			sortDecending(i,high);
		}
		
		}
		
	}
	private static void swap(int i, int j) {
		int temp = intArray[i];
		intArray[i]= intArray[j];
		intArray[j]= temp;
		
	}

}
