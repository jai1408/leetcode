package com.arrays;

public class RotatedArray {
    public static void rotate(int[] arr, int d){
        while(d>0){
            int temp =arr[0];
            for(int i=0; i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
            d--;
        }

    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    rotate(arr,4);
    print(arr);
  }
}
