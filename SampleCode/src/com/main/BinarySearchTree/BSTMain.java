package com.main.BinarySearchTree;

public class BSTMain {

    public static void main(String[] args) {

	BinarySearchTree bst = new BinarySearchTree();

	bst.insert(50);
	bst.insert(25);
	bst.insert(75);
	bst.insert(1);
	bst.insert(100);
	bst.insert(37);
	bst.insert(63);
	bst.insert(90);
	bst.insert(10);

	int nodeVal = 1;

	System.out.println("_____________________In Order___________________________");

	bst.printInRecord();
	System.out.println("_____________________Pre Order___________________________");

	bst.printPreOrder();
	System.out.println("_____________________Post Order___________________________");

	bst.printPostOrder();
	System.out.println("-----------------------------------------------------------");
	int maxvalue = bst.findMax();
	System.out.println("__________MAX VALUE____________" + maxvalue);

	int minvalue = bst.findMin();
	System.out.println("__________MIN VALUE_______________" + minvalue);

	int treeheight = bst.treeHright();
	System.out.println("__________TREE HEIGHT_______________" + treeheight);

	int nodeHieght = bst.nodeHeight(nodeVal);
	System.out.println(nodeVal + "__________NODE HEIGHT_______________" + nodeHieght);

	int treeDegree = bst.treeDegree();
	System.out.println(nodeVal + "__________TREE DEGREE_______________" + treeDegree);

	boolean isBinaryTree = bst.isBinary();
	System.out.println("__________IS BINARY_______________" + isBinaryTree);

	System.out.println("____________________________________________________");
	String linkListFormat = bst.converDoubleLinkList();
	System.out.println(linkListFormat);

	System.out.println("____________________________________________________");
	int sum = bst.findSum();
	System.out.println("SUM:   " + sum);

	System.out.println("____________________________________________________");
	int val = 86;
	boolean hasSum = bst.hasSumPath(val);
	System.out.println("The sum " + val + "  has a path :" + hasSum);

	System.out.println("____________DFS________________");
	int s = bst.sumToNode(1);
	System.out.println("SUM: " + s);

    }
}
