package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * 62. 搜索旋转排序数组

假设有一个排序的按未知的旋转轴旋转的数组
(比如，0 1 2 4 5 6 7 可能成为4 5 6 7 0 1 2)。
给定一个目标值进行搜索，如果在数组中找到目标值返回数组中的索引位置，否则返回-1。

你可以假设数组中不存在重复的元素。

样例

给出[4, 5, 1, 2, 3]和target=1，返回 2

给出[4, 5, 1, 2, 3]和target=0，返回 -1

一定要养成个习惯，先说思路，这题的话，我理解的题目的意思就是找到数组元素下标，如果
不存在该数组那就返回-1；我本来一开始想的方法就是转换的方法，现在我觉得用二分查找的
方法还快一些，也许。首先定义一个变量来指定最终的值，因为它是有序的，所以说，我就可
以开始循环查找中间的那个值，直到等于那个target，否则肯定就是没有找到，每次都除半，
所以还需要left，right这两个来控制范围，要是left>right的时候那就停止吧，也就是说
循环条件是left<=right
二分查找的前提就是这个数组必须是有序的，而在这个题里面，最后的结果是需要从原数组里面
拿数组，所以说这个二分的想法，可能只能说失败了，因为我一旦排序就不可能回去，还有个想
法就是用map函数把它做一个映射，因为题目说我可以假设不存在重复的元素，我现在试试这个想法；
如果你不去写代码，总是想象，不实践，是绝对不知道自己的想法有多么的愚蠢，不需要map映射
只需要一个转换就够了
这个题目有点意思，，，
 */
public class L62 {
	public int search(int[] A, int target) {
        // write your code here
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i<A.length;i++){
			list.add(A[i]);
		}
		return list.indexOf(target);
    }
	
	public static void main(String[] args) {
		int[] ar = {4, 5, 1, 2, 3};
		System.out.println(new L62().search(ar, 0));
	}
}
