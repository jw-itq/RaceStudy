package lintcode;

import java.util.List;

/*
 * 最大子数组二
 * 42. 最大子数组 II

给定一个整数数组，找出两个 不重叠 子数组使得它们的和最大。
每个子数组的数字在数组中的位置应该是连续的。
返回最大的和。

样例

给出数组 [1, 3, -1, 2, -1, 2]
这两个子数组分别为 [1, 3] 和 [2, -1, 2] 或者 [1, 3, -1, 2] 和 [2]，它们的最大和都是 7

这题的思路是因为两个子数组一定不重叠，所以就肯定存在一条分割线，来将这两个数组分割开来，
这里用left[]和right[]连个数组分别存放从此位置往左和往右最大的子数组的最大数是多少，
那么得到这个最大数了之后，就可以用着连个数组进行分割，然后需要注意的就是right[]数组需要从
后往前赋值，因为这样的话，最后就可以依次相加，这样就可以完成分割
 */
public class L42 {
	public int maxTwoSubArrays(List<Integer> nums) {
        // write your code here
		//现在我要写的就是从左边开始将从左边依次过来到此位置的最大的数值存放到对应的位置上来
		int[] left = new int[nums.size()];
		int[] right = new int[nums.size()];
		
		int max = Integer.MIN_VALUE,sum = 0;
		for(int i = 0;i<nums.size();i++){
			sum += nums.get(i);
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
			left[i] = max;//这里表示的就是此时这个i位置上的最大的值是多少
		}
		
		max = Integer.MIN_VALUE;
		sum = 0;
		for(int i = nums.size()-1;i>=0;i--){//这里为什么是从右边呢，就是因为左右这样一分割，所有的情况都会被分割出来
			sum += nums.get(i);
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
			right[i] = max;//这里跟left就是一样的功能了
		}
		
		max = Integer.MIN_VALUE;//因为接下来我需要找到最大的那个组合的值是多少，因此需要借助一下无穷小
		for(int i = 0;i<left.length-1;i++){
			max = Math.max(max, left[i]+right[i+1]);//这里的left[i]+right[i+1]就实现了所有的分割
		}
		return max;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 3, -1, 2, -1, 2};
	}
}
