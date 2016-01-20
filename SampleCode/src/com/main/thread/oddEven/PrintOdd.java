package com.main.thread.oddEven;

public class PrintOdd implements Runnable {

    @Override
    public void run() {

	for (int i = 1; i < 100; i = i + 2) {
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    if (PrintEven.flagEven) {
		System.out.println(i);

		PrintEven.flagEven = false;
		// i = i + 2;
	    }
	}

    }
}
