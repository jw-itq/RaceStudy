package other;

import java.util.Arrays;

/**
 * 编程完成下面的处理函数。函数将字符里面的“*”移动到字符串的前面，将非“*”移动到字符串的后面，
 * 最后返回“*”的数量。例如：ab**cd**rf*e12,处理后应该变成*****abcdfe12,并返回5
 * 
 * 思路：
 * 	从后面开始放两个指针变量，i，j
 * 	i表示紧贴在后面字符串非“*”字符的“*”字符，作用是等到j碰到一个非“*”字符的时候就开始交换
 * 	j表示从后面开始向前面开始移动的寻找非“*”字符，并保证i变量确实到达“*”字符上面了，就可以
 * 		开始跟i字符交换了，并移动i
 * @author Administrator
 *
 */
public class CharMove {

	public static int moveChar(char[] ch){
		int i = ch.length-1;
		boolean t = false;//表示i指针找到了“*”字符
		for(int j = i;j>=0;j--){
			//判断i指针是不是找到了“*”字符，没有找到可以向前面移动，要是找到了，那移动的事就交给j来控制了
			if(!t&&ch[i]!='*'){
				i--;
			}//判断j是不是在i找到“*”字符以后找到了其它字符，那就应该交换值，i变量向前移动一位
			else{
				t = true;
			}
			if(t&&ch[j]!='*'){
				ch[i] = ch[j];
				ch[j] = '*';
				i--;
			}
		}
		
		//在这里我不用循环判断这个数组里面有多少个“*”
		String s = Arrays.toString(ch);
		s = s.replaceAll("[\\[, *\\]]", "");
		return ch.length-s.length();
	}
	
	public static void main(String[] args) {
		String str = "ab**cd**f*e12";
		System.out.println(moveChar(str.toCharArray()));
	}
}
