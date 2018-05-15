package lintcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 去掉重复的排列
 * 
 */
public class L16 {
	public List<List<Integer>> permuteUnique(int[] nums) {
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		if(nums == null){
			return null;
		}
		if(nums.length == 0){
			List<Integer> ls = new ArrayList<>();
			list.add(ls);
			return list;
		}
		Set<List<Integer>> set = new HashSet<>();
		permute(set,nums,0,nums.length-1);
		for(List<Integer> i : set){
			list.add(i);
		}
		return list;
    }

	private void permute(Set<List<Integer>> set, int[] nums, int k, int m) {
		if(k == m){
			List<Integer> ls = new ArrayList<>();
			for(int i = 0;i<nums.length;i++){
				ls.add(nums[i]);
			}
			set.add(ls);
		}else{
			for(int i = k;i<=m;i++){
				swap(nums,i,k);
				permute(set,nums,k+1,m);
				swap(nums,i,k);
			}
		}
	}

	private void swap(int[] nums, int i, int k) {
		int temp = nums[i];
		nums[i] = nums[k];
		nums[k] = temp;
	}
}
