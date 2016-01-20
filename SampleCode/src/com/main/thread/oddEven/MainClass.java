package com.main.thread.oddEven;

public class MainClass {

    public static void main(String s[]) {

	Thread tOdd = new Thread(new PrintOdd());
	Thread tEven = new Thread(new PrintEven());

	tEven.start();
	tOdd.start();

    }

}
