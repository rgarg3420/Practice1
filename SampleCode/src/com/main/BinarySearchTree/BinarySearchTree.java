package com.main.BinarySearchTree;

import com.main.LinkList.Link;

public class BinarySearchTree {

    public Node root;
    private boolean flag = true;
    private Link first;
    private Link last;
    private Node parent = null;
    private int sum = 0;

    // *****************************************************************************************************************************************//

    /**
     * @param value
     */
    public void insert(int value) {

	Node node = new Node<>(value);

	if (root == null) {
	    root = node;
	    return;
	} else {
	    insertRecursive(root, node);
	}

    }

    /**
     * @param root
     * @param currentNode
     */
    private void insertRecursive(Node root, Node currentNode) {

	if (root.value > currentNode.value) { // if root node value > current
					      // node , go left
	    if (root.left == null) { // if no further left node , make left
				     // child of root node as current node
		root.left = currentNode;
	    } else {
		insertRecursive(root.left, currentNode); // make left child of
							 // root node , new root
							 // node.
	    }
	} else {
	    if (root.value < currentNode.value) { // if root node value <
						  // current node , go right
		if (root.right == null) { // if no further right node , make
					  // right child of root node as current
					  // node.
		    root.right = currentNode;
		} else {
		    insertRecursive(root.right, currentNode); // make right
							      // child of node ,
							      // new root node.
		}
	    }
	}

    }

    /**
     * 
     */
    public void printInRecord() {
	printInRecord(root);

    }

    /**
     * @param root
     */
    private void printInRecord(Node root) {

	if (root == null) {
	    return;
	}
	printInRecord(root.left);
	System.out.println("Node Value :" + root.value);

	printInRecord(root.right);
    }

    public void printPreOrder() {
	printPreOrder(root);
    }

    private void printPreOrder(Node root) {
	if (root == null) {
	    return;
	}
	System.out.println("Node value" + root.value);
	printPreOrder(root.left);
	printPreOrder(root.right);

    }

    public void printPostOrder() {
	printPostOrder(root);
    }

    private void printPostOrder(Node root) {
	if (root == null) {
	    return;
	}
	printPreOrder(root.left);
	printPreOrder(root.right);
	System.out.println("Node value" + root.value);
    }

    public int findMin() {

	if (root == null) {
	    return 0;
	}

	Node node = root;
	while (node.left != null) {
	    node = node.left;
	}
	return node.value;
    }

    public int findMax() {

	if (root == null) {
	    return 0;
	}

	Node node = root;
	while (node.right != null) {
	    node = node.right;
	}
	return node.value;
    }

    public int treeHright() {
	int height = treeHeight(root);
	return height;
    }

    private int treeHeight(Node root) {
	if (root == null) {
	    return 0;
	}
	if (root.left == null && root.right == null) {
	    return 1;
	}
	int countL = 0;
	int countR = 0;

	countL = treeHeight(root.left);
	countR = treeHeight(root.right);

	return (countL > countR) ? countL + 1 : countR + 1;

    }

    public int nodeHeight(int val) {

	int height = NodeHeight(root, val, 1);
	return height;

    }

    private int NodeHeight(Node root, int val, int level) {

	if (root == null) {
	    return 0;
	}

	if (root.value == val) {
	    return level;
	}

	int countL = 0;
	int countR = 0;

	countL = NodeHeight(root.left, val, level + 1);
	if (countL != 0) {
	    return countL;
	}
	countR = NodeHeight(root.right, val, level + 1);

	return countR;

    }

    public int treeDegree() {
	int degree = treeDegree(root);
	return degree;
    }

    private int treeDegree(Node root) {

	if (root == null) {
	    return 0;
	}
	if (root.left == null && root.right == null) {
	    return 0;
	}
	if (root.left != null && root.right != null) {
	    return 2;
	}
	if (root.left != null) {
	    return 1;
	}
	if (root.right != null) {
	    return 1;
	}

	int degreeR = treeDegree(root.right);
	int degreeL = treeDegree(root.left);

	return (degreeR > degreeL) ? degreeR : degreeL;

    }

    public boolean isBinary() {

	boolean isBinary = isBinary(root, Integer.MIN_VALUE, Integer.MAX_VALUE, "start");

	return isBinary;
    }

    static int run = 0;

