package com.linkedlist;

public class LinkedList {
  // Node head;

  public static void main(String[] args) {

    LinkedList llist = new LinkedList();

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

    Node head1 = new Node(1);
    Node head2 = new Node(1);
    head1.next = third;
    head2.next = six;

    Node newby1 = new Node(9);
    head = llist.insertAtBegin(head, newby1);

    Node newby2 = new Node(12);
    head = llist.insertAtGivenPos(head, newby2, 4);

    Node newby3 = new Node(15);
    head = llist.insertAtEnd(head, newby3);

    head = llist.deleteAtBegin(head);
    head = llist.deleteAtEnd(head);
    head = llist.deleteAtGivenPos(head, 4);
    // head = llist.deleteAtMiddle(head);

    llist.printList(head);

    llist.printList(head1);
    llist.printList(head2);
    System.out.println(llist.compare(head1, head2));

    head = llist.reverseList(head);

    llist.printList(head);
    // llist.startingOfLoop(head);

    System.out.println("#########################");

    Node head3 = new Node(1);
    Node a = new Node(2);
    Node b = new Node(3);
    Node c = new Node(2);
    Node d = new Node(1);

    head3.next = a;
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = null;
    llist.printList(head3);
    Node head4 = llist.reverseList(head3);
    llist.printList(head4);
    llist.printList(head3);
    if (llist.compare(head3, head4)) {
      System.out.println("head3 is pallindrome");
    } else {
      System.out.println("head3 is not pallindrome");
    }
  }

  public void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("");
  }

  public Node detectLoop(Node head) {
    Node meetingPoint = null;
    Node hare = head;
    Node tortoise = head;
    boolean flag = false;
    while (tortoise != null && hare != null) {
      tortoise = tortoise.next;
      hare = hare.next.next;
      if (hare == tortoise) {
        flag = true;
        meetingPoint = hare;
        System.out.println("This linked list contains loop");
        System.out.println("meeting point node is : " + meetingPoint.data);
        break;
      }
    }
    if (flag == false) {
      System.out.println("This linked list doesn't contains loop");
    }
    return meetingPoint;
  }

  public Node startingOfLoop(Node head) {
    Node hare = null;
    Node tortoise = null;
    Node startingPoint = null;
    Node meetingPoint = detectLoop(head);
    if (meetingPoint != null) {
      int count = 0;
      hare = meetingPoint;
      tortoise = meetingPoint;
      while (tortoise != null) {
        tortoise = tortoise.next;
        count++;
        if (hare == tortoise) {
          System.out.println("no of elements in loop is : " + count);
          break;
        }
      }
      tortoise = head;
      hare = head;
      while (count > 0) {
        hare = hare.next;
        count--;
      }
      while (tortoise != null && hare != null) {
        tortoise = tortoise.next;
        hare = hare.next;
        if (hare == tortoise) {
          startingPoint = hare;
          System.out.println("starting point node is : " + startingPoint.data);
          break;
        }
      }
    }
    return startingPoint;
  }

  private Node reverseList(Node head) {
    if (head == null) return null;

    if (head.next == null) return head;

    Node newHeadNode = reverseList(head.next);

    head.next.next = head;
    head.next = null;
    return newHeadNode;
  }

  private Node insertAtBegin(Node head, Node newby) {
    newby.next = head;
    head = newby;
    return head;
  }

  private Node insertAtGivenPos(Node head, Node newby, int i) {
    Node temp = head;
    while (temp.data != i) {
      temp = temp.next;
    }
    newby.next = temp.next;
    temp.next = newby;

    return head;
  }

  private Node insertAtEnd(Node head, Node newby) {
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newby;
    newby.next = null;
    return head;
  }

  private Node deleteAtBegin(Node head) {
    if (head == null) return null;
    Node temp = head;
    head = head.next;
    return head;
  }

  private Node deleteAtGivenPos(Node head, int i) {
    Node temp = head;
    while (temp.data != i) {
      temp = temp.next;
    }
    Node temp1 = temp.next;
    temp.next = temp1.next;
    return head;
  }

  private Node deleteAtEnd(Node head) {
    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
    return head;
  }

  private Node deleteAtMiddle(Node head) {
    Node hare = head;
    Node tortoise = head;
    Node prev = null;
    while (hare != null && hare.next != null) {
      prev = tortoise;
      tortoise = tortoise.next;
      hare = hare.next.next;
    }
    prev.next = tortoise.next;
    return head;
  }

  private boolean compare(Node head1, Node head2) {
    Node temp1 = head1;
    Node temp2 = head2;
    boolean flag = false;
    if (head1.next == null && head2.next == null) {
      if (head1.data == head2.data) {
        flag = true;
      }
    }
    while (temp1.next != null && temp2.next != null) {
      if (temp1.data == temp2.data) {
        temp1 = temp1.next;
        temp2 = temp2.next;
        flag = true;
      } else {
        flag = false;
        break;
      }
    }
    return flag;
  }
}
