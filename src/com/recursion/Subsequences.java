package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {

  public static void main(String[] args) {
    int[] arr = {3, 1, 2};
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> innerList = new ArrayList<>();
    subsequences(list, innerList, arr, 0);
    System.out.println(list);
  }

  public static void subsequences(
      List<List<Integer>> list, List<Integer> innerList, int[] arr, int index) {
    if (index == arr.length) {
      list.add(innerList);
      return;
    }
    innerList.add(arr[index]);
    subsequences(list, new ArrayList<>(innerList), arr, index + 1);
    innerList.remove(innerList.size() - 1);
    subsequences(list, new ArrayList<>(innerList), arr, index + 1);
  }
}
