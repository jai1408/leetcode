package com.recursion;

public class Pallindrome {

    static boolean isPallindrome(String str, int i, int n){
        if(i>=n/2) return true;
        return str.charAt(i)==str.charAt(n-i-1) &&  isPallindrome(str,i+1,n);
    }

  public static void main(String[] args) {
    //
      String str="MALYALAM";
    System.out.println(isPallindrome(str,0,str.length()));
  }
}
