package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * 全排列再用递归写下
 * 这个递归的方式主要采用的不断的交换元素的方式
 */
public class L15two {
	public List<List<Integer>> permute(int[] nums) {
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		if(nums == null){
			return null;
		}
		if(nums.length==0){
			List<Integer> ls = new ArrayList<>();
			list.add(ls);
			return list;
		}
		permute(list,nums,0,nums.length-1);
		return list;
    }

	private void permute(List<List<Integer>> list, int[] nums, int k, int m) {
		if(k == m){
			List<Integer> ls = new ArrayList<>();
			for(int i = 0;i<nums.length;i++){
				ls.add(nums[i]);
			}
			list.add(ls);
		}else{
			for(int i = k;i<=m;i++){
				swap(nums,i,k);//这里就是进行当前位置的交换，这才是递归的重点
				permute(list,nums,k+1,m);
				swap(nums,i,k);//这里肯定是用递归回来的，否则下一次加入的就真的是递归回来的那个数组
			}
		}
	}

	private void swap(int[] nums, int i, int k) {
		int temp = nums[i];
		nums[i] = nums[k];
		nums[k] = temp;
	}
}
