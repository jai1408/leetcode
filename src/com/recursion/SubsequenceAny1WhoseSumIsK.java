package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceAny1WhoseSumIsK {
  public static void main(String[] args) {
    int[] arr = {3, 1, 2};
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> innerList = new ArrayList<>();
    int k = 3, sum = 0, index = 0;
    subsequences(list, innerList, arr, index, sum, k);
    System.out.println(list);
  }

  public static boolean subsequences(
      List<List<Integer>> list, List<Integer> innerList, int[] arr, int index, int sum, int k) {
    if (index == arr.length) {
      if (sum == k) {
        list.add(innerList);
        return true;
      }
      return false;
    }

    innerList.add(arr[index]);
    sum += arr[index];
    if (subsequences(list, new ArrayList<>(innerList), arr, index + 1, sum, k)) return true;
    innerList.remove(innerList.size() - 1);
    sum -= arr[index];
    if (subsequences(list, new ArrayList<>(innerList), arr, index + 1, sum, k)) return true;
    return false;
  }
}
