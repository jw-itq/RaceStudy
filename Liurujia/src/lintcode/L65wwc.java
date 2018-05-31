package lintcode;

/*
 * 65. 两个排序数组的中位数

两个排序的数组A和B分别含有m和n个数，找到两个排序数组的中位数，要求时间复杂度应为O(log (m+n))。

样例

给出数组A = [1,2,3,4,5,6] B = [2,3,4,5]，中位数3.5

给出数组A = [1,2,3] B = [4,5]，中位数 3

先说思路，因为这里有个3.5我的第一反应就是求平均数，如果是这样的话，
那我的第一反应不就是求这两个数组的和然后除以这两个数组个数的和然后不就完了嘛
这个里面要考虑到的就是含有0怎么办的问题，如果含有0的话，那就不能要，也就是
说最后我求平均的时候，求的不是这两个数组的长度，而是有效数的个数
 */
public class L65wwc {
	public double findMedianSortedArrays(int[] A, int[] B) {
        // write your code here
		double sum = 0;
		int n = 0;
		for(int i = 0;i<A.length;i++){
			if(A[i]==0){
				continue;
			}
			n++;
			sum += A[i];
		}
		for(int i = 0;i<B.length;i++){
			if(B[i]==0){
				continue;
			}
			n++;
			sum += B[i];
		}
		double d = sum/n;
		if(d/5==0){
			return d;
		}
		if((d+0.5)>=(int)(d+1)){
			return ((int)d)+0.5;
		}else{
			return (int)d;
		}
    }
	
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("2.5 "));
	}
}
