package other;

import java.util.Arrays;

/**
 * ����������Ĵ��������������ַ�����ġ�*���ƶ����ַ�����ǰ�棬���ǡ�*���ƶ����ַ����ĺ��棬
 * ��󷵻ء�*�������������磺ab**cd**rf*e12,�����Ӧ�ñ��*****abcdfe12,������5
 * 
 * ˼·��
 * 	�Ӻ��濪ʼ������ָ�������i��j
 * 	i��ʾ�����ں����ַ����ǡ�*���ַ��ġ�*���ַ��������ǵȵ�j����һ���ǡ�*���ַ���ʱ��Ϳ�ʼ����
 * 	j��ʾ�Ӻ��濪ʼ��ǰ�濪ʼ�ƶ���Ѱ�ҷǡ�*���ַ�������֤i����ȷʵ���*���ַ������ˣ��Ϳ���
 * 		��ʼ��i�ַ������ˣ����ƶ�i
 * @author Administrator
 *
 */
public class CharMove {

	public static int moveChar(char[] ch){
		int i = ch.length-1;
		boolean t = false;//��ʾiָ���ҵ��ˡ�*���ַ�
		for(int j = i;j>=0;j--){
			//�ж�iָ���ǲ����ҵ��ˡ�*���ַ���û���ҵ�������ǰ���ƶ���Ҫ���ҵ��ˣ����ƶ����¾ͽ���j��������
			if(!t&&ch[i]!='*'){
				i--;
			}//�ж�j�ǲ�����i�ҵ���*���ַ��Ժ��ҵ��������ַ����Ǿ�Ӧ�ý���ֵ��i������ǰ�ƶ�һλ
			else{
				t = true;
			}
			if(t&&ch[j]!='*'){
				ch[i] = ch[j];
				ch[j] = '*';
				i--;
			}
		}
		
		//�������Ҳ���ѭ���ж�������������ж��ٸ���*��
		String s = Arrays.toString(ch);
		s = s.replaceAll("[\\[, *\\]]", "");
		return ch.length-s.length();
	}
	
	public static void main(String[] args) {
		String str = "ab**cd**f*e12";
		System.out.println(moveChar(str.toCharArray()));
	}
}
