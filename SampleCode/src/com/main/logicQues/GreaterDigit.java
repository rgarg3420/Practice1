package com.main.logicQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreaterDigit {

    public static void main(String s[]) {

	long inputVal = 53421;

	List<Character> intArray = new ArrayList<Character>();
	List<Character> tempAr = new ArrayList<Character>();
	List<Character> tempAr1 = new ArrayList<Character>();
	boolean flag = true;
	String temp = Long.toString(inputVal);

	for (int i = 0; i < temp.length(); i++) {
	    intArray.add((temp.charAt(i)));
	}
	tempAr1.add(intArray.get(0));
	for (int i = 0; i <= intArray.size() - 1; i++) {
	    flag = true;
	    for (int j = i + 1; j < intArray.size(); j++) {

		if (intArray.get(i) < intArray.get(j)) {
		    tempAr.clear();
		    tempAr1.add(intArray.get(i));
		    flag = false;
		    break;
		}

	    }
	    if (flag) {
		tempAr.add(intArray.get(i));

	    }

	}

	for (Character l1 : tempAr) {
	    System.out.print(l1);
	}

	System.out.println("\n");

	for (Character l2 : tempAr1) {
	    System.out.print(l2);
	}

	System.out.println("\n\n");
	Collections.sort(intArray);
	String min = "";

	for (Character ar : intArray) {

	    min = min + (String.valueOf(ar));
	}

	long val = Long.valueOf(min);
	System.out.print(val);

	System.out.println("\n");
	String max = "";

	for (int i = intArray.size(); i > 0; i--) {
	    max = max + (String.valueOf(i));
	}

	long val1 = Long.valueOf(max);
	System.out.print(val1);
	// intArray = bubbleSort(intArray);

    }

    private static List<Integer> bubbleSort(List<Integer> intArray) {

	int length = intArray.size();
	int k = 0;

	for (int m = length; m >= 0; m--) {
	    for (int i = 0; i < length - 1; i++) {
		k = i + 1;
		if (intArray.get(i) > intArray.get(k)) {
		    swapNumbers(i, k, intArray);
		}
	    }

	}
	return intArray;
    }

    private static void swapNumbers(int i, int j, List<Integer> intArray) {

	int temp;
	int a = intArray.get(i);
	int b = intArray.get(j);
	temp = a;
	a = b;
	b = temp;
    }
}
