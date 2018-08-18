package leetcode;

import java.util.Arrays;

/*
 * �������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�
 * ʹ�� num1 ��Ϊһ���������顣

˵��:

��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�
ʾ��:

����:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

���: [1,2,2,3,5,6]

˼·��
	��nums2�����Ԫ����ӵ�nums1����֮����arrays���������򣬾ͺ���
 */
public class L88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	for(int i = 0;i<n;i++){
    		nums1[i+m] = nums2[i];
    	}
    	Arrays.sort(nums1);
    }
}
