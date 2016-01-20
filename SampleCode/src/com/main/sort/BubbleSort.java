package com.main.sort;

public class BubbleSort {

    private static int[] a = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };

    public static void main(String[] args) {
	// gets random generated array

	for (int i : a) {
	    System.out.print(i);
	    System.out.print(" ");
	}
	// prints the array

	// sorts the array
	sort();

	System.out.println();
	// prints the resulted array
	for (int i : a) {
	    System.out.print(i);
	    System.out.print(" ");
	}
    }

    // internally calls to bubbleSort()
    public static void sort() {
	int left = 0;
	int right = a.length - 1;

	bubbleSort(left, right);
    }

    private static void bubbleSort(int left, int right) {
	// the outer loop, runs from right to left
	for (int i = right; i > 1; i--) {
	    // the inner loops, runs from left to the right, limited by the
	    // outer loop
	    for (int j = left; j < i; j++) {
		// if the left item is greater than the right one, swaps
		if (a[j] > a[j + 1]) {
		    swap(j, j + 1);
		}
	    }
	}
    }

    // This method is used to swap the values between the two given index
    public static void swap(int left, int right) {
	int temp = a[left];
	a[left] = a[right];
	a[right] = temp;
    }

}
