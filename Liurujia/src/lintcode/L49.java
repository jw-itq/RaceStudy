package lintcode;


/*
 * ��ʵ�öණ���������д���˲Ż��ã�
 * 49. �ַ���Сд����

����һ��ֻ������ĸ���ַ�����������Сд��ĸ���д��ĸ��˳���������

����

����"abAcD"��һ�����ܵĴ�Ϊ"acbAD"
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
