package com.tree;

public class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }

  /*public static Node createBT(Integer[] arr, Node root, int i) {
    if (i < arr.length) {
      Node temp = new Node(arr[i]);
      root = temp;
      // insert left child
      root.left = createBT(arr, root.left, 2 * i + 1);

      // insert right child
      root.right = createBT(arr, root.right, 2 * i + 2);
    }
    return root;
  }*/
}
