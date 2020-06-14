package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		int temp;
		int indexes[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			temp = target - nums[i];
			if (map.containsValue(temp)) {
				for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
					if (Integer.valueOf(temp).equals(mapEntry.getValue())) {
						indexes[0] = mapEntry.getKey();
						indexes[1] = i;
						break;
					}
				}
			}
			map.put(i, nums[i]);
		}

		return indexes;

	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int indexes[] = TwoSumProblem.twoSum(nums, 4);
		if (indexes[0] != 0 && indexes[1] != 0) {
			for (int i = 0; i < indexes.length; i++) {
				System.out.println(indexes[i]);
			}
		} else {
			System.out.println("pair not found");
		}

	}

}
