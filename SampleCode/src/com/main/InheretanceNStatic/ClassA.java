package com.main.InheretanceNStatic;

public class ClassA implements Interface1 {

    private String str1 = "AA";

    public String str2 = "AA2";

    public final String printStr() {

	String a = "Hello!";
	return a;
    }

    public String printNewStr() {

	String b = "bye!";
	return b;
    }

    private String printStrAgain() {

	String c = "Again!";
	return c;
    }

    @Override
    public void print() {
	System.out.println("Printing from classA");
    }

}
