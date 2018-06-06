package lintcode;

/*
 * 75. 寻找峰值

你给出一个整数数组(size为n)，其具有以下特点：

相邻位置的数字是不同的
A[0] < A[1] 并且 A[n - 2] > A[n - 1]
假定P是峰值的位置则满足A[P] > A[P-1]且A[P] > A[P+1]，返回数组中任意一个峰值的位置。

样例

给出数组[1, 2, 1, 3, 4, 5, 7, 6]返回1, 即数值 2 所在位置, 或者6, 即数值 7 所在位置.

思路：
	最简单的思路就是for循环遍历
	但是循环肯定是要超时了的，但是这个题的解法就跟上一题的解法相差不多，二分，看来回去还有好好
	巩固下二分
 */
public class L75 {
	public int findPeak(int[] A) {
        // write your code here
		int left = 0;
		int right = A.length-1;
		while(left+1<right){
			System.out.println(left+",,,"+right);
			int mid = left+(right-left)/2;
			if(A[mid]<A[mid+1]){
				left = mid;
			}else{
				right = mid;
			}
		}
		return right;
    }
	
	public static void main(String[] args) {
		int[] ar = {1,2,1,3,4,5,6,7,8};
		System.out.println(new L75().findPeak(ar));
	}
}
