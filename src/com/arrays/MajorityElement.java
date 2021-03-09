package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  public static int majorityElement(int[] nums) {
    int size = nums.length;
    // int posMajElem =  possibleMajorityElement(nums, size);
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < size; i++) {
      if (map.containsKey(nums[i])) {
        int count = map.get(nums[i]) + 1;
        if (count > (size / 2)) return 0;
        else map.put(nums[i], count);
      } else map.put(nums[i], 1);
    }
    System.out.println(map);
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > (size / 2)) return entry.getKey();
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 1, 3, 1};
    System.out.println(majorityElement(nums));
  }
}
