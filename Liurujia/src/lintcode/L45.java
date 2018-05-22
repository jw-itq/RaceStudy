package lintcode;

import java.util.Arrays;

/*
 * 5. 最大子数组差

给定一个整数数组，找出两个不重叠的子数组A和B，使两个子数组和的差的绝对值|SUM(A) - SUM(B)|最大。

返回这个最大的差值。

样例

给出数组[1, 2, -3, 1]，返回 6

首先找到所以的两个不重叠的子数组A和B，最后进行分割的时候来计算差的绝对值

[1, 3, 3, 3]
[3, 2, 1, 1]
[1, 1, -3, -3]
[-3, -3, -3, 1]
 */
public class L45 {
	public int maxDiffSubArrays(int[] nums) {
        // write your code here
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		int[] minleft = new int[nums.length];
		int[] minright = new int[nums.length];
		//求最大值
		int max = Integer.MIN_VALUE,sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
			left[i] = max;
		}
		max = Integer.MIN_VALUE;
		sum = 0;
		for(int i = nums.length-1;i>=0;i--){
			sum += nums[i];
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
			right[i] = max;
		}
		//求最小值
		int min = Integer.MAX_VALUE;
		sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];
			min = Math.min(min, sum);
			sum = Math.min(sum,0);
			minleft[i] = min;
		}
		
		min = Integer.MAX_VALUE;
		sum = 0;
		for(int i = nums.length-1;i>=0;i--){
			sum += nums[i];
			min = Math.min(min, sum);
			sum = Math.min(sum, 0);
			minright[i] = min;
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		System.out.println(Arrays.toString(minleft));
		System.out.println(Arrays.toString(minright));
		
		//计算最大的差的绝对值
		max = Integer.MIN_VALUE;
		for(int i = 0;i<left.length-1;i++){
			//只有的减去小的才有可能得到最大的
			max = Math.max(max,Math.max(Math.abs(left[i]-minright[i+1]),Math.abs(right[i+1]-minleft[i])));
		}
//		System.out.println(max+"---"+min);
		return max;
    }
	
	public static void main(String[] args) {
		int[] ar = {1,2,-3,1};
		System.out.println(new L45().maxDiffSubArrays(ar));
	}
}
