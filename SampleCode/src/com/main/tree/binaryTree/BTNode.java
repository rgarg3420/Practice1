package com.main.tree.binaryTree;

public class BTNode {

	BTNode left ;
	BTNode right;
	int data;
	int level;
	
	
	public BTNode() {
		
		this.left = null;
		this.right = null;
		this.data = 0;
		this.level = 0;
	}
	
	
	
	public BTNode(int data) {
		super();
		this.left = null;
		this.right = null;
		this.data = data;
		this.level = level;
	}


	public BTNode(BTNode left, BTNode right, int data, int level) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
		this.level = level;
	}
	
	
	public BTNode getLeft() {
		return left;
	}
	public void setLeft(BTNode left) {
		this.left = left;
	}
	public BTNode getRight() {
		return right;
	}
	public void setRight(BTNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
