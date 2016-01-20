package com.main.thread.semaphoreExample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Producer implements Runnable {

    private static int semaphoreCount = 0;

    Producer producer;

    private List<String> threadList = new ArrayList<String>();

    public Producer() {
	super();

    }

    @Override
    public void run() {

	try {

	    System.out.println("running producer..");
	    createMessage();
	    Thread.sleep(2000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    private synchronized void createMessage() throws InterruptedException {
	if (Producer.semaphoreCount == 5) {
	    System.out.println("The max number of thread already there , waiting for consumer to consume...");
	    wait();
	}

	Date date = new Date();
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String threadTime = df.format(date);

	threadList.add(threadTime);
	Producer.semaphoreCount++;
	System.out.println("Notifyig consumer to consume more...");
	notifyAll();
    }

    public synchronized void deleteMessage() throws InterruptedException {

	if (Producer.semaphoreCount == 0) {
	    System.out.println("counter is 0 , waiting for producer to add new ....");
	    wait();
	}

	threadList.remove(0);
	Producer.semaphoreCount--;
	System.out.println("Notifying producer to produce more.");
	this.notifyAll();
    }

}
