package com.problems.problemSolving.trees;

//Java implementation to construct
//Binary Tree in level order fashion


//**********below is the class Node/BinaryTreeWithRecursion************
class BinaryTreeWithRecursion {
	
	int data;
	int rcount;
	int lcount;
	
		BinaryTreeWithRecursion left;
	BinaryTreeWithRecursion right;
	BinaryTreeWithRecursion(int data)
	{
		this.data = data;
		this.rcount = this.lcount = 0;
		this.left = this.right = null;
	}
	
	// Function for inorder Traversal of tree.
	static void inorder(BinaryTreeWithRecursion root)
	{
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	// Function to check whether the given
	// Binary tree is a perfect binary tree
	// using the no. of BinaryTreeWithRecursions in tree.
	static boolean isPBT(int count)
	{
		count = count + 1;
		
		// Loop to check the count is in 
		// the form of 2^(n-1)
		while (count % 2 == 0)
			count = count / 2;
		if (count == 1)
			return true;
		else
			return false;
	}
	
	// Recursive function to insert
	// elements in a binary tree
	static BinaryTreeWithRecursion insert(BinaryTreeWithRecursion root, int data)
	{
		
		// Condition when root is NULL
		if (root == null) {
			BinaryTreeWithRecursion n = new BinaryTreeWithRecursion(data);
			return n;
		}
		
		// Condition when count of left sub-tree
		// BinaryTreeWithRecursions is equal to the count 
		// of right sub-tree BinaryTreeWithRecursions
		if (root.rcount == root.lcount) {
			root.left = insert(root.left, data);
			root.lcount += 1;
		}
		
		// Condition when count of left sub-tree 
		// BinaryTreeWithRecursions is greater than
		// the right sub-tree BinaryTreeWithRecursions
		else if (root.rcount < root.lcount) {
			
			// Condition when left Sub-tree is 
			// Perfect Binary Tree then Insert 
			// in right sub-tree.
			if (isPBT(root.lcount)) {
				root.right = insert(root.right, data);
				root.rcount += 1;
			}
			
			// If Left Sub-tree is not Perfect 
			// Binary Tree then Insert in left sub-tree
			else {
				root.left = insert(root.left, data);
				root.lcount += 1;
			}
		}
		return root;
	}
	
		// Driver Code
	public static void main(String args[])
	{
		int arr[] = { 8, 6, 7, 12, 5, 1, 9 };
		int size = 7;
		BinaryTreeWithRecursion root = null;
		
		// Loop to insert BinaryTreeWithRecursions in
		// Binary Tree in level order Traversal
		for (int i = 0; i < size; i++)
			root = insert(root, arr[i]);
		inorder(root);
	}
}
