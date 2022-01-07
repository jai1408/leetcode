package com.arrays;

public class SingleElementInSortedArray {

    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 2;
        while(low <= high) {
            int mid = (low + high) >> 1;
            if(nums[mid] == nums[mid+1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return nums[low];
    }

  public static void main(String[] args) {
        int[] arr= new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
    System.out.println(new SingleElementInSortedArray().singleNonDuplicate(arr));
  }
}
