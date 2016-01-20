package com.main.logicQues;

import java.util.Stack;

public class Decimal2Binary {

    public static void main(String s[]) {

	int input = 6;

	for (int inputVal = 1; inputVal <= input; inputVal++) {

	    Stack<Integer> st = new Stack<Integer>();

	    int quet = inputVal;

	    while (quet >= 2) {

		int mod1 = quet % 2;
		st.push(mod1);
		quet = quet / 2;

	    }
	    if (quet < 2) {
		st.push(1);
	    }
	    System.out.print("Decimal: " + inputVal + " Binary : ");
	    while (!st.isEmpty()) {
		System.out.print(st.pop() + "");
	    }
	    System.out.println("\n");
	}
    }

}
