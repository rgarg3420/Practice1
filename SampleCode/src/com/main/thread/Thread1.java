package com.main.thread;

public class Thread1 implements Runnable {

    @Override
    public void run() {
	try {

	    for (int i = 0; i < 20; i++) {
		Thread.sleep(2000);
		System.out.println("Calling run :" + i + " " + Thread.currentThread().getName() + " thread id :"
			+ Thread.currentThread().getId());

		/*
		 * if (Thread.currentThread().getName().equals("Thread 2")) { if
		 * (i == 15) {
		 * 
		 * throw new InterruptedException(); } } else { if (i == 10) {
		 * 
		 * throw new InterruptedException(); } }
		 */
	    }
	} catch (Exception e) {
	    System.out.println("Interruption Exception thrown for " + Thread.currentThread().getName());
	}
    }

    public static void main(String s[]) throws InterruptedException {
	Thread mainTh = Thread.currentThread();
	Thread t1 = new Thread(new Thread1(), "Thread 1");
	Thread t2 = new Thread(new Thread1(), "Thread 2");
	// Thread t3 = new Thread(new Thread1(), "Thread 3");
	// Thread t4 = new Thread(new Thread1(), "Thread 4");

	t1.start();
	t2.start();

	// t1.join();

	// t2.join();
	// t4.start();
	// t3.start();
	for (int i = 0; i < 20; i++) {
	    System.out.println("Calling main:" + i);
	}
	System.out.println("Priority::" + mainTh.getPriority() + ":::" + mainTh.getName());
	// t3.setPriority(7);
	// t4.setPriority(2);

    }
}
