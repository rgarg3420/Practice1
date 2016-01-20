package com.main.exceptionHandling;

public class ExceptionMain {

    public static void main(String s[]) {

	try {
	    print();
	    // } catch (IOException e | Exception ee) { -- error : Exception
	    // already caught the thrown exception.
	} catch (ArithmeticException | NullPointerException e) {
	    if (e instanceof ArithmeticException) {
		System.out.println("Division by zero not possible.");
	    } else {
		System.out.println("Exception caught for NULL ");
	    }

	}
	try {
	    printAgain();
	} catch (NullPointerException ne) {
	    System.out.println("Null pointer caught!");
	}
	System.out.println("No Try code");

	printLast();
	
	System.runFinalization();
    }

    private static void print() throws ArithmeticException {

	int a = 10;
	String key = null;
	boolean flaf = key.equals("Hello");
	float div = 10 / 0;

    }

    private static void printAgain() {

	String name = "Rohit";
	int i = 0;
	String key = null;
	char[] charArray = name.toCharArray();
	try {
	    for (; i <= name.length(); i++)

	    {
		System.out.println(charArray[i]);
	    }
	} catch (ArrayIndexOutOfBoundsException arr) {
	    arr = new ArrayIndexOutOfBoundsException("Exception while iterating array");
	    Exception e = new ArrayIndexOutOfBoundsException();
	    MyException me = new MyException("Exception while printing values", e);
	    System.out.println("Array Index exception caught.");
	    try {
		boolean flag = key.endsWith("ll");
	    } catch (NullPointerException em) {
		Exception e1 = em;
		throw new MyException("Exception while checking value.", e1);
	    }

	} finally {
	    System.out.println("Finally exception ");
	    throw new NullPointerException();
	}

    }

    private static void printLast() {

	String[] name = { "Rohit", "lucky", "Raju", "happy", "money" };
	try {

	    for (String str : name) {
		if (!(str.startsWith("R") | (str.startsWith("r")))) {
		    throw new MyException(str);
		}
	    }
	} catch (MyException e) {

	}

    }

}
