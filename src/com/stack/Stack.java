package com.stack;

class Stack {
  int top = -1;
  char[] items = new char[100];

  void push(char x) {
    if (top == 99) {
      System.out.println("Stack full");
    } else {
      items[++top] = x;
    }
  }

  char pop() {
    if (top == -1) {
      System.out.println("Underflow error");
      return '\0';
    } else {
      char element = items[top];
      top--;
      return element;
    }
  }

  boolean isEmpty() {
    return top == -1;
  }
}
