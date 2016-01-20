package com.main.exceptionHandling;

public class CatchFinally {

	public static void main(String[] args) {
		String result = printResult(); 
		System.out.println(result);
	}

	@SuppressWarnings("finally")
	private static String printResult() {
	try{
		int res = 100/0;
		System.out.println("try");
		return "try" ;
	}catch(Exception e){
		System.out.println("catch");
		return("catch");
	}
	finally{
		System.out.println("finally");
		return ("finally");
	}
		
	}

}
