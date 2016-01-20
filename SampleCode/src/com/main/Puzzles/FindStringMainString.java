package com.main.Puzzles;

public class FindStringMainString {


static void solve(char[] str1, char[] str2, int n, int m) {
	 
	int count1[] = new int[256]; 
	int count2[] = new int[256]; 
	int count = 0;
	int len = Integer.MAX_VALUE;
	int i = 0, j = 0, s = -1;
 
	for( i = 0; i < m; i++) count2[str2[i]]++;
 
	for(int i = 0; i < n; i++) {
		/* skip the letter, not of our interest ;D */ 
		if(!count2.[str1[i]]) continue;
		/* Increment character count */
		count1[str1[i]]++;
		/* increment overall encounterd character count */
		if(count1[str1[i]] <= count2[str1[i]]) count++;
		// If we have all the desired characters in the window
		if(count == m) {
			/* Move window start if start character is not of our interest, or 
			 if its in excess than also move ahead and decrement its count */ 
			while(!count2[str1[j]] || count1[str1[j]] > count2[str1[j]]) {
				if (count1[str1[j]] > count2[str1[j]]) count1[str1[j]]--;
				j++;
			}
			// Check for optimal window length ;)
			if(i-j+1 < len) {
				len = i-j+1;
				s = j;
			}
		}
	}
 
	if(s == -1){
		System.out.println( "No window possible");
	}
	else 
		{for(int k = s; k< s+len; k++){ System.out.println(str1[k]);
	}
}
	}
 
public static void main(String s[]) {
 
	String strval1 = "this is a test string";
	String strval2 = "tist";
	char[] str1 = strval1.toCharArray();
	char[] str2 = strval2.toCharArray();
	solve(str1, str2, str1.length, str2.length);
  
}
}
