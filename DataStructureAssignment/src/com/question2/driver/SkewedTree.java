package com.question2.driver;

import com.question2.bst.BinarySearchTree;

public class SkewedTree {
	public int value;
	public SkewedTree left;
	public SkewedTree right;

	/**
	 * Helper function that allocates a new node with the given data and NULL left
	 * and right pointers.
	 */
	SkewedTree(int item) {
		value = item;
		left = right = null;
	}

	// Driver Function
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.node = new SkewedTree(50);
		tree.node.left = new SkewedTree(30);
		tree.node.right = new SkewedTree(60);
		tree.node.left.left = new SkewedTree(10);
		tree.node.right.left = new SkewedTree(55);

		/**
		 * Order of the Skewed tree can be defined as follows - For Increasing order - 0
		 * For Decreasing order - 1
		 */
		int order = 0;
		tree.createSkewedTree(tree.node, order);
		System.out.println("Rightly Skewed Tree is as follows : \n");
		tree.traverseRightSkewed(tree.headNode);
		
		/**
		 * 	   50              10
		 *    / \               \
		 *   30 60       =>      30
		 *  /   /                 \
		 * 10 55                   50
		 *                          \
		 *                           55
		 *                            \
		 *                             60
		 */

	}
}