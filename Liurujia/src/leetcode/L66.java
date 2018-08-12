package leetcode;

import java.util.Arrays;

/*
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:

输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。
示例 2:

输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。

思路：
	分情况讨论：
		1，如果是空的数组，那就返回这个数组
		2，如果这个数组只有一个元素，那我直接将这个数组加1然后改变这个数字
		3，如果这个数组里面的个数大于1，那我应该判断最后一个元素加1之后的值是否大于10
			如果大于10，那我应该将结果的十位与倒数第二位数字相加并改变这个数字
				其中，还需要考虑如果之后的每一位都需要进位的情况
				这个可以使用循环来解决，如果倒数第二位数字相加的结果还是大于10，那就
				继续循环下一位，直到最末尾或者小于10为止，在这个期间，应该使用字符串来
				存储，并且也原地改变这个数组，因为最后结果的大小如果大于原数组的话，那
				说明就是这种情况99+1=100，所以，就需要重新赋给一个新的数组，这个字符串
				便是起这个作用的，否则那肯定就是正常的情况，直接返回原数组就好了
			如果小于10，那我只需要直接将加1的结果改变最后一个数字
			
		,,,费了我好半天，今天不在状态。。
 */
public class L66 {
    public int[] plusOne(int[] digits) {
    	if(digits.length==0||digits==null){
    		return digits;
    	}
    	int num = 1;
    	for(int i = digits.length-1;i>=0;i--){
    		int add = digits[i]+num;
    		if(add>=10){
    			digits[i] = add%10;
    			num = add/10;
    		}else{
    			digits[i] = add;
    			return digits;
    		}
    	}
    	int[] digit = new int[digits.length+1];
    	digit[0] = num;
    	for(int i = 1;i<digit.length;i++){
    		digit[i] = digits[i-1];
    	}
    	return digit;
    }
    public static void main(String[] args) {
    	int[] digits = {9,9,9};
		System.out.println(Arrays.toString(new L66().plusOne(digits)));
	}
}
