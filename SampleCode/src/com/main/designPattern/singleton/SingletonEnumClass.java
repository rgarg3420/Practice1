package com.main.designPattern.singleton;

public enum SingletonEnumClass {

    ABC;
    int i = 2;

    public void print() {
	System.out.println("Print value " + i++);
    }

}
