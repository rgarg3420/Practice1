package com.main.concurrencyUtil.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQExammple {

	public static void main(String[] args) throws Exception {

		BlockingQueue bq = new ArrayBlockingQueue(1000);

		Producer producer = new Producer(bq);
		Consumer consumer = new Consumer(bq);

		new Thread(producer).start();
		new Thread(consumer).start();

		Thread.sleep(4000);
	}

}