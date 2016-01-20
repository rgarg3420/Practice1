package com.main.thread;

public class Thread2 extends Thread {

    public void run() {
	for (;;) {
	    System.out.println("Thread : " + System.currentTimeMillis());
	}
    }

    public static void main(String s[]) {

	Thread2 thr = new Thread2();
	thr.setDaemon(true);
	thr.start();
	thr.setDaemon(false);
    }
}
