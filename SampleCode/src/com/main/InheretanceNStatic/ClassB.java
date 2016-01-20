package com.main.InheretanceNStatic;

public class ClassB extends ClassA implements Interface2 {

    private String str1 = "BB";

    public String str2 = "BB2";

    @Override
    public String printNewStr() {
	String a = "AB";
	return a;

    }

    @Override
    public void print() {
	System.out.println("printing in ClassB");
    }

}
