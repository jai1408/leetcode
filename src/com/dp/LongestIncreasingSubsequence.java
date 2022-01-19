package com.dp;

public class LongestIncreasingSubsequence {
    static int LIS(int[] arr, int n) {
        int[] table = new int[n];
        for (int i = 0; i < n; i ++)
            table[i] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j])
                    table[i] = Integer.max(table[i], table[j] + 1);
            }
        }
        return table[n-1];
    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        System.out.println(LIS(arr, arr.length));
    }
}
