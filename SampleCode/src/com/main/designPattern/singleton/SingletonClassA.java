package com.main.designPattern.singleton;

public class SingletonClassA {

    private volatile static SingletonClassA instance;

    private SingletonClassA() {

    }

    public SingletonClassA getInstance() {

	if (instance == null) {
	    synchronized (instance) {
		if (instance == null) {
		    instance = new SingletonClassA();
		}

	    }
	}
	return instance;
    }

}
