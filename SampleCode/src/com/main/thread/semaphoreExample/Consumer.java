package com.main.thread.semaphoreExample;

public class Consumer implements Runnable {

    Producer producer;

    public Consumer(Producer p) {
	this.producer = p;
    }

    @Override
    public void run() {
	try {
	    System.out.println("Running consumer :");
	    producer.deleteMessage();
	    Thread.sleep(2000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    public static void main(String s[]) {

	Producer p = new Producer();
	Thread consumer = new Thread(new Consumer(p), "Consumer thread");
	Thread producer = new Thread(new Producer(), "Producer thread");
	System.out.println("starting consumer.");
	System.out.println("starting producer.");

	producer.start();
	consumer.start();

    }

}
