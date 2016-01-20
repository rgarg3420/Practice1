package com.main.exceptionHandling;

public class MyException extends Exception {

    private static final long serialVersionUID = -5785166801873033654L;

    private int exId1 = 00026;
    private int exId2 = 00016;
    private int exId3 = 00016;

    public MyException(String message, Exception e) {
	super();
	if (e instanceof ArrayIndexOutOfBoundsException) {
	    System.out.println("Exception ID :" + exId1 + " MyException :" + message);
	}
	if (e instanceof NullPointerException) {
	    System.out.println("Exception ID :" + exId2 + " MyException :" + message);
	}
    }

    public MyException(String a) {
	String message = "The string " + a + " does not start with 'R'";
	System.out.println("Exception ID: " + exId3 + ": " + message);
    }

}
