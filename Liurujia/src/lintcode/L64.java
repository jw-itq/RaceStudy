package lintcode;

import java.util.Arrays;

/*
 * 64. 合并排序数组

合并两个排序的整数数组A和B变成一个新的数组。

样例

给出 A = [1, 2, 3, empty, empty], B = [4, 5]

合并之后 A 将变成 [1,2,3,4,5]

因为我觉得数组的大小是不能改变的，所以这里的话，我只能重新new一个新的数组，然后将这两个数组里面值放进去，
这就是最笨的想法;
就这题来说的话，澄清一下，就是m在这里的作用，其实是A数组的大小，而其实A数组里面还有n个空位需要填，所以
就只需要从m+i的位置开始将B数组填进去就可以了，昨天用到了一个system的方法，我来试试
 */
public class L64 {
	public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
		/*int[] ar = new int[m+n];
		for(int i = 0;i<m;i++){
			ar[i] = A[i];
		}*/
		/*for(int i = 0;i<n;i++){
			A[m+i] = B[i];
		}*/
		//这个方法的参数各个含义如下：
		//原数组，要从原数组的哪个位置开始复制，目标数组，复制到目标数组的起点，目标数组的大小
		System.arraycopy(B, 0, A, m, n);
//		System.out.println(Arrays.toString(ar));
    }
	
	public static void main(String[] args) {
		int[] a = {1,2,3,0,0};
		int[] b = {4,5};
		new L64().mergeSortedArray(a, 3, b, 2);
	}
}
