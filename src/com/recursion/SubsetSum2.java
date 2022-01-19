package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum2 {
  public static void main(String[] args) {
    int[] arr = {1,2,2};
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();
      subsetsum(0,arr,list,inner);
    System.out.println(list);
  }
  static void subsetsum(int index, int[] arr, List<List<Integer>> list, List<Integer> inner){
      list.add(inner);
      for(int i=index;i<arr.length;i++) {
          if(i!=index && arr[i]==arr[i-1]) continue;
          inner.add(arr[i]);
          subsetsum(i+1,arr,list, new ArrayList<>(inner));
          inner.remove(inner.size()-1);
      }

  }
}
