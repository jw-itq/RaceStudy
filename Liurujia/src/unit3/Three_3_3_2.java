package unit3;

import java.util.Scanner;

/*
 * WERTU,�ô�ļ��̷���,Ҫ������������������뷨�Ƿŵ�һ���ַ������棬Ȼ����һƥ�䣬
 * ����һ����������ַ���ǰ����Ǹ��ַ�
 */
public class Three_3_3_2 {
	//����һ��������Ϊ�˷������µ�ƥ��
	private final static String chre = "qwertyuiop[asdfghjkl;'zxcvbnm,./";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String re = scan.next();
		String re = "O S, GOMR YPFSU";
		String s = "";
		re = re.toLowerCase();//����ת����Сд�����Ҷ����һ��
		for(int i = 0;i<re.length();i++){
			int r = chre.indexOf(re.charAt(i));//��Դ�ַ����в�������ַ����������������������û���ҵ������ص���-1
			s+=r>-1?chre.charAt(r-1):re.charAt(i);//�õ�������ǰ����Ǹ��ҵ��������
		}
		System.out.println(s.toUpperCase());//��������ʱ��Ҫת���ɴ�д
	}
}
