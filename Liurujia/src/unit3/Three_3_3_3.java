package unit3;

import java.util.Scanner;

/*
 * ������Ĵʣ������ҵ�˼·�������ģ�
 * ���ڻ��Ĵʻ�����˵�ˣ��϶����Ƕ԰�һ�ۣ�Ȼ����λƥ��
 * ���ھ���ʵĻ����Ҿ������ղ�һ������һ���ַ������棬������β�һ������Ҫ����Ҫƥ��ķ��ں��棬��Ϊ
 * java����indexofƥ����ǵ�һ�γ��ָ��ַ�����������ˣ�ֻҪ�����ˣ�������һ��������Ҳ������Ǿ�˵
 * �����Ǿ���԰�
 * ͻȻ���뵽�ˣ���Ϊ������Ҫ���ж��ǲ��Ǿ�����ģ���û��˵Ҫ��������������ֻ��Ҫ�����ܳ��־�����ĵ�
 * �ʷ����ַ������棬ƥ��ͺ���,,���У���Ŀ˵Ҫ��ԭ����ͬ���Ǻ�����Ҫ�������Ƚ�һ��
 */
public class Three_3_3_3 {
	private final static String re = "AAE3HHIIMMOOJLS2TTUUVVWWXXYY115Z88";
	private final static String re1 = "LJ2SZ53E";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
		String str = "2A3MEAS";
		String s = "";
		boolean mirr = true;//��ʼ���Ǿ����
		boolean panli = true;//��ʼ���ǻ��Ĵ�
		for(int i = 0;i<str.length();i++){//�ж��Ƿ��Ǿ���
			if(re.indexOf(str.charAt(i))>=0||re1.indexOf(str.charAt(i))>=0){
				if(str.charAt(i)=='L'||str.charAt(i)=='2'||str.charAt(i)=='Z'||str.charAt(i)=='3'){
					s+=re1.charAt(re1.indexOf(str.charAt(i))+1);
				}else{
					s+=re.charAt(re.indexOf(str.charAt(i))+1);
				}
			}else{//������϶��Ͳ��Ǿ����
				mirr = false;
			}
		}
		//�����һ�ε�ʱ��������ˣ�ԭ�������û�п��ǵ�׷�ӹ����Ƿ���
		//�������õ���sringbuffer�����reverse��ת�ַ�����������������㣬�����Ҽǵ�stringbufferͦ��ʱ��
		s = new StringBuffer(s).reverse().toString();
		if(s.length()!=str.length()||!s.equals(str)){
			mirr = false;
		}
		
		//�жϻ��Ĵ�
		int l = 0;
		int r = str.length()-1;
		while(l<r){
			if(str.charAt(l)==str.charAt(r)){
				l++;r--;
				continue;
			}else{
				break;
			}
		}
		if(l<r){
			panli = false;
		}
		
		if(mirr||panli){
			if(mirr&&panli){
				System.out.println("���Ǿ���Ҳ�ǻ��Ĵ�");
			}else if(mirr){
				System.out.println("�Ǿ��񴮲��ǻ���");
			}else{
				System.out.println("�ǻ��Ĵ����Ǿ���");
			}
		}else{
			System.out.println("������");
		}
	}
}
