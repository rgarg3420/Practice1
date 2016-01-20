package com.main.Puzzles;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
	int row = 0;
	int column = 0;
	int oddValue = 0;
	
	
	System.out.println("Input number of rows :");
	Scanner scan = new Scanner(System.in);
	row = scan.nextInt();
    System.out.println("Input number of columns :");
    column = scan.nextInt();
    
    
    if(row<=0||column<=0){
    	System.out.println("rows or column can not be negative or single array . Exiting");
    	return;
    }
    else if(row!=column){
    	System.out.println("The matrix is not sqare matrix , can not be rotated in place");
    	return;
    }
    
    else{
    	Integer[][] matrix = new Integer[row][column];
    	System.out.println("Enter array elements");
    	for(int ii = 0;ii<row;ii++){
    		for(int jj = 0; jj<column;jj++){
   matrix[ii][jj] = scan.nextInt();			
    		}
    	}
    	
    	for(int ii = 0;ii<row;ii++){
    		for(int jj = 0; jj<column;jj++){
  System.out.print(matrix[ii][jj]+" ");		
    		}
    		System.out.print("\n");
    	}
    	
    	
    	int offset = row-1;
    	if(row%2==1){
    		oddValue = 1;
    	}
    	ArrayList<Integer> temp = new ArrayList<Integer>();
    	for(int i = 0; i<(row/2)+oddValue;i++){
    		
    		for(int j = i; j<row-i;j++){
    			temp.add(j, matrix[i][j]); 	
    		}
    		for(int j = i; j<row-i;j++){
    			//left-->top
    			matrix[i][offset-j]=matrix[j][i];
    		}
    		for(int j = i; j<row-i;j++){
    			//bottom-->left
    			matrix[j][i]=matrix[offset-i][j];
    		}
    		for(int j = i; j<row-i;j++){
    			//right -->bottom 
    			matrix[offset-i][j] = matrix[offset-j][offset-i];
    		}
    		for(int j = i; j<row-i;j++){
    			//top-->right
    			matrix[j][offset-i]= temp.get(j);
    		}
    			
    	}
    	System.out.println("\n\n Rotated matrix:\n\n\n");
    	for(int ii = 0;ii<row;ii++){
    		for(int jj = 0; jj<column;jj++){
  System.out.print(matrix[ii][jj]+" ");		
    		}
    		System.out.print("\n");
    	}
    	
    }
	}

}