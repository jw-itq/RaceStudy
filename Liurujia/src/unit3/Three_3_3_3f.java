package unit3;

import java.util.Scanner;

/*
 * ������Ļ��Ĵ����ϵķ�����������������õ��˺ܶ�ļ��ɣ������б�Ҫѧϰ��
 * �ٴη������񴮣�����ʵҲ�ǻ��Ĵ�������˵ǰ���һ���������������ں����һ�룬�����϶����Ǿ�����
 * ���������˼·��������λ�жϻ��Ĵ���ʱ��˳�������һ�뾵��һ�£����Ƿ���ں�벿�֣�ֻҪ�����ڣ��ǿ϶��Ͳ���
 */

public class Three_3_3_3f {
	private final static String sev = "A   3  HIL JM O   2TUVWXY51SE Z  8 ";//ֻҪ�Ǿ����ַ������������ҵ�
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
		//�����õ���ʹ�ö�����λȨ���������if�жϣ����Ҫ��ס
		int s = 1;//�Ƿ��ǻ��Ĵ�����ʼ��1��ʾ�ǻ��Ĵ�
		int m = 1;//�Ƿ��Ǿ��񴮣���ʼ��1��ʾyes
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
