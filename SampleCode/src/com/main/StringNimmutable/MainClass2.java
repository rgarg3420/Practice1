package com.main.StringNimmutable;

public class MainClass2 {

    public static void main(String s[]) {

	String str1 = new String("Hello");
	String str2 = new String("Hello");
	String str3 = str1;

	StringBuffer strb1 = new StringBuffer("Hello");
	StringBuffer strb2 = new StringBuffer("Hello");
	StringBuffer strb3 = strb2;

	System.out.println((strb1.hashCode() == strb2.hashCode()) + "hashcode :" + strb1.hashCode() + "::"
		+ strb2.hashCode());
	System.out.println(str1.hashCode() == str2.hashCode());
	System.out.println(str1.hashCode() == str3.hashCode());
	System.out.println(strb3.hashCode() == strb2.hashCode());

	String str11 = "Hello";
	String str22 = "Hello";

	System.out.println("str11 equal str22: " + str11.equals(str22));
	System.out.println("str11 and str22: " + (str11 == str22));
	System.out.println("str1 and str2: " + (str1 == str2));
	System.out.println("str1 intern and str2 intern: " + (str1.intern() == str2.intern()));

    }
}
