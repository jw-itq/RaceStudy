package unit3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
	public static String f(List<String> str ,int column ,String result ,int n){
		List<String> newStr = new ArrayList<String>();
		String lin = "";
		for(int i = 0;i<str.size()-1;i++){
			String strOf = str.get(i);
			str.set(i, str.get(0));
			str.set(0, strOf);
			int flag = -1;
			for(int j = 0;j<str.size()-1;j++){
				if(str.get(0).charAt(column)==str.get(j+1).charAt(column)){
					flag = 0;
					lin = str.get(0).charAt(column)+"";
					newStr.add(str.get(j+1));
					str.remove(j+1);
					j--;
					System.out.println(str.size()+"daxiao"+str.toString());
				}else{
					char[] ch = {str.get(0).charAt(column),str.get(j+1).charAt(column)};
					System.out.println("-------------"+ch[0]+"****"+ch[1]+"&&&"+str.toString());
					Arrays.sort(ch);
					lin = ch[0]+"";
					/*if(str.size()==2){
						newStr.addAll(str);
						System.out.println("!!!!!!!!!!!!!!!!newdesize"+newStr.toString());
						break;
					}*/
				}
			}
			if(flag == 0){
				flag = -1;
				newStr.add(str.get(0));
				str.remove(0);
			}
		}
		if(column == n){
			return result;
		}
		result +=lin;
		System.out.println(result+"zifu___"+column);
		return f(newStr,column+1,result,n);
//		System.out.println(newStr.toString()+"****");
//		System.out.println(str.toString()+"****");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int m = scan.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i = 1;i<=6;i++){
			list.add(scan.next());
		}
//		System.out.println(list.toString()+",,,"+list.size());
		System.out.println(f(list,0,"",10));
	}
}
