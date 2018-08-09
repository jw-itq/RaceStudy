package leetcode;

/*
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

你可以假设数组中无重复元素。

示例 1:

输入: [1,3,5,6], 5
输出: 2
示例 2:

输入: [1,3,5,6], 2
输出: 1
示例 3:

输入: [1,3,5,6], 7
输出: 4
示例 4:

输入: [1,3,5,6], 0
输出: 0

思路：这个蛮简单，但是要考虑周全，1
	1，有目标值的时候，那就应该循环直到等于目标值的时候就返回下标
	2，没有目标值的时候，循环遇到比它大的那个数字的时候，返回这个数字的下标
		否则，那肯定是比数组里面所有数字都要大，那就在最后返回数组最后的下一个的下标
 */
public class L35 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0||nums==null){
        	return -1;
        }
        for(int i = 0;i<nums.length;i++){
        	if(nums[i]==target){
        		return i;
        	}
        	if(nums[i]>target){
        		return i;
        	}
        }
        return nums.length;
    }
    
    public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		System.out.println(new L35().searchInsert(nums, 5));
	}
}
