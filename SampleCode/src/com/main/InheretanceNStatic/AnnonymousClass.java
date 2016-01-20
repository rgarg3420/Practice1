package com.main.InheretanceNStatic;

public class AnnonymousClass {
	
	String val = "AnnonymousClass";
	
	Interface1 interfaceOne = new Interface1(){

		@Override
		public void print() {
		System.out.println("Printing the inteface one method from annonymous class."+val);
			
		}

		@Override
		public void printAgain() {
		    // TODO Auto-generated method stub
		    
		}

		@Override
		public void increment() {
		    // TODO Auto-generated method stub
		    
		}
		
	};

}
