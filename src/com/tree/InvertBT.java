package com.tree;

public class InvertBT {
    static Node root;
    public static Node invertBT(Node node){
        if(node==null)
            return null;
        Node temp =invertBT(node.left);
        node.left= invertBT(node.right);
        node.right=temp;

        return node;
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("jai");
        root = invertBT(root);
        System.out.println(PrintBT.print(root));
    }
}
