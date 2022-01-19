package com.linkedlist;

public class LinkedListClass {

  public static void main(String[] args) {
    //
    Node head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node four = new Node(4);
    Node five = new Node(5);
    Node six = new Node(6);
    Node seven = new Node(7);

    head.next = second;
    second.next = third;
    third.next = four;
    four.next = five;
    five.next = six;
    six.next = seven;
    seven.next = null;

    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }
}
