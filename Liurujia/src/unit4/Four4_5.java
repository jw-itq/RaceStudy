package unit4;

import java.util.Arrays;
import java.util.Scanner;


/*
 * ׷�ٵ��ӱ���еĵ�Ԫ��
 * 
Sample Input 
7 9
5
DR  2  1 5 	ɾ����
DC  4  3 6 7 9	ɾ����
IC  1  3	������
IR  2  2 4	������
EX 1 2 6 5	������Ԫ��1,2������6,5��
4
4 8
5 5
7 8
6 5
0 0
 
Sample Output 
Spreadsheet #1
Cell data in (4,8) moved to (4,6)
Cell data in (5,5) GONE
Cell data in (7,8) moved to (7,6)
Cell data in (6,5) moved to (1,2)
 */
public class Four4_5 {
	private static int[][] p,p1,p2;
	//ɾ������
	private static void del(String[] der,String[] dec){
		p1 = new int[p.length-der.length][p[0].length-dec.length];
		
		for(int i = 0;i<p.length;i++){
			for(int j = 0;j<p[i].length;j++){
				if(){
					
				}
			}
		}
	}
	//�������
	private static void ins(String[] inr,String[] inc){
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = 7;
		int c = 9;
		int init = 0;
		p = new int[7][9];
		for(int i = 0;i<p.length;i++){
			for(int j = 0;j<p[i].length;j++){
				p[i][j] = init++;
			}
		}
		//����
		for(int i = 0;i<p.length;i++){
			System.out.println(Arrays.toString(p[i]));
		}
		
		//����ɾ����
		String[] der = scan.nextLine().split(" ");
		//����ɾ����
		String[] dec = scan.nextLine().split(" ");
		//����ɾ������
		del(der,dec);
		
		//���������
		String[] inr = scan.nextLine().split(" ");
		//���������
		String[] inc = scan.nextLine().split(" ");
		//���в������
		ins(inr,inc);
		
		//��ӡ���
		
	}
}
