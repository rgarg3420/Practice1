package com.main.DataTypeAutoBoxing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayDecleration {

    public static void main(String s[]) {

	int[][] arrayInt = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 9, 0 } };

	int arrayVal[] = { 1, 2, 3, 4, 5 };

	int[] arrayvalue[] = { { 1, 2, 7, 8, 9 }, { 3, 4 } };

	System.out.println("size 1 :" + arrayInt.length);
	System.out.println("size 2 :" + arrayVal.length);
	System.out.println("size 3 :" + arrayvalue.length);
	System.out.println("size 4 :" + arrayInt[0].length);
	System.out.println("size 5 :" + arrayvalue[0].length);

	char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'a', 'b' };

	HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
	for (int i = 0; i < charArray.length; i++) {
	    hm.put(i, charArray[i]);
	}
	HashSet<Character> hs = new HashSet<Character>(hm.values());

	Iterator it = hs.iterator();

	while (it.hasNext()) {
	    System.out.println(it.next());
	}

    }

}
