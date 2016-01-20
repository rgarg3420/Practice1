package com.main.InheretanceNStatic;

public class InterfaceClass implements Interface1, Interface2 {

    @Override
    public void print() {
	 System.out.println("Value a :" + a);
	 System.out.println("Value b :" + b);// --ambiguous
    }

	@Override
	public void increment() {
		System.out.println(a+1);
		System.out.println( b+11);
		
		
	}

	@Override
	public void printAgain() {
		// TODO Auto-generated method stub
		
	}

}
