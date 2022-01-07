package com.tree;

public class HeightBT {
  Node root1;

  public static int height(Node node) {
    if (node == null) return 0;
    else return 1 + Integer.max(height(node.left), height(node.right));
  }

  public static void main(String[] args) {

    HeightBT tree = new HeightBT();
    tree.root1 = new Node(1);
    tree.root1.left = new Node(2);
    tree.root1.right = new Node(3);
    tree.root1.left.right = new Node(4);
    tree.root1.right.left = new Node(5);
    tree.root1.right.right = new Node(6);
    tree.root1.right.left.left = new Node(7);

    // [1,2,3,null,4,5,6,null,null,null,null,7,null,null,null]
    /*Integer[] arr =
        new Integer[] {1, 2, 3, null, 4, 5, 6, null, null, null, null, 7, null, null, null};
    Node root = Node.createBT(arr, root1, 0);*/

    System.out.println(HeightBT.height(tree.root1));
  }
}
