package lintcode;

import java.util.Arrays;


/*
 * 在数组中找出第k大的元素
 */
public class L5 {
	public int kthLargestElement(int k, int[] nums) {
        // write your code here
		f(0,nums.length-1,nums);
		return nums[nums.length-k];
    }
	public void f(int left,int right,int[] nums){
//		System.out.println(left+"    "+right);
		if(left>right){
			return;
		}
		int temp = nums[left];
		int i = left;
		int j = right;
		while(i!=j){
			while(nums[j]>=temp&&i<j) j--;
			while(nums[i]<=temp&&i<j) i++;
			int f = nums[j];
			nums[j] = nums[i];
			nums[i] = f;
		}
		int f = nums[left];
		nums[left] = nums[i];
		nums[i] = f;
//		System.out.println(Arrays.toString(nums));
		f(left,i-1,nums);
		f(i+1,right,nums);
	}
	
	public static void main(String[] args) {
		int[] number = {3,4,2,9,4,1,5,7,0};
		new L5().f(0, number.length-1, number);
		System.out.println(Arrays.toString(number));
	}
}
