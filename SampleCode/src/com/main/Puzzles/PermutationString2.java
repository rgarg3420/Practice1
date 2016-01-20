package com.main.Puzzles;

public class PermutationString2 {

	public static void main(String[] args) {
		PermutationString2 ps2 = new PermutationString2();
		ps2.permute("ABCDE");;
	}
	void permute( String input)
	{
	  int inputLength = input.length();
	  boolean[ ] used = new boolean[ inputLength ];
	  StringBuffer outputString = new StringBuffer();
	  char[ ] in = input.toCharArray( );
	  
	  doPermute ( in, outputString, used, inputLength, 0 );

	}

	  void doPermute ( char[ ] in, StringBuffer outputString, 
	                    boolean[ ] used, int inputlength, int level)
	  {
	     if( level == inputlength) {
	     System.out.println ( outputString.toString()); 
	     return;
	     }

	    for( int i = 0; i < inputlength; ++i )
	    {       

	       if( used[i] ) continue;

	       outputString.append( in[i] );      
	       used[i] = true;       
	       doPermute( in,   outputString, used, inputlength, level + 1 );       
	       used[i] = false;       
	         outputString.setLength(   outputString.length() - 1 );   
	    }
	    System.out.println("Return from here...");
	    return;
	 }


}
