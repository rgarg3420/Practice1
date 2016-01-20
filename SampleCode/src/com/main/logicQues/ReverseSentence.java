package com.main.logicQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseSentence {

    public static void main(String args[]) throws IOException {

	String input = "";
	String val = "";
	ArrayList<String> arrayString = new ArrayList<String>();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	while (reader.read() != -1)
	    System.out.println(input = reader.readLine());
	val = val + input;

	reader.close();

	System.out.println("!!!" + val + "!!!");
	String[] sub = val.split(" ");

	for (int i = sub.length - 1; i >= 0; i--) {
	    System.out.print(sub[i] + " ");
	}

    }
}
