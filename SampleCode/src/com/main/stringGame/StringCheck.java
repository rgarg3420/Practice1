package com.main.stringGame;

public class StringCheck {
    
    private static String str1 = "HI";
    private static String str2 = new String("HI");
    
    
    public static void main(String s[]){
	
	String str3 = "HI";
	String str4 = new String("HI");
	String str5 = new String("HI");
	String str6 = "HI";
	
	
	System.out.println("1: "+(str1==str2));
	
	System.out.println("2: "+(str1==str3));
	
	System.out.println("3: "+(str2==str4));
	
	System.out.println("4: "+(str5==str4));
	
	System.out.println("5: "+(str5.equals(str4)));
	
	System.out.println("6: "+(str5.equals(str6)));
	
	
	System.out.println(str1.hashCode()+ " : "+ str2.hashCode()+ " : "+ str3.hashCode()+" : "+ str4.hashCode()+" : "+ str5.hashCode()+" : "+str6.hashCode());
	
	
    }
    
    

}
