package unit3;

import java.util.Scanner;

/*
 * WERTU,敲错的键盘符号,要求纠正输出，书上面的想法是放到一个字符串里面，然后逐一匹配，
 * 遇到一个就输出此字符串前面的那个字符
 */
public class Three_3_3_2 {
	//定义一个常量，为了方便以下的匹配
	private final static String chre = "qwertyuiop[asdfghjkl;'zxcvbnm,./";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String re = scan.next();
		String re = "O S, GOMR YPFSU";
		String s = "";
		re = re.toLowerCase();//这里转换成小写，跟我定义的一致
		for(int i = 0;i<re.length();i++){
			int r = chre.indexOf(re.charAt(i));//在源字符串中查找这个字符的索引，返回索引，如果没有找到，返回的是-1
			s+=r>-1?chre.charAt(r-1):re.charAt(i);//拿到索引后将前面的那个找到输出即可
		}
		System.out.println(s.toUpperCase());//最后输出的时候要转换成大写
	}
}
