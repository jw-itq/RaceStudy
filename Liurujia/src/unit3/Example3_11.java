package unit3;

import java.util.Scanner;

/*
 * 换抵挡装置
 * 2112112112
 * 2212112
 * 所有的题目都是误导你的题目，一定要明白这个题目其实就是干嘛的
 * 这里的这个题目就变成了字符串匹配的问题了
 */
public class Example3_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n1 = "12121212";
		String n2 = "21212121";
		int i = 0;
		for(;i<n1.length();i++){
			int l = i;
			int r = 0;
			while(l<n1.length()&&r<n2.length()){
				if(n1.charAt(l)==n2.charAt(r)&&n1.charAt(l)=='2'){
					break;
				}else{
					l++;
					r++;
				}
			}
			if(r==n2.length()){
				System.out.println(n1.length());
				break;
			}
			if(l==n1.length()){
				System.out.println(n1.length()+n2.length()-r-1);
				break;
			}
		}
		if(i==n1.length()){
			System.out.println(n1.length()+n2.length());
		}
	}
}
