package lintcode;

import java.util.Arrays;

/*
 * 多写写排序，这次写快速排序
 * 快排的思想就是利用分治的思想
 */
public class W2 {
	public static void main(String[] args) {
		int[] ar = {2,9,1,20,9,3,0,6,3,2};
		quick(ar,0,ar.length-1);
		System.out.println(Arrays.toString(ar));
	}

	private static void quick(int[] ar,int left,int right) {
		if(left>right){
			return;
		}
		int temp = ar[left];//这是那个标志
		int i = left;//这是从左边开始遍历的指针
		int j = right;//这是从右边开始遍历的指针
		while(i!=j){//当i==j的时候就不需要交换了，开始下一轮,并且要把标志给替换成i下标的值
			while(i<j&&ar[j]>=temp) j--;//一定记住了，快速排序一定要从后面开始
			while(i<j&&ar[i]<=temp) i++;//标志位左边都要比它小,右边的都要比它大
			int f = ar[i];
			ar[i] = ar[j];
			ar[j] = f;
		}
		ar[left] = ar[i];
		ar[i] = temp;
		quick(ar,i+1,right);
		quick(ar,left,i-1);
	}
}
