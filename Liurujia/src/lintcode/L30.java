package lintcode;

import java.util.Arrays;

/*
 * 31. 数组划分

给出一个整数数组 nums 和一个整数 k。划分数组（即移动数组 nums 中的元素），使得：

所有小于k的元素移到左边
所有大于等于k的元素移到右边
返回数组划分的位置，即数组中第一个位置 i，满足 nums[i] 大于等于 k。

样例

给出数组 nums = [3,2,2,1] 和 k = 2，返回 1.

挑战

使用 O(n) 的时间复杂度在数组上进行划分。

输入测试数据 (每行一个参数)

 */
public class L30 {
	public int partitionArray(int[] nums, int k) {
        // write your code here
		if(nums.length==0){
			return 0;
		}
		int i = 0;
		int j = nums.length-1;
		while(i!=j){
			while(i<j&&nums[j]>=k) j--;
			while(i<j&&nums[i]<k) i++;
			int f = nums[i];
			nums[i] = nums[j];
			nums[j] = f;
		}
		if(nums[0]>k){
			return 0;
		}else if(nums[nums.length-1]<k){
			return nums.length;
		}
		System.out.println(Arrays.toString(nums));
		while(i!=nums.length){
			if(nums[i]<k){
				i++;
			}else{
				return i;
			}
		}
		return 0;
    }
	
	public static void main(String[] args) {
		int[] a = {9,9,9,8,9,8,7,9,8,8,8,9,8,9,8,8,6,9};
		System.out.println(new L30().partitionArray(a, 9));
	}
}
