package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 28. ������ά����

д��һ����Ч���㷨������ m �� n�����е�ֵ��

�����������������ԣ�

ÿ���е�����������������ġ�
ÿ�еĵ�һ����������һ�е����һ��������
����

�������о���

[
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]

���� target = 3������ true
 */
public class L28 {
	
	/*//ͨ������ת�ַ����ķ�ʽ�������Ƿ��д�����
	 public boolean searchMatrix(int[][] matrix, int target) {
	        // write your code here
		 for(int i = 0;i<matrix.length;i++){
			int left = matrix[i][0];
			int right = matrix[i][matrix[i].length-1];
			if(target==left||target==right){
				return true;
			}else if(target>left&&target<right){
				String s = Arrays.toString(matrix[i]);
				return s.contains(target+"");
			}
		 }
		 return false;
	 }*/
	public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
		for(int i = 0;i<matrix.length;i++){
			int left = matrix[i][0];
			int right = matrix[i][matrix[i].length-1];
			if(target==left||target==right){
				return true;
			}else if(target>left&&target<right){
				return search(matrix[i], 0, matrix[i].length-1, target);
			}
		}
		return false;
    }
	public boolean search(int[] arr,int left,int right,int target){
		int center = (left+right)/2;
		if(left>right){//����һ��Ҫ���ǵ�����Ϊ���Ǹ���������������û�ҵ���ô�죬û�ҵ���˵��left>right��
			return false;
		}
		if(arr[center]==target){
			return true;
		}
		if(target>arr[center]){
			return search(arr,center+1,right,target);//��ʦ˵�Ĺ�Ȼ�ǳ��ԣ���������õ��ˣ���ʦ˵����һ��Ҫ����!һ��Ҫ��
		}else if(target<arr[center]){				//���ҵ����Ǹ�ֵ��return����������������;���صĿɾ�����;��ֵ��
			return search(arr,left,center-1,target);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] ar = {{2,3,4,5},{7,8,9,10}};
//		System.out.println(new L28().search(ar, 0, ar.length-1, 4));
//		new L28().searchMatrix(ar, 1);
		System.out.println(new L28().searchMatrix(ar, 2));
	}
}
