package unit3;

import java.util.Scanner;

/*
 * ��ʽ����,������ݸ�ֽ���������м���˷�������һ������Ҫ������ÿһ�������������
 * �ҵ�˼·���ǰ�ÿһ�����������������Ǹ�����ƥ�䣬�������������ʹ����ʽ����
 * ���ˣ������ʽ�и�Ҫ�����abc*de��������λ������λ���������5λ�������´����ʽ��ʱ����
 */
public class Three3_2_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = 2357+"";
		int count = 0;
		for(int i = 100;i<=999;i++){
			for(int j = 11;j<=99;j++){
				int a = i*(j%10);
				int b = i*(j/10);
				int c = i*j;
				String str = a+""+b+""+c+""+i+""+j;
				boolean ok = true;
				for(int t = 0;t<str.length();t++){//����str��ֻҪ������һ��������n���Ǿ��ǲ�����
					for(int k = 0;k<n.length();k++){
						if(str.charAt(t)!=n.charAt(k)){
							ok = false;//
						}else{
							ok = true;
							break;
						}
					}
					if(ok==false){//���ƥ�������е�n��û��ƥ��Ļ����Ǿ���˵����ַ�����������
						break;
					}
				}		
				if(ok){
					count++;
					System.out.printf("<%d>\n%5d\nX%4d\n-----\n%5d\n%-5d\n-----\n%5d\n",count,i,j,a,b,c);
				}
			}
		}
	}
}
