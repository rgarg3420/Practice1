package com.main.Puzzles;

import java.util.Scanner;

public class TowerOfHanoi {

	   public void solve(int n, String start, String middle, String end) {
		   //if only one disk is there.
	       if (n == 1) {
	           System.out.println(start + " -> " + end);
	       } 
	       //more than 1 disc.
	       else {
	    	   //the destination is middle rod 
	           solve(n - 1, start, end, middle);
	           System.out.println(start + " -> " + end);
	           //source is middle rod
	           solve(n - 1, middle, start, end);
	       }
	   }

	   public static void main(String[] args) {
	       TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	   }
	}