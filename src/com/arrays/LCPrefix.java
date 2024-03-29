package com.arrays;

import java.util.Arrays;

public class LCPrefix {
  public static void main(String[] args) {

    String[] str = {"flight", "flow", "flower"};
    LCPrefix sol = new LCPrefix();
    System.out.println(sol.longestCommonPrefix(str));
  }

  public String longestCommonPrefix(String[] a) {
    int size = a.length;
    if (size == 0) return "";
    if (size == 1) return a[0];

    Arrays.sort(a); //n log n
    int end = Math.min(a[0].length(), a[size - 1].length());
    int i = 0;
    while (i < end && a[0].charAt(i) == a[size - 1].charAt(i)) {
      i++;
    }
    return (a[0].substring(0, i));
  }
}
