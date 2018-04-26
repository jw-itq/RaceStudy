package unit3;

import java.util.Scanner;

/*
 * 第三题的回文串书上的方法，这个方法里面用到了很多的技巧，所以有必要学习下
 * 再次分析镜像串，它其实也是回文串，就是说前面的一半如果镜像回来等于后面的一半，那它肯定就是镜像串了
 * 所以这里的思路就是在首位判断回文串的时候，顺便把其中一半镜像一下，看是否等于后半部分，只要不等于，那肯定就不是
 */

public class Three_3_3_3f {
	private final static String sev = "A   3  HIL JM O   2TUVWXY51SE Z  8 ";//只要是镜像字符都能在这里找到
	private final static String[] mag = {"is not a palindrome","is a regular palindrome",
		"is a mirrored string","is a mirrored palindrome"};
	public static char get(char t){
		if(t<='Z'&&t>='A'){
			return sev.charAt(t-'A');
		}
		return sev.charAt(t-'0'+25);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
		String str = "2A3MEAS";
		//这里用到的使用二进制位权相加来代替if判断，这个要记住
		int s = 1;//是否是回文串，初始化1表示是回文串
		int m = 1;//是否是镜像串，初始化1表示yes
		for(int i = 0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				s = 0;
			}
			if(get(str.charAt(i))!=str.charAt(str.length()-1-i)){
				m = 0;
			}
		}
		System.out.println(mag[m*2+s]);
	}
}
