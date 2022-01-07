package com.dp;

class ClimbStairs {
    public int climbStairs(int n) {
        if(n==0) return 1;
        if(n<0) return 0;
        return climbStairs(n-1)+climbStairs(n-2);
    }

  public static void main(String[] args) {
    System.out.println(new  ClimbStairs().climbStairs(44));
  }
}
