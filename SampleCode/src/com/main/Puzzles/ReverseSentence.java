package com.main.Puzzles;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		
		
	System.out.println("Input the sentence :");
	Scanner scan = new Scanner(System.in);
	String sentence = scan.nextLine();
	boolean isPeriod = false;
	System.out.println("The sentence is  :"+ sentence);
	
	if(sentence!=null){
	if( sentence.endsWith(".")){
		sentence = sentence.substring(0, sentence.length()-1);
		isPeriod = true;
		System.out.println("Sub sentence is :"+ sentence);
	}
	
	String strArray[] = sentence.split(" ");
	sentence = "";
	for(int i = strArray.length-1;i>=0;i--){
		sentence = sentence+" "+ strArray[i];
		
	}
		if(isPeriod){
			sentence = sentence+".";
		}
	}
		System.out.print("Reverse sentence is :"+ sentence);
		
	}

}