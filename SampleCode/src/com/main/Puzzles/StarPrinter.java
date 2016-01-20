package com.main.Puzzles;

public class StarPrinter {

	public static void main(String[] args) {
	
		int max= 5;//Integer.valueOf(args[0]);
		
		int mid = (int) Math.floor(max/2);
		System.out.println("Mid:"+mid);
		int row = 0;
		int column =0 ;
		String[][] matrix = new String[max][max];
		int count=0;
		boolean flag = false;
		for(row=0;row<max;row++){
			flag= false;
			for(column=0;column<max;column++){
				
				
				
				for(int itr = 0;itr<=count;itr++){
				if((column == mid-itr)||(column == mid+itr)){
					matrix[row][column] = "*";
					System.out.print(matrix[row][column]);
					flag = true;
				}
				
				}
				if(!flag){
				matrix[row][column] = " ";
				System.out.print(matrix[row][column]);	
				}
			}
			if(row<mid){
				count++;
			}
			else{
				count--;
			}
			System.out.print("\n");
		}
		

	}

}
