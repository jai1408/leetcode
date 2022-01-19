/*
package com.common_problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TelephoneLetterCombinations {

  public static void main(String[] args) {
    String digits = "23";
    System.out.println(letterCombinations(digits));
  }

  public static List<String> letterCombinations(String digits) {
    String[] table = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    int n = digits.length();
    List<String> list = new ArrayList<>();
    Queue<String> q = new LinkedList<>();
    int[] digitss = Integer.valueOf(digits);

    q.add("");

    while (!q.isEmpty()) {
      String s = q.remove();
      if (s.length() == n) {
        list.add(s);
      } else {
        String val = table[digitss[s.length()]];
        for (int i = 0; i < val.length(); i++) {
          q.add(s + val.charAt(i));
        }
      }
    }
    return list;
  }
}
*/
