package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 39. �ָ���ת��������

����һ����ת�������飬��ԭ�ػָ�������

����

[4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]

��ս

ʹ��O(1)�Ķ���ռ��O(n)ʱ�临�Ӷ�
 */
public class L39 {
	public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
		permute(nums,0,nums.size()-1);
    }

	private void permute(List<Integer> nums, int left, int right) {
		if(left>=right){
			return;
		}
		int temp = nums.get(left);
		int i = left;
		int j = right;
		while(i<j){
			while(i<j&&nums.get(j)>=temp) j--;
			while(i<j&&nums.get(i)<=temp) i++;
			int f = nums.get(i);
			nums.set(i, nums.get(j));
			nums.set(j, f);
		}
		nums.set(left, nums.get(i));
		nums.set(i, temp);
		permute(nums,i+1,right);
		permute(nums,left,i-1);
	}
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(1);
		a.add(2);
		a.add(4);
		new L39().recoverRotatedSortedArray(a);
		System.out.println(a.toString());
	}
}
