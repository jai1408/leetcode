package com.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum1 {
  public static void main(String[] args) {
    int[] arr = {3, 1, 2};
    List<Integer> list = new ArrayList<>();
    int sum = 0, index = 0;
    subsetsum(list, arr, index, sum);
    Collections.sort(list);
    System.out.println(list);
  }

  public static void subsetsum(List<Integer> list, int[] arr, int index, int sum) {
    if (index == arr.length) {
      list.add(sum);
      return;
    }
    sum += arr[index];
    subsetsum(list, arr, index + 1, sum);
    sum -= arr[index];
    subsetsum(list, arr, index + 1, sum);
  }
}
