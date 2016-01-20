package com.main.thread;

import java.util.Timer;
import java.util.TimerTask;

public class ThreadGrp {

    public static void main(String[] args) throws InterruptedException {
	
	ThreadGroup thg1 = new ThreadGroup("Group1");
	//ThreadGroup thg2 = new ThreadGroup(thg1,"Group2");
	
	Thread thrd1 = new Thread(thg1, new work(),"Thread1");
	Thread thrd2 = new Thread(thg1, new work(),"Thread2");
	Thread thrd3 = new Thread(thg1,new work(), "Thread3");
	Thread thrd4 = new Thread(thg1,new work(), "Thread4");
	thrd4.setPriority(8);
	
	
	thg1.setMaxPriority(6);
	
	
	
	thrd1.setPriority(9);
	
	thrd1.run();
	//Thread.sleep(2000);
	
	thrd1.start();
	System.out.println("Priority is :"+thrd1.getPriority());
	//Thread.sleep(2000);
	
	thrd2.start();
	//Thread.sleep(2000);
	
	thrd3.start();
	//Thread.sleep(2000);
	
	thrd4.start();
	Thread.sleep(3000);
	System.out.println("Priority is :"+thrd4.getPriority());
	System.out.println("active count: "+thg1.activeCount());
	System.out.println("Thread parent :"+thg1.getParent());
	Thread.sleep(2000);
	
	
	
	thg1.destroy();
	
	System.out.println("The thread group has been destroyed now");
	
	System.out.println("thread 1 alive : "+thrd1.isAlive());
	
	Timer tmr1 = new Timer();
	
	System.out.println("The timer is initialized");
	
	final String a = "Hello timer";
	
	tmr1.schedule(new TimerTask() {
	    
	    @Override
	    public void run() {
		System.out.println("This is timer based call  "+a);
	    }
	}, 7000,3000);
	
    }

}

 class work implements Runnable{

     private static Integer count = 100;
     private static ThreadLocal<Integer> tlval = new ThreadLocal<Integer>(){
	  protected Integer initialValue(){    
	     return count++;
	 }
     };
     
     private static ThreadLocal<Integer> tlval2 = new ThreadLocal<Integer>();
     
    
    @Override
    public void run() {

	tlval.get();
	
	tlval2.set(count++);
	
	System.out.println("printing from thread :"+ Thread.currentThread().getName() + "the first count val is :"+ tlval.get()+"  the second count val is :"+ tlval2.get());
	
    }
    
}
