package com.arrays;

import java.util.Arrays;
import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> al = Arrays.asList(vowels);
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
      /*i
      f(al.contains(c[i]) && !al.contains(c[j])) j--;
      else if(!al.contains(c[i]) && al.contains(c[j])) i++;
      else if(!al.contains(c[i]) && !al.contains(c[j])){
          i++;
          j--;
      }
      else if(al.contains(c[i]) && al.contains(c[j])) {
          char temp=c[i];
          c[i]=c[j];
          c[j]=temp;
          i++;
          j--;
      }*/

            if (!al.contains(c[i])) i++;
            else if (!al.contains(c[j])) j--;
            else {
                char t = c[i];
                c[i] = c[j];
                c[j] = t;

                i++;
                j--;
            }
        }
        return String.valueOf(c);
    }
}
