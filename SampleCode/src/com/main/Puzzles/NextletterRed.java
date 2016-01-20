package com.main.Puzzles;

import java.util.Scanner;

public class NextletterRed {

	public static void main(String[] args) {
		System.out.println("Input string");
		Scanner scanner = new Scanner(System.in);
		String data = scanner.next();
		System.out.println("input string: "+ data);

		char[] charArray = data.toCharArray();
		
		for(char c: charArray){
			System.out.print(c);
		}
		System.out.println("\n===========================================");
		char[] newCharArray = new char[data.length()];
		int i = 0;
		for(char c : charArray){
			if((c<='z' && c>='a') ||(c<='Z' && c>='A') ){
			if(c=='z')
				{
				c='a';
			}
			else if(c=='Z'){
				c='A';
			}
			else{
				c= (char) (c+1);
			}
			}
			newCharArray[i] = c;
			i++;
			
		}
		for(char c : newCharArray){
		System.out.print(c);
		}
		
	} 

}
