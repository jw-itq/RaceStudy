package lintcode;


/*
 * 其实好多东西，是真的写多了才会用！
 * 49. 字符大小写排序

给定一个只包含字母的字符串，按照先小写字母后大写字母的顺序进行排序。

样例

给出"abAcD"，一个可能的答案为"acbAD"
 */
public class L49 {
	public void sortLetters(char[] chars) {
        // write your code here
		char[] ar = chars;
		int i = 0;
		int j = chars.length-1;
		while(i<j){
			while(i<j&&Character.isUpperCase(chars[j])) j--;
			while(i<j&&Character.isLowerCase(chars[i])) i++;
			char ch = ar[i];
			ar[i] = ar[j];
			ar[j] = ch;
//			i++;
//			j--;
		}
		chars = ar;
    }
	
	public static void main(String[] args) {
		char[] ch = {'a','b','A','c','D'};
		new L49().sortLetters(ch);
	}
}
