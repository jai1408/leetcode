package com.dp;
import java.util.Arrays;

class CoinChange {
  static long countWays(int[] arr, int m, int n) {
		// Time complexity of this function: O(mn)
		// Space Complexity of this function: O(n)

		// table[i] will be storing the number of solutions
		// for value i. We need n+1 rows as the table is
		// constructed in bottom up manner using the base
		// case (n = 0)
		long[] table = new long[n + 1];

		// Initialize all table values as 0
		Arrays.fill(table, 0); // O(n)
		// Base case (If given value is 0)
		table[0] = 1;
    System.out.println(Arrays.toString(table));

		for (int i = 0; i < m; i++) {
			for (int j = arr[i]; j <= n; j++) {
				table[j] += table[j - arr[i]];
			}
		}
		return table[n];
	}

	// Driver Function to test above function
	public static void main(String args[]) {
		int arr[] = { 1,5,6,9 };
		int m = arr.length;
		int n = 11;
		System.out.println(countWays(arr, m, n));
	}
}
