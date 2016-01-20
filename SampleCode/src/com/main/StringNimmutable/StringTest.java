package com.main.StringNimmutable;

public class StringTest {

    public static void main(String[] args) {

String s1 = "Hi";
String s2 = new String("Hi");
String s3 = "Hi";
String s4 = new String("Hi");

if(s1==s3)
    System.out.println("s1 == s3");
else
    System.out.println("s1 != s3");
if(s1==s2)
    System.out.println("s1 == s2");
else
    System.out.println("s1 != s2");
if(s4.equals(s2))
System.out.println("s4 equals s2");
if(s4 == s2)
    System.out.println("s4 == s2");
if(s1.equals(s2))
    System.out.println("s1 equals s2");
    

    
    Integer i = 10;
    Integer j = 11;
    Integer k = ++i; // INCR
    System.out.println("k == j is " + (k == j));
    System.out.println("k.equals(j) is " + k.equals(j));
    
    String str = null;
    if(str instanceof Object) // NULLCHK
    System.out.println("str is Object");
    else
    System.out.println("str is not Object");
    }
    
    
}
