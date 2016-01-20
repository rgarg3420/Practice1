package com.main.logicQues;

import java.util.ArrayList;
import java.util.List;

public class Multipleelven {

    public static void main(String s[]) {

	int[] numbers = { 2, 3, 6, 4, 5, 8, 7, 9, 10, 3, 2 };

	long lcm = findlcm(numbers);

	System.out.println("LCM :" + lcm);

	int multiple = 1;
	boolean flag = true;
	while (flag)
	    if (((lcm * multiple) + 1) % 11 != 0) {
		multiple++;
		flag = true;
	    } else {
		System.out.println("The value is :" + ((lcm * multiple) + 1));
		flag = false;
	    }

    }

    private static long findlcm(int[] numbers) {

	boolean flag = true;
	int max = findMax(numbers);

	while (flag) {

	    List<Integer> l = new ArrayList<Integer>();

	    for (int k = 0; k < numbers.length; k++) {
		int a = max % numbers[k];

		l.add(a);

	    }
	    for (Integer integer : l) {
		if (integer == 0) {
		    flag = false;
		} else {
		    flag = true;
		    max++;
		    break;
		}
	    }

	}

	return max;
    }

    private static int findMax(int[] numbers) {

	int last = numbers.length;

	for (int i = 1; i < last; i++) {
	    int val = numbers[i];
	    int j = i;
	    while ((j > 0) && (numbers[j - 1] > val)) {
		numbers[j] = numbers[j - 1];
		j--;
	    }
	    numbers[j] = val;
	}

	int max = numbers[numbers.length - 1];

	return max;
    }

}
