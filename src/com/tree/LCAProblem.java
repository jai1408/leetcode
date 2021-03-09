package com.tree;

import java.util.ArrayList;
import java.util.List;

public class LCAProblem {

	Node root;
	private List<Integer> path1 = new ArrayList<>();
	private List<Integer> path2 = new ArrayList<>();

	private int findLCA(Node node, int n1, int n2) {
		path1.clear();
		path2.clear();
		if (!findPath(node, n1, path1) || !findPath(node, n2, path2)) {
			System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
			System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
			return -1;
		}
		int i;
		for (i = 0; i < path1.size() && i < path2.size(); i++) {
			if (!path1.get(i).equals(path2.get(i)))
				break;
		}
		return path1.get(i - 1);
	}

	private boolean findPath(Node node, int n, List<Integer> path) {

		if (node == null)
			return false;
		path.add(node.data);
		if (node.data == n)
			return true;
		if (node.left != null && findPath(node.left, n, path))
			return true;
		if (node.right != null && findPath(node.right, n, path))
			return true;

		path.remove(path.size() - 1);

		return false;
	}

	public static void main(String[] args) {

		LCAProblem tree = new LCAProblem();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.println("LCA(4, 5): " + tree.findLCA(tree.root, 4, 5));
		System.out.println("LCA(4, 6): " + tree.findLCA(tree.root, 4, 6));
		System.out.println("LCA(9, 6): " + tree.findLCA(tree.root, 9, 6));
		System.out.println("LCA(2, 4): " + tree.findLCA(tree.root, 2, 4));

	}
}