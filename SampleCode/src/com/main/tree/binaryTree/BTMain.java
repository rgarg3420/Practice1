package com.main.tree.binaryTree;

import java.util.ArrayList;
import java.util.Collections;

import com.main.BinarySearchTree.BinarySearchTree;

public class BTMain {

	public static void main(String[] args) {
		System.out.println("enter elements :");
		int input[] = { 10, 5, 3, 4, 6, 13, 14, 11, 12 };
		BTree binaryTree = new BTree();
		// BTNode node = new BTNode(10);
		for (int i = 0; i < input.length; i++) {
			binaryTree.insert(input[i]);
		}
		binaryTree.inOrder();
		binaryTree.search(5);
		binaryTree.search(12);
		binaryTree.search(20);
		
		binaryTree.isLeaf(4);
		binaryTree.isLeaf(5);
		binaryTree.isLeaf(11);
		
		Integer sum = 0;
	ArrayList<Integer> path = new ArrayList<Integer>();
	path = binaryTree.printPath(14);
	 Collections.reverse(path);
for(int i :path){
    System.out.println(i);
    sum = sum+i;
}
System.out.println("The sum of nodes is "+ sum);

int sumLeaf = binaryTree.sumLeaf();
System.out.println("The sum of leaf is :"+ sumLeaf);

path = binaryTree.sumPath(37);
for(int i :path){
    System.out.println(i);
 
}

	}

}
