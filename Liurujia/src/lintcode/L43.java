package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * 44. 最小子数组

给定一个整数数组，找到一个具有最小和的子数组。返回其最小和。

样例

给出数组[1, -1, -2, 1]，返回 -3
 */
public class L43 {
	public int minSubArray(List<Integer> nums) {
        // write your code here
		if(nums==null){
			return 0;
		}
		int min = Integer.MAX_VALUE,sum = 0;
		for(int i = 0;i<nums.size();i++){
			sum +=nums.get(i);
			min = Math.min(min, sum);
			sum = Math.min(sum, 0);
		}
		return min;
    }
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(-1);
		list.add(-2);
		list.add(1);
		System.out.println(new L43().minSubArray(list));
	}
}
