package com.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveAllVowels {

  static int count = 0;
  static int k = 0;

  private static String other(String str) {
    char[] a = str.toCharArray();
    for (int i = 0; i < a.length; i++) {
      if (i % 2 == 0) {
        a[i - k] = a[i];
      } else {
        k++;
      }
    }
    return String.valueOf(a).substring(0, a.length - k);
  }

  private static String removeVowels(String str) {
    char[] c = str.toCharArray();
    for (int i = 0; i < c.length; i++) {
      if (!isVowel(c[i])) {
        c[i - count] = c[i];
      } else {
        count++;
      }
    }
    return String.valueOf(c).substring(0, c.length - count);
  }

  public static void main(String[] args) {
    // System.out.println(other(remVowelByRegEx("LaunchCode")));
    System.out.println(reverseVowels("LaunchCode"));
  }

  static String remVowelByRegEx(String str) {
    return str.replaceAll("[aeiouAEIOU]", "");
  }

  public static String reverseVowels(String s) {
      Set<Character> vowels = new HashSet<>();
      vowels.add('a');vowels.add('u');vowels.add('o');vowels.add('i');vowels.add('e');
      vowels.add('A');vowels.add('U');vowels.add('O');vowels.add('I');vowels.add('E');

      int i =0, j = s.length() -1;
      char[] ss = s.toCharArray();

      while(i < j){
          if(!vowels.contains(ss[i])) i++;
          else if(!vowels.contains(ss[j])) j--;
          else {
              char t = ss[i];
              ss[i] = ss[j];
              ss[j] = t;

              i++; j--;
          }
      }

      return String.valueOf(ss);

  }

  static String remVowel(String str) {
    Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    List<Character> al = Arrays.asList(vowels);
    StringBuffer sb = new StringBuffer(str);

    for (int i = 0; i < sb.length(); i++) {
      if (al.contains(sb.charAt(i))) {
        sb.replace(i, i + 1, "");
        i--;
      }
    }
    return sb.toString();
  }

  private static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
        || c == 'I' || c == 'O' || c == 'U';
  }
}
