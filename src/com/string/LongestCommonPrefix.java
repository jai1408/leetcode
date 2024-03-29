package com.basic.adv.strings;

import java.util.Arrays;

public class LongestCommonPrefix {

  public static void main(String[] args) {
    String[] str = {"cat", "caring", "car"};
    LongestCommonPrefix sol = new LongestCommonPrefix();
    System.out.println("Longest Common Prefix - " + sol.longestCommonPrefix(str));
  }

  public String longestCommonPrefix(String[] a) {
    int size = a.length;

    if (size == 0) return "";

    if (size == 1) return a[0];

    Arrays.sort(a);
    int end = Math.min(a[0].length(), a[size - 1].length());
    int i = 0;
    while (i < end && a[0].charAt(i) == a[size - 1].charAt(i)) {
      i++;
    }
    return (a[0].substring(0, i));
  }
}
