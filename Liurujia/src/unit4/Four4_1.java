package unit4;

import java.util.Arrays;

/*
 * ���ϵ�����
 * �ҵ��뷨�������ģ��������ַ���������ӳ������õ�ԭ�����Ǹ��ַ�����Ȼ��
 * ���ֵ䶼����ã�ֻҪ������һ���ܹ�����true����ô��֤����YES
 */
public class Four4_1 {
	private static boolean is_ancient(char[] s1,char[] s2){
		char[] f = new char[s1.length];
		for(int i = 0;i<s1.length;i++){
			f[i] = (char) (s1[i]+1);
		}
		Arrays.sort(f);
		Arrays.sort(s2);
		String a = "",b = "";
		for(int i = 0;i<f.length;i++){
			a+=f[i];
			b+=s2[i];
		}
		return a.equals(b)?true:false;
	}
	public static void main(String[] args) {
		char[] s1 = "JWPUDJSTVP".toCharArray();
		char[] s2 = "VICTORIOUS".toCharArray();
		System.out.println(is_ancient(s1, s2)||is_ancient(s2, s1));
	}
}
