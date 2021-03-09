package com.tree;

public class OrderBT {
  Node root1;

  public static void preOrder(Node node) {
    if (node == null) return;
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  public static void postOrder(Node node) {
    if (node == null) return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.data + " ");
  }

  public static void inOrder(Node node) {
    if (node == null) return;
    inOrder(node.left);
    System.out.print(node.data + " ");
    inOrder(node.right);
  }

  public static void printGivenLevel(Node root, int level) {
    if (root == null) return;
    if (level == 1) System.out.print(root.data + " ");
    else if (level > 1) {
      printGivenLevel(root.left, level - 1);
      printGivenLevel(root.right, level - 1);
    }
  }

  public static void main(String[] args) {

    OrderBT tree = new OrderBT();

    tree.root1 = new Node(1);
    tree.root1.left = new Node(2);
    tree.root1.right = new Node(3);
    tree.root1.left.right = new Node(4);
    tree.root1.right.left = new Node(5);
    tree.root1.right.right = new Node(6);
    tree.root1.right.left.left = new Node(7);

    OrderBT.preOrder(tree.root1);
    System.out.println("");
    OrderBT.inOrder(tree.root1);
    System.out.println("");
    OrderBT.postOrder(tree.root1);
    System.out.println("");
    int height = HeightBT.height(tree.root1);
    for (int i = 0; i < height; i++) {
      OrderBT.printGivenLevel(tree.root1, i);
    }
  }
}
