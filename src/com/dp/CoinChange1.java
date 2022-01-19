public class CoinChange1 {
	public static void main(String[] args){
		int num =18;
		int[] arr = {1,5,7};
		System.out.println(coinChange(num,arr));
	}
	
	static int coinChange(int num, int[] arr){
		if(num==0) return 0;
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(num-arr[i]>0){
				int subAns = coinChange(num-arr[i],arr);
				if(subAns+1>ans){
					ans=subAns+1;
				}
			}
		}
		return ans;
	}
}