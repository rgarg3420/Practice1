package com.main.thread;

public class Consumer extends Thread {

    Producer producer;

    public Consumer(Producer p) {
	this.producer = p;
    }

    @Override
    public void run() {
	while (true) {
	    System.out.println("Running consumer thread.");

	    try {
		producer.getMessage();

		sleep(2000);
	    } catch (InterruptedException e) {

		e.printStackTrace();
	    }
	}

    };

    public static void main(String s[]) {

	Producer producer = new Producer();
	System.out.println("Starting producer ");
	producer.start();
	System.out.println("Starting consumer ");
	new Consumer(producer).start();

    }

}
