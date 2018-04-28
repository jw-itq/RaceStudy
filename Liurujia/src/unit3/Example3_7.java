package unit3;

import java.util.ArrayList;
import java.util.List;

/*
 * DNA序列
input：
6 10
ATGTTACCAT
AAGTTACGAT
AACAAAGCAA
AAGTTACCTT
AAGTTACCAA
TACTTACCAA
output：
AAGTTACCAA
12
思路要滤清一哈，把所有的字符串都放在集合里面，判断一列中有多少相等，把所有相等的从这个集合中删除，
其实也就是放进另外一个集合里面，然后进入递归
先找到DNA序列之后再计算长度，找到的那个串跟所有的串的不同位置的个数就是最短距离

 */
public class Example3_7 {
	public static StringBuffer f(List<String> str ,int column){
		List<String> newStr = new ArrayList<String>();
		for(int i = 0;i<str.size()-1;i++){
			for(int j = 0;j<str.size()-1;){
				
			}
		}
	}
	public static void main(String[] args) {
		
	}
}
