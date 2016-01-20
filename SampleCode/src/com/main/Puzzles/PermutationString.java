package com.main.Puzzles;

/* All possible permutation of string */
import java.util.*;
import java.lang.*;
import java.io.*;

public class PermutationString {
	static int count = 1;
	public static void main(String[] args) {

		/* Name of the class has to be "Main" only if the class is public. */
	
			
			     
				char[] input = "abcd".toCharArray();
				int length = input.length;
				permute(input, 0, length);
			}
			public static void permute(char[] input, int index, int n) {
				
				if(index == n) {
					System.out.println(count++);
					System.out.println(input);
					return;
				} else {
					for(int i=index; i<n; i++) {
						swap(input, index, i);
						permute(input, index + 1, n);
						swap(input, index, i);
					}
				}
			}
			public static void swap(char[] arr, int i, int j) {
				char t;
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
	
	
}
