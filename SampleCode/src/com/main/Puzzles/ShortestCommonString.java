package com.main.Puzzles;

public class ShortestCommonString {

	static int min(int a, int b) { return (a < b)? a : b; }
	 

	 
	// Function to find length of the shortest supersequence
	// of X and Y.
	static int shortestSuperSequence(char[] X, char[] Y)
	{
	  int m = X.length, n = Y.length;
	 
	  int l = lcs(X, Y, m, n); // find lcs
	 
	  // Result is sum of input string lengths - length of lcs
	  return l;
	}
	 
	/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
	static int lcs( char[] X, char[] Y, int m, int n)
	{
		
		
	   int len = 0;
	   int i, j;
	 
	   
	   if(m==0){
		  
		   return  Y.length;
	   }
	   if(n==0){
		   
		   return X.length;
	   }
	   
	   if(X[m-1]==Y[n-1]){
		   
		  return   1+ lcs(X,Y,m-1,n-1);
	   }
	   
	   
	   else 
		 return 1+min(lcs(X,Y,m-1,n),lcs(X,Y,m,n-1));
	 
	   /* L[m][n] contains length of LCS for X[0..n-1] and
	      Y[0..m-1] */
	 
	}
	 
	/* Driver program to test above function */
	public static void main(String[] s )
	{
	  String strX = "AGGTAB";
	 String strY = "GXTXAYB";
	 char[] X = strX.toCharArray();
		char[] Y = strY.toCharArray();
	 
	System.out.println("Length of the shortest supersequence is\n"+
	         shortestSuperSequence(X, Y));
	 
	}
}
