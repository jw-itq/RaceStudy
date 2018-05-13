package lintcode;

import java.util.Arrays;

/*
 * 合并排序数组2
 */
/*
while(arr[j]>=temp&&i<j){
j--;
}
while(arr[i]<=temp&&i<j){
i++;
}
这里两个while的顺序是不能改变的，想一想：
假设对如下进行排序：

如上图，6在左，9在右  我们将6作为基数。
假设从左边开始（与正确程序正好相反）
于是i 就会移动到现在的 数字 7 那个位置停下来，而  j 原来在 数字 9 那个位置 ，因为
while(arr[j]>=temp&&i<j)
于是，j 也会停留在数字7 那个位置，于是问题来了。当你最后交换基数6与7时，不对呀！！。
问题在于当我们先从在左边开始时，那么 i 所停留的那个位置肯定是大于基数6的，而在上述例子中，为了满足 i<j 于是 j也停留在7的位置
但最后交换回去的时候，7就到了左边，不行，因为我们原本 交换后数字6在边应该是全部小于6，右边全部大于6.但现在不行了。
于是，我们必须从右边开始，也就是从基数的对面开始。
 */
public class L6 {
	public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
		int[] ab = new int[A.length+B.length];
		int i = 0;
		int a = 0;
		int b = 0;
		while(a<A.length){
			ab[i++]=A[a++];
		}
		while(b<B.length){
			ab[i++]=B[b++];
		}
		f(0,ab.length-1,ab);
		return ab;
    }
	public void f(int left,int right,int[] ab){
		if(left>right){
			return;
		}
		int temp = ab[left];
		int i = left;
		int j = right;
		while(i!=j){
			while(ab[j]>=temp&&i<j) j--;
			while(ab[i]<=temp&&i<j) i++;
			int f = ab[i];
			ab[i] = ab[j];
			ab[j] = f;
		}
		int f = ab[left];
		ab[left] = ab[i];
		ab[i] = f;
		f(left,i-1,ab);
		f(j+1,right,ab);
	}
	public static void main(String[] args) {
		int[] a = {1,3,5,6};
		int[] b = {1,3,7,7};
		System.out.println(Arrays.toString(new L6().mergeSortedArray(a, b)));
	}
}
