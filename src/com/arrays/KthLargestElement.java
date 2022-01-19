package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
  public static void main(String[] args) {

    int[] arr = {3, 2, 1, 5, 6, 4, 7};
    int k=5;
    System.out.println(k+"th smallest element : "+findKthLargest(arr, k));
  }

  public static void view(PriorityQueue<Integer> minHeap) {
    for (Integer x : minHeap) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  public static int findKthLargest(int[] arr, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
    /*
    minHeap.add(3);
    minHeap.add(13);
    minHeap.add(9);
    minHeap.add(16);
    minHeap.add(21);
    minHeap.add(12);
    minHeap.add(7);
    view(minHeap);*/

    for (int i : arr) {
      minHeap.add(i);
      view(minHeap);
      if (minHeap.size() > k) {
        System.out.println("removing min...."+minHeap.remove());
        view(minHeap);
      }
    }
    return minHeap.remove();
  }
}
