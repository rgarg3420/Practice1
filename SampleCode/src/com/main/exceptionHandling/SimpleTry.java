package com.main.exceptionHandling;

public class SimpleTry {

    public static void main(String[] args) {
	try{
	    System.out.println("Hello");
	    int a = 0/0;
	}
	catch(ArithmeticException e){
	    System.out.println("exception caught");
	  
	}
	finally{
	    System.out.println("Finally");
	}
	System.out.println("Bye");

    }

}
