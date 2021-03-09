package com.tree;

public class SortedArrayToBST {
	
	Node root1;
	
	public Node sortedArrayToBST(int[] nums) {
        int n= nums.length;
        return sortedArrayToBSTInternal(nums,0,n-1);
    }
    
    public Node sortedArrayToBSTInternal(int[] nums, int left, int right){
        if(left>right)
            return null;
        int mid = (left+right)/2;
       Node node = new Node(nums[mid]);
        
        node.left=sortedArrayToBSTInternal(nums,left,mid-1);
        node.right=sortedArrayToBSTInternal(nums,mid+1,right);
        
        return node;
    }

	public static void main(String[] args) {
		
		SortedArrayToBST tree = new SortedArrayToBST();
		
		tree.root1 = new Node(1);
		tree.root1.left = new Node(2);
		tree.root1.right = new Node(3);
		tree.root1.left.right = new Node(4);
		tree.root1.right.left = new Node(5);
		tree.root1.right.right = new Node(6);
		tree.root1.right.left.left = new Node(7);
		int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
		int height = HeightBT.height(tree.root1);
		for (int i = 0; i < height; i++) {
			OrderBT.printGivenLevel(tree.sortedArrayToBST(nums), i);
		}
	}

}
