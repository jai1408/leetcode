package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  public static int majorityElement(int[] nums) {
    int size = nums.length;
    // int posMajElem =  possibleMajorityElement(nums, size);
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (map.containsKey(num)) {
        int count = map.get(num) + 1;
        if (count > (size / 2)) return num;
        else map.put(num, count);
      }
      else map.put(num, 1);
    }
    System.out.println(map);
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > (size / 2)) return entry.getKey();
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 2, 3, 1};
    System.out.println(majorityElement(nums));
  }
}
