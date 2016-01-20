package com.main.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
	
	public static void main(String s[]){
		
	String regex = "(a*b+)\\d+";	
	
	String s1 = "ab";
	String s2 = "b";
	String s3 = "aab";
	String s4 = "abb";
	String s5 = "1abb";
	String s6 = "abb2";
	String s7 = "abb23";
	
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(s1);
	System.out.println(s1.matches(regex));
	
	Matcher matcher2 = pattern.matcher(s2);
	System.out.println(s2.matches(regex));
	
	Matcher matcher3 = pattern.matcher(s3);
	System.out.println(s3.matches(regex));
		
	Matcher matcher4 = pattern.matcher(s4);
	System.out.println(s4.matches(regex));
	
	Matcher matcher5 = pattern.matcher(s5);
	System.out.println(s4.matches(regex));
	
	Matcher matcher6 = pattern.matcher(s6);
	System.out.println(s4.matches(regex));
	
	Matcher matcher7 = pattern.matcher(s7);
	System.out.println(s4.matches(regex));
	}

}