package com.main.Puzzles;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {

  String str = "Hello rohit";
  char[] charArray = str.toCharArray();
  reverse(charArray);
	}

	private static void reverse(char[] charArray) {
		String reverse = "";
		Stack<Character> stk = new Stack<Character>();
		for(char c : charArray){
			stk.push(c);
		}
		
		while(!stk.isEmpty()){
			reverse = reverse+ stk.pop().toString();
		}
		System.out.println("Reverse :"+ reverse);
		
		
	}

}
