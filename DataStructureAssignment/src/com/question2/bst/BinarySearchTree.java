package com.question2.bst;

import com.question2.driver.SkewedTree;

public class BinarySearchTree {
	public SkewedTree node;
	public SkewedTree prevNode = null;
	public SkewedTree headNode = null;

	/**
	 * Function to flatten the binary search tree into a skewed tree in increasing
	 * order
	 */
	public void createSkewedTree(SkewedTree root, int order) {

		// Base Case
		if (root == null) {
			return;
		}

		// Condition to check the order in which the skewed tree to maintained
		if (order > 0) {
			createSkewedTree(root.right, order);
		} else {
			createSkewedTree(root.left, order);
		}
		SkewedTree rightNode = root.right;
		SkewedTree leftNode = root.left;

		// Condition to check if the root Node of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		// Similarly recurse for the left / right subtree on the basis of the order
		// required
		if (order > 0) {
			createSkewedTree(leftNode, order);
		} else {
			createSkewedTree(rightNode, order);
		}
	}

	// Function to traverse the right skewed tree using recursion
	public void traverseRightSkewed(SkewedTree root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + "  ");
		traverseRightSkewed(root.right);
	}
}
