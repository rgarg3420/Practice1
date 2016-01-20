package com.main.thread;

import java.util.Date;
import java.util.Vector;

public class Producer extends Thread {

    private Vector<String> vector = new Vector<String>();

    public Producer() {
    }

    @Override
    public void run() {
	while (true) {
	    try {
		System.out.println("running producer thread.");
		putMessage();
		sleep(1000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }

    public synchronized String getMessage() throws InterruptedException {

	if (vector.size() == 0) {
	    System.out.println("No elements , please wait.");
	    wait();
	}

	String message = vector.firstElement();
	System.out.println("removing element :" + message);
	vector.remove(message);
	System.out.println("Notifying producer");
	notifyAll();

	return message;
    }

    private synchronized void putMessage() throws InterruptedException {

	if (vector.size() == 5) {
	    System.out.println("Vector full , please wait.");
	    wait();
	}
	Date date = new Date();

	String message = "The message added to vactor at :" + date.toString();
	vector.add(message);
	System.out.println("Added element :" + message);
	System.out.println("notifying consumer");
	notifyAll();

    }

}
