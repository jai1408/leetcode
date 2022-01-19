package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation1 {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> inner = new ArrayList<Integer>();
    boolean[] freq = new boolean[nums.length];
    permutations(nums, freq, list, inner);
    System.out.println(list);
  }

  static void permutations(
      int[] nums, boolean[] freq, List<List<Integer>> list, List<Integer> inner) {
    if (inner.size() == nums.length) {
      list.add(inner);
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (!freq[i]) {
        freq[i] = true;
        inner.add(nums[i]);
        permutations(nums, freq, list, new ArrayList<>(inner));
        inner.remove(inner.size() - 1);
        freq[i] = false;
      }
    }
  }
}
