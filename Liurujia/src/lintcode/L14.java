package lintcode;

/*
 * 二分查找最小的数的位置
 */
public class L14 {
	public int binarySearch(int[] nums, int target) {
        // write your code here
		return binary(nums,target,0,nums.length-1);
    }

	private int binary(int[] nums, int target, int left, int right) {
		int n = (left+right)/2;
		if(left>right){//这是一种极端情况，必须要首先考虑
			return -1;
		}
		if(nums[n]==target){
			for(int i = n-1;i>=0;i--){//这里为什么是n-1是因为如果是n的话就执行不到else了
				if(nums[i]==target){
					continue;
				}else{
					return i+1;
				}
			}
			return n;//一定要注意考虑到极端情况
		}
		if(nums[n]<target){
			return binary(nums, target, n+1, right);
		}else{
			return binary(nums, target, left, n-1);
		}
	}
}
