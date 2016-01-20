package com.main.InheretanceNStatic;

public class ClassParent extends ClassGrand{
	
	String a = "Parent";
	static int staInt = 1;
	public int nInt = 1; 
	public String printP(String a ){
		return "Printing :"+a;
	}
	
	@Override
	public String printG(String a){
		return "Printing override:"+a;
		
	}
	
	public void incVal(){
		staInt = staInt+1;
		nInt = nInt + 1;
		System.out.println("static val: "+ staInt);
		System.out.println("Normal val: "+ nInt);
	}
	
	public static void incStaVal(){
		staInt = staInt+1;
		
		//nInt = nInt + 1;
		System.out.println("static val: "+ staInt);
		//System.out.println("Normal val: "+ nInt);
	}
	
	
	

}
