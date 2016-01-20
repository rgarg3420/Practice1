package com.main.InheretanceNStatic;

public class ClassChild extends ClassParent{

	String a = "Child";
	static int staInt = 10;
	public int nInt = 10; 
	
	public String printC(String a ){
		return "Printing :"+a;
	}
	
	public String printC(int i){
		
		return "Printing i"+i;
	}
	

	@Override
	public String printG(String a) {
		// TODO Auto-generated method stub
		return "Printing override in child:"+a;
	}
	

	@Override
	public String printP(String a) {
		// TODO Auto-generated method stub
		return "Printing override :"+a;
	}
	
	@Override
	public String toString() {
	return "Print object of Child: ";
	
	}
	
	public static void incStaVal(){
		staInt = staInt+10;
		//nInt = nInt + 1;
		System.out.println("static val: "+ staInt);
		//System.out.println("Normal val: "+ nInt);
	}
	
	public static class subChildStatic{
		protected String str1 = "subChildStatic";
	public void printdata(){
		String innerVar = "inner static ";
		
		System.out.println("Val a "+ staInt);
		//System.out.println("Val b "+ nInt); // can not access non- static outer class variables 
		System.out.println("Print val :"+ str1);
		System.out.println("Print local :"+ innerVar);
	}
		
	}
	
	public class subChild{
		
		public void printdata(){
			System.out.println("Val a :"+ staInt);
			System.out.println("Val b :"+ nInt);
			printP("Hello! inner");
			
		}	
		
		
	}
	

	
}
