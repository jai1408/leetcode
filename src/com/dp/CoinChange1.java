package com.dp;

import java.util.Arrays;

public class CoinChange1 {
  public static void main(String[] args) {
    int num = 11;
    int[] arr = {1, 5, 6,9};
    int[] dp = new int[num + 1];
    Arrays.fill(dp, -1);
    dp[0] = 0;
    System.out.println(coinChange(num, arr, dp));
  }

  static int coinChange(int num, int[] arr, int[] dp) {
    if (num == 0) return 0;
    int ans = Integer.MAX_VALUE;
    for (int j : arr) {
      if (num - j >= 0) {
        int subAns = 0;
        if (dp[num - j] != -1) {
          subAns = dp[num - j];
        } else {
          subAns = coinChange(num - j, arr, dp);
        }
        if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
          ans = subAns + 1;
        }
      }
    }
    dp[num]=ans;
    return ans;
  }
}
