package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
  Node root1;

  // [3,9,20,null,null,15,7]
  public static void main(String[] args) {
    BFS tree = new BFS();
    tree.root1 = new Node(1);
    tree.root1.left = new Node(2);
    tree.root1.right = new Node(3);
    tree.root1.left.right = new Node(4);
    tree.root1.right.left = new Node(5);
    tree.root1.right.right = new Node(6);
    tree.root1.right.left.left = new Node(7);

    System.out.println(tree.minDepth(tree.root1));
  }

  public int minDepth(Node root) {
    if (root == null) return 0;
    int depth = 1;
    Queue<Node> q = new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
      int size = q.size();
      // for each level
      for (int i = 0; i < size; i++) {
        Node node = q.poll();
        if (node.left == null && node.right == null) {
          return depth;
        }
        if (node.left != null) {
          q.offer(node.left);
        }
        if (node.right != null) {
          q.offer(node.right);
        }
      }
      depth++;
    }
    return depth;
  }
}
