package com.tree;

public class IsSymmetricBT {

	Node root1;

	public boolean isSymmetric(Node root) {
		return isMirrorImage(root, root);
	}

	public boolean isMirrorImage(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return true;
		if (node1 != null && node2 != null && node1.data == node2.data)
			return (isMirrorImage(node1.left, node2.right) && isMirrorImage(node1.right, node2.left));
		return false;
	}

	public static void main(String[] args) {

		IsSymmetricBT tree = new IsSymmetricBT();

		tree.root1 = new Node(1);
		tree.root1.left = new Node(2);
		tree.root1.right = new Node(2);
		tree.root1.left.left = new Node(3);
		tree.root1.left.right = new Node(4);
		tree.root1.right.left = new Node(4);
		tree.root1.right.right = new Node(3);

		if (tree.isSymmetric(tree.root1))
			System.out.println("tree is symmetric");
		else
			System.out.println("tree is asymmetric");
	}
}