    private boolean isBinary(Node nRoot, int min, int max, String side) {
	if (nRoot != null) {
	    System.out.println("RUN :  " + run + "   Node Value :  " + nRoot.value + "   MINIMUM :  " + min
		    + "   MAXIMUM :  " + max + "   SIDE  :   " + side);
	    run++;
	}
	if (nRoot == null) {
	    System.out.println("RUN :  " + run + "   Node Value :  NULL" + "   MINIMUM :  " + min + "   MAXIMUM :  "
		    + max + "  SIDE  :" + side);
	    run++;
	    return true;
	}
	if (nRoot.value < min || nRoot.value > max) {
	    return false;
	}

	return (isBinary(nRoot.left, min, nRoot.value, "left") && isBinary(nRoot.right, nRoot.value, max, "right"));
    }

    public void delete(int number) {
	deleteNodeBST(root, number);
    }

    private boolean deleteNodeBST(Node node, int value) {
	if (node == null) {
	    return false;
	}
	if (node.value == value) { // if node value is equal to value to be
				   // deleted.

	    if ((node.left == null) && (node.right == null)) {
		// leaf node
		node = null;
		return true;
	    }

	    if ((node.left != null) && (node.right != null)) {
		// node with two children
		node.value = (findMinimumAndReturnWithDelete(node.right));
		return true;
	    }

	    // either left child or right child
	    if (node.left != null) {
		parent.left = node.left;
		node = null;
		return true;
	    }

	    if (node.right != null) {
		parent.right = node.right;
		node = null;
		return true;
	    }
	}
	parent = node;
	if (node.value > value) {
	    return deleteNodeBST(node.left, value);
	} else {
	    return deleteNodeBST(node.right, value);
	}
    }

    int findMinimumAndReturnWithDelete(Node node) {
	if (node.left == null) {
	    int v = node.value;
	    node = null;
	    return v;
	}
	return findMinimumAndReturnWithDelete(node.left);
    }

    public String converDoubleLinkList() {
	converDoubleLinkList(root);

	return toString();
    }

    private void converDoubleLinkList(Node root) {
	if (root == null) {
	    return;
	}

	converDoubleLinkList(root.right);
	Link newLink = new Link(root.value);
	if (first == null) {
	    last = newLink;
	} else {
	    first.previous = newLink;
	}
	newLink.next = first;
	first = newLink;

	converDoubleLinkList(root.left);

    }

    public String toString() {
	String str1 = "List (first-->last): ";
	Link current = first;
	while (current != null) {
	    str1 += current.toString();
	    current = current.next;
	}

	String str2 = "List (last-->first): ";
	current = last;
	while (current != null) {
	    str2 += current.toString();
	    current = current.previous;
	}
	return str1 + "\n" + str2;
    }

    public int findSum() {
	return findSum(root);
    }

    private int findSum(Node nRoot) {

	if (nRoot == null) {
	    return 0;
	}
	findSum(nRoot.right);
	sum = sum + nRoot.value;

	findSum(nRoot.left);

	return sum;
    }

    public boolean hasSumPath(int sum) {
	return hasSumPath(root, sum, "start");
    }

    private boolean hasSumPath(Node nRoot, int sum, String side) {
	{
	    /* return true if we run out of tree and sum==0 */
	    if (nRoot == null) {

		System.out.println("ROOT IS NULL  :  " + side);
		return (sum == 0);
	    }

	    else {
		boolean ans = false;

		/* otherwise check both subtrees */
		int subSum = sum - nRoot.value;
		System.out.println("SUB SUM :" + subSum + "   SUM:  " + sum + "   NODE:  " + nRoot.value + "   SIDE:  "
			+ side);

		/* If we reach a leaf node and sum becomes 0 then return true */

		return (hasSumPath(nRoot.left, subSum, "LEFT") || hasSumPath(nRoot.right, subSum, "RIGHT"));
	    }

	}
    }

    public int sumToNode(int val) {
	int sum = sumToNode(root, 0, "start", val);
	return sum;
    }

    static int sumval;

    private int sumToNode(Node nRoot, int sum, String side, int val) {
	boolean flag = true;
	if (nRoot == null) {
	    System.out.println("value :  NULL  " + "SIDE:  " + side);
	    return 0;
	}
	System.out.println("value :  " + nRoot.value + "  SIDE:   " + side);
	sum = sum + nRoot.value;
	System.out.println("Sum:  " + sum);
	if (val == nRoot.value) {
	    sumval = sum;
	    flag = false;

	}
	if (flag) {

	    sumToNode(nRoot.left, sum, "LEFT", val);
	    sumToNode(nRoot.right, sum, "RIGHT", val);
	}
	return sumval;
    }

}
