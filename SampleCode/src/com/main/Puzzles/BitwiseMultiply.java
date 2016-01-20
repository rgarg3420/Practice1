package com.main.Puzzles;

public class BitwiseMultiply {

	public static void main(String[] args) {
		int n = 4;
	    System.out.println("value: "+ multiplyBySeven(n));
	    System.out.println("value: "+ multiplyByFive(n));
	 
	}
	
	static int multiplyBySeven( int n)
	{  
	    /* Note the inner bracket here. This is needed 
	       because precedence of '-' operator is higher 
	       than '<<' */
	    return ((n<<3) - n);
	}
	
	static int multiplyByFive( int n)
	{  
	    /* Note the inner bracket here. This is needed 
	       because precedence of '-' operator is higher 
	       than '<<' */
	    return ((n<<2) + n);
	}
	 
	

}
