package lintcode;

import java.util.Arrays;

/*
 * 5. ����������

����һ���������飬�ҳ��������ص���������A��B��ʹ����������͵Ĳ�ľ���ֵ|SUM(A) - SUM(B)|���

����������Ĳ�ֵ��

����

��������[1, 2, -3, 1]������ 6

�����ҵ����Ե��������ص���������A��B�������зָ��ʱ���������ľ���ֵ

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
		//�����ֵ
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
		//����Сֵ
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
		
		//�������Ĳ�ľ���ֵ
		max = Integer.MIN_VALUE;
		for(int i = 0;i<left.length-1;i++){
			//ֻ�еļ�ȥС�Ĳ��п��ܵõ�����
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
