package unit5;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ����ʯ������
 * �����ܼ򵥣���java���ַ�������ǳ��򵥣������еı�Ŷ��浽�ַ�������ȥ��
 * ������������ڲ����ַ���
 */
public class Five5_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 5;
		int n = 2;
		char[] ch = "13331".toCharArray();
		String q = "23";
		String str = "";
		Arrays.sort(ch);
		for(int i = 0;i<ch.length;i++){
			str += ch[i];
		}
		for(int i = 0;i<q.length();i++){
			if(str.indexOf(q.charAt(i))!=-1){
				System.out.println(q.charAt(i)+"found at"+(str.indexOf(q.charAt(i))+1));
			}else{
				System.out.println(q.charAt(i)+"not found");
			}
		}
	}
}
