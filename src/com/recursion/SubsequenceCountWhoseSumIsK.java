package com.recursion;

public class SubsequenceCountWhoseSumIsK {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int k=3,sum=0,index=0;
        int count=subsequences(arr, index ,sum,k);
        System.out.println(count);
    }

    public static int subsequences( int[] arr, int index, int sum, int k){
        if (index == arr.length) {
            if(sum==k){
                return 1;
            }
            return 0;
        }
        sum+=arr[index];
        int left=subsequences(arr,index+1,sum,k);
        sum-=arr[index];
        int right=subsequences(arr,index+1,sum,k);
        return left+right;
    }

}
