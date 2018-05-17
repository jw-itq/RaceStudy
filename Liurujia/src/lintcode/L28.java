package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 28. 搜索二维矩阵

写出一个高效的算法来搜索 m × n矩阵中的值。

这个矩阵具有以下特性：

每行中的整数从左到右是排序的。
每行的第一个数大于上一行的最后一个整数。
样例

考虑下列矩阵：

[
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]

给出 target = 3，返回 true
 */
public class L28 {
	
	/*//通过数组转字符串的方式来查找是否有次数字
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
		if(left>right){//这里一定要考虑到，因为这是个极端情况，如果是没找到怎么办，没找到就说明left>right了
			return false;
		}
		if(arr[center]==target){
			return true;
		}
		if(target>arr[center]){
			return search(arr,center+1,right,target);//老师说的果然非常对，我立马就用到了，老师说的是一定要返回!一定要把
		}else if(target<arr[center]){				//把找到的那个值给return带回来，否则在中途返回的可就是中途的值了
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
