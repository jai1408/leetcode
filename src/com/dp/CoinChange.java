package com.dp;
import java.util.Arrays;

public class CoinChange {
	static long countWays(int[] coins, int amount) {
		
		long[] table = new long[amount + 1];
		Arrays.fill(table, 0);
		table[0] = 1;

		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <= amount; j++) {
				table[j] += table[j - coins[i]];
			}
		}
		return table[amount];
	}

	public static void main(String args[]) {
		int[] coins = { 2};
		int amount = 0;
		System.out.println(countWays(coins, amount));
	}
}
