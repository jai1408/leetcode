package com.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations2 {
  public static void main(String[] args) {
    int[] nums = {1, 1, 2};
    Set<List<Integer>> set = new HashSet<>();
    List<Integer> inner = new ArrayList<>();
    boolean[] freq = new boolean[nums.length];
    permutations(nums, freq, set, inner);
    List<List<Integer>> list = new ArrayList<>(set);
    System.out.println(list);
  }

  static void permutations(
      int[] nums, boolean[] freq, Set<List<Integer>> set, List<Integer> inner) {
    if (inner.size() == nums.length) {
      set.add(inner);
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (!freq[i]) {
        freq[i] = true;
        inner.add(nums[i]);
        permutations(nums, freq, set, new ArrayList<>(inner));
        inner.remove(inner.size() - 1);
        freq[i] = false;
      }
    }
  }
}
