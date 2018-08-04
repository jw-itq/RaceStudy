package leetcode;

/*
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:

输入: 121
输出: true
示例 2:

输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
示例 3:

输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。
进阶:

你能不将整数转为字符串来解决这个问题吗？

思路：
	我的思路首先就是想到了将这个数转换成字符串
	然后我设两个变量：start = 0，end = length-1
	循环，start每次加1，end每次减一，只要是有一次两个的值不相等，那就不是回文串
	最后返回时回文串，因为语句如果你能够执行到循环下面，那肯定是正常结束了
 */
public class L9 {
	public boolean isPalindrome(int x) {
        String str = x+"";
        int start = 0;
        int end = str.length()-1;
        while(start<end){
        	if(str.charAt(start)!=str.charAt(end)){
        		return false;
        	}
        	start++;
        	end--;
        }
        return true;
    }
}
