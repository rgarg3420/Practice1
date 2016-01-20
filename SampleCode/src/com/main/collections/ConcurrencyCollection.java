package com.main.collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ConcurrencyCollection {

    private static Integer MAX_THREAD = 5;
    
    public static void main(String[] args) {
	
	
	ThreadFactory threadFac = new ThreadFactory() {
	    
	    @Override
	    public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);// TODO Auto-generated method stub
		return thread;
	    }
	};
	
	
	ExecutorService executor = Executors.newFixedThreadPool(MAX_THREAD,threadFac);
Runnable workThread = new work(); 
	Thread thread11 = new Thread(workThread);
	thread11.start();
	executor.execute(new work());

    }

}

class work implements Runnable{

    final ConcurrentHashMap<Integer, String> concMap = new ConcurrentHashMap<Integer, String>();
	boolean flag = false;
    @Override
    public void run() {
	for(int i = 0;i<=200;i++){
	    if(concMap.size()>3){
		flag = true;
	    }
	    System.out.println("Putting value in MAP : "+i );
	    concMap.put(i, "value"+i);
	}
	
	if(flag && concMap.size()>10){
	    for(int j =4; j<=7;j++){
	    concMap.remove(j);
	    System.out.println("Removing value from MAP :"+ j);
	    }
	    if(concMap.size()<=3){
		flag=false;
	    }
	}
	
    }
    
}

