package com.main.DataTypeAutoBoxing;

public class DataType {
    
    public static void main(String s[]){
	
	float a = (float) 0.5;
	double b = 0.5;
	
	System.out.println((a==b));
	
	float c = (float) Math.PI;
	double d = Math.PI;
	System.out.println("c is "+c);
	System.out.println("d is "+d);
	System.out.println((c==d));
	
    }

}
