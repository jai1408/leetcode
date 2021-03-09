package com.dp;
import java.util.Arrays;

class CoinChange {
	static long countWays(int S[], int m, int n) {
		// Time complexity of this function: O(mn)
		// Space Complexity of this function: O(n)

		// table[i] will be storing the number of solutions
		// for value i. We need n+1 rows as the table is
		// constructed in bottom up manner using the base
		// case (n = 0)
		long[] table = new long[n + 1];

		// Initialize all table values as 0
		Arrays.fill(table, 0); // O(n)
		print(table);
		// Base case (If given value is 0)
		table[0] = 1;
		print(table);
		// Pick all coins one by one and update the table[]
		// values after the index greater than or equal to
		// the value of the picked coin
		System.out.println("################################");
		for (int i = 0; i < m; i++) {
			for (int j = S[i]; j <= n; j++) {
				table[j] += table[j - S[i]];
			}
			print(table);
		}
		return table[n];
	}

	static void print(long arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

	// Driver Function to test above function
	public static void main(String args[]) {
		int arr[] = { 1,5,6,9 };
		int m = arr.length;
		int n = 11;
		System.out.println(countWays(arr, m, n));
	}
}
