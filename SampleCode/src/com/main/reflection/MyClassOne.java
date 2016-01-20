package com.main.reflection;

public class MyClassOne {
	
	static{
		System.out.println("MyclassOne initialized.");
	}
	  
	public int pub = 1;
	protected int pro = 2;
	private int pri = 3;
	
	
	MyClassOne(){
		System.out.println("This is my class!");
	}
	
	MyClassOne(int a){
		pro = a;
		System.out.println("This is my Class : "+a);
	}
	
	
	public static void callStatic(){
		
		System.out.println("This is static class of MyClassOne");
		
	}

	public void callMethod(){
		System.out.println("Calling method of MyClassOne");
	}
	
	public void callMthodArg(int val){
		System.out.println("Calling method callMthodArg :"+ val);
	}
	
	protected void callMethodProtected(){
		System.out.println("This is protected method called :");
	}
	
	private void callMethodPrivate(){
		System.out.println("This is private method called :");
	}

	public int getPub() {
		return pub;
	}

	public void setPub(int pub) {
		this.pub = pub;
	}

	public int getPro() {
		return pro;
	}

	public void setPro(int pro) {
		this.pro = pro;
	}

	public int getPri() {
		return pri;
	}

	public void setPri(int pri) {
		this.pri = pri;
	}
}
