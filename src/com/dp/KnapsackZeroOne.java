package com.dp;

public class KnapsackZeroOne {
  public static void main(String[] args) {
    int[] wt = {1, 3, 4, 6};
    int[] val = {20, 30, 10, 50};
    int w = 10;
    int n = 4;
    System.out.println(maxProfit(wt, val, w, n));
  }

  private static int maxProfit(int[] wt, int[] val, int w, int n) {
    int[][] dp = new int[n + 1][w + 1];
    for (int row = 0; row < w + 1; row++) dp[0][row] = 0;
    for (int col = 0; col < n + 1; col++) dp[col][0] = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= w; j++) {
        int maxValWithoutCurr = dp[i - 1][j];
        int maxValWithCurr = 0;

        if (j >= wt[i - 1]) {
          maxValWithCurr = val[i - 1];
          maxValWithCurr += dp[i - 1][j - wt[i - 1]];
        }
        dp[i][j] = Math.max(maxValWithoutCurr, maxValWithCurr);
      }
    }
    return dp[n][w];
  }
}
