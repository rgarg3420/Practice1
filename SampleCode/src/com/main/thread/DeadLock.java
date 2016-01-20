package com.main.thread;

public class DeadLock {

   private static Object ob1 = new Object();
   private static Object ob2 = new Object();
   
    public static void main(String[] args) {

	DeadLock ddlck = new DeadLock();
	
	Thread t1 = new Thread(new ThreadClass1(ob1, ob2), "Thread-1");
	
	
	Thread t2 = new Thread(new ThreadClass2(ob1, ob2), "Thread-2");
	
	t1.start();
	t2.start();
	
	
    }
}  
    
     class ThreadClass1 implements Runnable{

	 Object ob1 = new Object();
	 Object ob2 = new Object();
	public ThreadClass1(Object ob1, Object ob2) {
	   this.ob1 = ob1;
	   this.ob2 = ob2;
	}

	@Override
	public void run() {
	  synchronized (ob2) {
	    System.out.println("Inside thread 1 with ob2 "+ ob2.toString());
	    
	    
	    synchronized (ob1) {
		System.out.println("Inside thread 1 with ob1"+ ob1.toString());
		    
	    }
	    
	}
	    
	}
	
    }
    
    class ThreadClass2 implements Runnable {

	Object ob1 = new Object();
	 Object ob2 = new Object();
	public ThreadClass2(Object ob1, Object ob2) {
	   this.ob1 = ob1;
	   this.ob2 = ob2;
	}
	
	@Override
	public void run() {
	    synchronized (ob1) {

		System.out
			.println("Inside thread 2 with ob1 " + ob1.toString());

		synchronized (ob2) {
		    System.out.println("Inside thread 2 with ob2"
			    + ob2.toString());

		}

	    }

	}

    }


