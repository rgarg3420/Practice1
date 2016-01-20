package com.main.Puzzles;

public class LongestPalindrom {

	public static void main(String[] args) {
		String str = "ANITINBCB";
		char[] seq = str.toCharArray();
		
	    int n = seq.length;
	    System.out.println("The lnegth of the LPS is "+ lps(seq, 0, n-1,"start"));
	   
	}
	
	static int max (int x, int y) { return (x > y)? x : y; }
	 
	// Returns the length of the longest palindromic subsequence in seq
	 static int lps(char[] seq, int i, int j, String type)
	{
	   // Base Case 1: If there is only 1 character
		 System.out.print("   Type is :"+type);
		 System.out.print("   seq i: "+ seq[i]);
		 System.out.println("   seq j: "+ seq[j]);
	   if (i == j)
	     return 1;
	 
	   // Base Case 2: If there are only 2 characters and both are same
	   if (seq[i] == seq[j] && i + 1 == j)
	     return 2;
	 
	   // If the first and last characters match
	   if (seq[i] == seq[j])
	      return lps (seq, i+1, j-1,"match") + 2;
	 
	   // If the first and last characters do not match
	   return max( lps(seq, i, j-1,"first"), lps(seq, i+1, j,"second") );
	}
	 
	/* Driver program to test above functions */
	

}
