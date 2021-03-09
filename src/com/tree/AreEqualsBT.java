package com.tree;

public class AreEqualsBT {

	Node root1;
	Node root2;

	public boolean equals(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return true;
		else if (node1 != null && node2 == null)
			return false;
		else if (node1 == null && node2 != null)
			return false;
		else {
			return node1.data == node2.data && equals(node1.left, node2.left) && equals(node1.right, node2.right);
		}
	}

	public static void main(String[] args) {

		AreEqualsBT tree = new AreEqualsBT();

		tree.root1 = new Node(1);
		tree.root1.left = new Node(2);
		tree.root1.right = new Node(3);
		tree.root1.left.right = new Node(4);
		tree.root1.right.left = new Node(5);
		tree.root1.right.right = new Node(6);
		tree.root1.right.left.left = new Node(7);

		tree.root2 = new Node(1);
		tree.root2.left = new Node(2);
		tree.root2.right = new Node(3);
		tree.root2.left.right = new Node(4);
		tree.root2.right.left = new Node(5);
		tree.root2.right.right = new Node(6);

		if (tree.equals(tree.root1, tree.root2))
			System.out.println("trees are equal");
		else
			System.out.println("trees are not equal");

	}
}
