package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
  public static void main(String[] args) {
    int[] arr = {2, 3, 6, 7};
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> innerList = new ArrayList<>();
    int target = 7, index = 0;
    combinationSum(list, innerList, arr, index, target);
    System.out.println(list);
  }

  public static void combinationSum(
      List<List<Integer>> list, List<Integer> innerList, int[] arr, int index, int target) {
    if (index == arr.length) {
      if (target == 0) {
        list.add(innerList);
      }
      return;
    }
    if (arr[index] <= target) {
      innerList.add(arr[index]);
      combinationSum(list, new ArrayList<>(innerList), arr, index , target-arr[index]);
      innerList.remove(innerList.size() - 1);
    }
    combinationSum(list, new ArrayList<>(innerList), arr, index + 1, target);
  }
}
