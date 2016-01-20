package com.main.thread.oddEven;

public class PrintEven implements Runnable {

    static boolean flagEven = false;

    public void run() {

	for (int i = 0; i < 100; i = i + 2) {
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    if (!flagEven) {
		System.out.println(i);

		flagEven = true;
		// i = i + 2;
	    }
	}

    }

}
