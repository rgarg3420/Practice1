package com.main.Puzzles;

import java.util.LinkedList;
import java.util.List;

public class UniqueBillionArray {

	public static void main(String[] args) {
		int[] data = {1,1,1,1,1,1,1,1,1,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5,12,40,55,55,55,55,55,55,55,55,55,55,55
				,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,99,99,99,99,99,99,99,99,99,99,99,99,111,111,111,111,111,111,111,111,111,111,111,111,111,111};
		List<Integer>result =  findUniqueNumbers(data);
		
		for(Integer i :result){
			System.out.println(i);
		}
	}
	
	public static List<Integer> findUniqueNumbers(int[] data) {
	    List<Integer> result = new LinkedList<Integer>();
	    findUniqueNumbers(data, 0, data.length - 1, result, false);
	    return result;
	}

	private static void findUniqueNumbers(int[] data, int i1, int i2, List<Integer> result, boolean skipFirst) {

	    int a = data[i1];
	    int b = data[i2];

	    // homogenous sequence a...a
	    if (a == b) {
	        if (!skipFirst) {
	            result.add(a);
	        }
	    }
	    else {
	        //divide & conquer
	        int i3 = (i1 + i2) / 2;
	        findUniqueNumbers(data, i1, i3, result, skipFirst);
	        findUniqueNumbers(data, i3 + 1, i2, result, data[i3] == data[i3 + 1]);
	    }
	    
	    
	    
	}

}
