package lintcode;

import java.util.Arrays;

/*
题目描述：给一个包含 n 个整数的数组 S, 找到和与给定整数 target 最接近的三元组，返回这三个数的和。

样例：例如 S = [-1, 2, 1, -4] and target = 1. 和最接近 1 的三元组是 -1 + 2 + 1 = 2.

首先需要对这个数组进行排序，然后的主要思想就是采用三个指针，首先固定一个指针，另外两个指针就可以采用“左右夹逼”的
方式进行选取，之后重新调整那个固定的指针，不断向后面移动，最后就可以确定了

具体来说就是这样子的，首先使用一个sum变量存储最终的和，初始化可以为最大，也可以为此数组中任意三个数的和
然后遍历这个数组，同时开始指定那个固定的指针，因为这个指针总是固定，没有动过，需要动的就是后面的“左右夹逼”的指针
所以，我们现在只需要确定这两个指针就好了，设start为左边的指针，它的值为i+1，设end为右边的指针，它的值为最后那个
值，然后使用while循环开始“左右夹逼”，每次都要计算其中三个变量的值，分别是固定+左边+右边的值，用它们的和分别跟target
相减，看看那个相差小一下，让sum总是保持最小的状态。那现在关键点来了，那两个指针该怎么移动呢？一起移动？那肯定不行。
这里很关键，如果移动错误的话，那最后的值也计算错了，因为很有可能需要的值没有移动到。我觉得这个应该这样想，一定要围绕
主问题出发，主问题就是需要找到跟target最接近的三个数，那这三个数的和肯定也是跟它最接近的嘛，因为这个数组顺序，如果
我们计算的中间变量和小于target，那很明显，我们需要的和应该要再大一点才能够更接近，那怎样才能更大一点呢？对哒，那就是
左边的指针开始一定，这样它的和就会慢慢变大，这个和比target大呢？那就不用说了，相反嘛。如果碰到和跟target一样的话
那一定要返回，因为肯定没有比这个最接近的了
 */
public class L59 {
	public int threeSumClosest(int[] numbers, int target) {
        // write your code here
		Arrays.sort(numbers);
		int sum = Integer.MAX_VALUE;
		for(int i = 0;i<numbers.length;i++){
			int start = i+1;
			int end = numbers.length-1;
			while(start<end){
				int b = numbers[i]+numbers[start]+numbers[end];
				if(Math.abs(sum-target)>Math.abs(b-target)){
					sum = b;
				}
				if(b<target){
					start++;
				}else if(b>target){
					end--;
				}else{
					return b;
				}
			}
		}
		return sum;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,0,-1,-1,-1,-1,0,1,1,1,2};
		int target = 7;
		System.out.println(new L59().threeSumClosest(arr, target));
	}
}
