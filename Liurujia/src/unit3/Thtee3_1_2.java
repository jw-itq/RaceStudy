package unit3;

import java.util.Arrays;
import java.util.Scanner;

//��������
/*
 * �ܽ�һ�����⻹�����Լ�����д�����ģ�û�п���д�ġ��������Ҿ���һ��Ҫ������������������˼�����ɾͺ���
 * ���ܰ����⿴��̫��һ��Ҫ�ֽ⣬��������ü�Ϊ�򵥣����������ϸ�ڣ�
 */
public class Thtee3_1_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		int start = 0;
		for(int i = 0;i<n/2;i++){
			//����������
			for(int j = i;j<n;j++){
				if(arr[j][n-i-1]==0){
					arr[j][n-i-1]=++start;
				}
			}
			//����������
			for(int j = n-i-1;j>=i;j--){
				if(arr[n-i-1][j]==0){
					arr[n-i-1][j]=++start;
				}
			}
			//����������
			for(int j = n-i-1;j>=i;j--){
				if(arr[j][i]==0){
					arr[j][i]=++start;
				}
			}
			//����������
			for(int j = i;j<n-i-1;j++){
				if(arr[i][j]==0){
					arr[i][j]=++start;
				}
			}
		}
		
		for(int i = 0;i<n;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
