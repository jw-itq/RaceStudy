package lintcode;

import java.util.Arrays;

/*
 * 60. 搜索插入位置

给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置。

你可以假设在数组中无重复元素。

这题的话，索引是蛮好处理的事情，关键在于怎么知道插入的位置，那我的想法就是这样的，我不断的减小这个值（我这里
假设是数字），直到等于原数组里面的一个数的时候，那么它的插入位置当然就是这个位置+1，如果不断的减小的值没有在
这个数组里面，有两种可能，一个是比数组最小值小，一个是比数组最大的值要大，分两种情况讨论就可以了

好吧，这里既然直接就死数组的话，那我就没有必要弄得那么复杂，因为如果还需要转成字符串的话，那我何不直接用转换
字符串的那个功夫直接就去处理呢，那在这里我应该怎么处理呢？就是遍历的时候一旦发现大于等于的就返回下标就可以了
 */
public class L60 {
	public int searchInsert(int[] A, int target) {
        // write your code here
		//某些特殊的情况别忘记了，别慌
		if(A.length==0){
			return 0;
		}
		Arrays.sort(A);
		if(target>A[A.length-1]){
			return A.length;
		}
		if(target<A[0]){
			return 0;
		}
		for(int i = 0;i<A.length;i++){
			if(A[i]>=target){
				return i;
			}
		}
		return 0;
    }
	public static void main(String[] args) {
		int[] ar = {1,3,5,6};
		System.out.println(new L60().searchInsert(ar, 2));
	}
}
