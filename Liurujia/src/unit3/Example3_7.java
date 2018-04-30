package unit3;

import java.util.Scanner;

/*
 * DNA����
input��
6 10
ATGTTACCAT
AAGTTACGAT
AACAAAGCAA
AAGTTACCTT
AAGTTACCAA
TACTTACCAA

ATGTTACCAT
AAGTTACGAT
AACAAAGCAA
AAGTTACCTT
AAGTTACCAA
TACTTACCAA
AACGTACCAA
AACTTACCAA
output��
AAGTTACCAA
12
��������˼·һ�������ÿһ���ظ����������Ǹ���ĸ��Ȼ��������ظ��ģ��Ͱ��ֵ�����ȥ��ǰ���Ǹ�
�����Ǹ���������m������������ȥ�ظ���ĸ�Ĵ����ĺ�
 */
public class Example3_7 {
	private static int hamming = 0; 
	private static char[][] chr;//�������������д�
	private static char[] result = {'A','C','G','T'};//�Ѿ��ź����˵�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();//����
		int n = scan.nextInt();//����
		chr = new char[m][n];
		for(int i = 0;i<m;i++){
			chr[i] = scan.next().toCharArray();
		}
		//����������Ҫ���������ά���飬���н��б�������Ϊ��ÿ��Ҫ�Ƚϵ���ÿ�е�ֵ��Ҳ����˵��������
		for(int i = 0;i<n;i++){
			//��������᷵��һ��char��ֵ�����ֵ������һ�����ظ����������Ǹ�ֵ
			char ts = getCheck(i,m);
			System.out.print(ts+"");
		}
		System.out.println(hamming);
	}
	//�������i������,m�����е�����
	private static char getCheck(int i,int m) {
		//�½�һ������ͳ������������
		int[] count = new int[4];
		//ÿ��ÿ�еı���
		for(int t = 0;t<m;t++){
			switch (chr[t][i]) {
			case 'A':
				count[0]++;
				break;
			case 'C':
				count[1]++;
				break;
			case 'G':
				count[2]++;
				break;
			case 'T':
				count[3]++;
				break;
			default:
				break;
			}
		}
		//�����ҵ��ظ���������
		int max = -1;
		char ch = '0';
		for(int t = 0;t<4;t++){
			if(max<count[t]){
				max = count[t];
				ch = result[t];
			}
		}
		//����hamming
		hamming+=m-max;
		return ch;
	} 
}
