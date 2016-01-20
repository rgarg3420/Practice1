package com.main.InheretanceNStatic;

public class OuterClass {
	
String globalVar = "Global Variable";	
static String  stglobalVar = "Static Global Variable";	

public static void createInner(){
	
final String localVar = "Local Variable";	
	
class innerClass{
	void print(){
		System.out.println("method innerClass"+localVar);
		System.out.println("global innerClass"+stglobalVar);
	}
	
}

System.out.println("Local :"+ localVar);
System.out.println("Global :"+ stglobalVar);


}

public  void createAnotherInner(){
	
final String localVar = "Local Variable";	
	
class innerClass{
	void print(){
		System.out.println("method innerClass"+localVar);
		System.out.println("global innerClass"+globalVar);
	}
	
}

System.out.println("Local :"+ localVar);
System.out.println("Global :"+ globalVar);


}
	

}
