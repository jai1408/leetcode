package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 5, 3, 2, 4);
    Collections.sort(list);
    System.out.println(list);
    //Collections.sort(list, (o1, o2) -> o2-o1);
      list.sort((o1, o2) -> o2-o1);
    System.out.println(list);
  }
}
