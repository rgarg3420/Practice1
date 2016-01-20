package com.main.tree.binaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class BTree {

    private BTNode root;

    public BTree() {
	root = null;
    }

    public void insert(int data) {
	if (root == null) {
	    root = new BTNode(data);
	    root.level = 0;
	} else {
	    insert(root, data);
	}
    }

    public void insert(BTNode node, int value) {
	if (value < node.data) {
	    if (node.left != null) {
		insert(node.left, value);
	    } else {
		System.out.println("  Inserted " + value + " to left of node "
			+ node.data);
		node.left = new BTNode(value);
	    }
	} else if (value > node.data) {
	    if (node.right != null) {
		insert(node.right, value);
	    } else {
		System.out.println("  Inserted " + value + " to right of node "
			+ node.data);
		node.right = new BTNode(value);
	    }

	}
    }

    public void inOrder() {
	printInOrder(root);
    }

    public void printInOrder(BTNode node) {
	if (node != null) {
	    printInOrder(node.left);
	    int level = getLevel(root, node.data);
	    node.level = level;
	    System.out.println("  Traversed " + node.data + " at level :"
		    + node.level);
	    printInOrder(node.right);
	}
    }

    public boolean search(int data) {
	boolean flag = false;
	boolean isNode = searchNode(root, data, flag);
	if (isNode)
	    System.out.println("Node found! " + data);
	else
	    System.out.println("Node not found! " + data);
	return isNode;
    }

    public boolean searchNode(BTNode node, int data, boolean flag) {

	if (node != null && !flag) {
	    flag = searchNode(node.left, data, flag);
	    if ((node.data == data) && !flag) {
		flag = true;
		System.out.println("Flag is " + flag);
	    }
	    flag = searchNode(node.right, data, flag);
	}

	return flag;
    }

    void isLeaf(int data) {
	System.out.println("START TRAVERSE!");
	// allLeaf(root, data);
	isLeaf(root, data);

    }

    private int sum = 0;

    int sumLeaf() {
	allLeaf(root);
	return sum;
    }

    boolean allLeaf(BTNode node) {
	if (node == null) {
	    return false;
	}
	if (node.left == null && node.right == null) {
	    System.out.println("Node : " + node.data + " is leaf node");
	    sum = sum +node.data;
	    return true;
	}
	return (allLeaf(node.left) & allLeaf(node.right));
    }

 /*   
    boolean isLeaf(BTNode node, int data) {
	   if (node == null) {
	    return false;
	   }
	System.out.println("Node traversed :"+ node.data);
	if (node.left == null && node.right == null && node.data == data) {
	    System.out.println("Node : " + node.data + " is leaf node");
	    return true;
	}
	return (isLeaf(node.left, data) || isLeaf(node.right, data));
	}*/
    
    boolean isLeaf(BTNode node, int data)
    {
	
        if(node == null)       
            return false;
        System.out.println("traverse node :"+ node.data);
        if(node.left == null && node.right == null && node.data == data)      
            return true;
        isLeaf(node.left, data); 
        isLeaf(node.right,data);      
       
    }    
    
    /*boolean isLeaf(BTNode node, int data) {
	boolean flag = false;
	boolean flag1 = false;
	   if (node == null) {
	    return false;
	   }
	System.out.println("Node traversed :"+ node.data);
	if (node.left == null && node.right == null && node.data == data ) {
	    System.out.println("Node : " + node.data + " is leaf node");
	    flag = true;
	    flag1 = true;
	   
	}
	else if ((node.left != null || node.right != null) && node.data == data) {
	    System.out.println("Node : " + node.data + " is not leaf node");
	   flag = false;
	   flag1 = true;
	}
	if(!flag1){
	   isLeaf(node.left, data); 
		   isLeaf(node.right, data);
	}
	return flag;
	}
    */
    
   /* boolean isLeaf(BTNode node, int data) {
	  if(node.left == null && node.right == null) {
	    // This is a leaf node
	    return true;
	  } else {
	    // continue on the right subtree
	    if(node.right != null) {
	      isLeaf(node.right, data);
	    }
	    // continue on the left subtree
	    if(node.left != null) {
	      isLeaf(node.left, data);
	    }
	  }
	  return false;
	} */
    
    
    

    private ArrayList<Integer> path = new ArrayList<Integer>();
    private ArrayList<Integer> sumPath = new ArrayList<Integer>();

    public ArrayList<Integer> printPath(int data) {
	printPath(root, data);

	return path;
    }
    
    public ArrayList<Integer> sumPath(int sum) {
	hasSumPath(root, sum);

	return sumPath;
    }

    private boolean printPath(BTNode node, int data) {

	if (node == null) {
	    return false;
	}
	if (node.data == data || printPath(node.left, data)
		|| printPath(node.right, data)) {
	    path.add(node.data);
	    return true;
	}

	return false;
    }
    
    private boolean hasSumPath(BTNode node, int sum) {

	if (node == null) {
	    return false;
	}
	int subSum = sum - node.data;
	

	if (subSum == 0 ||node.data == subSum || hasSumPath(node.left, subSum)
		|| hasSumPath(node.right, subSum)) {
	    sumPath.add(node.data);
	    return true;
	}

	return false;
    }
    
    
    
    

    int getLevel(BTNode node, int data) {
	int level = getNodeLevel(node, data, 0);
	return level;
    }

    private int getNodeLevel(BTNode node, int data, int lvl) {

	if (node == null) {
	    return 0;
	}
	if (node.data == data) {
	    return lvl;
	}

	int nextLevel = getNodeLevel(node.left, data, lvl + 1);
	if (nextLevel != 0) {
	    return nextLevel;
	}

	nextLevel = getNodeLevel(node.right, data, lvl + 1);
	return nextLevel;
    }

}