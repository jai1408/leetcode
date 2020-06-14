package com.linkedlist;

public class AddTwoLinkedList {

   /* public Node add(Node n1, Node n2) {
        int carry = 0;
        Node newNode = new Node(0);
        while (n1.next == null || n2.next != null) {
            int x = n1
        }
    }*/

    public int getSize(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

}
