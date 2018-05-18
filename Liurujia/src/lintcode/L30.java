package lintcode;

import java.util.Arrays;

/*
 * 31. ���黮��

����һ���������� nums ��һ������ k���������飨���ƶ����� nums �е�Ԫ�أ���ʹ�ã�

����С��k��Ԫ���Ƶ����
���д��ڵ���k��Ԫ���Ƶ��ұ�
�������黮�ֵ�λ�ã��������е�һ��λ�� i������ nums[i] ���ڵ��� k��

����

�������� nums = [3,2,2,1] �� k = 2������ 1.

��ս

ʹ�� O(n) ��ʱ�临�Ӷ��������Ͻ��л��֡�

����������� (ÿ��һ������)

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
