package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
  public static void main(String[] args) {
    int[] arr = {10, 1, 2, 7, 6, 1, 5};
    Arrays.sort(arr);
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> innerList = new ArrayList<>();
    int target = 8, index = 0;
    combinationSum(index, arr, list, innerList, target);
    System.out.println(list);
  }

  private static void combinationSum(
      int index, int[] arr, List<List<Integer>> list, List<Integer> innerList, int target) {
    if (target == 0) {
      list.add(innerList);
      return;
    }
    for (int i = index; i < arr.length; i++) {
      if (i != index && arr[i] == arr[i - 1]) continue;
      if (target - arr[i] < 0) break;
      innerList.add(arr[i]);
      combinationSum(i + 1, arr, list, new ArrayList<>(innerList), target - arr[i]);
      innerList.remove(innerList.size() - 1);
    }
  }
}
