package lintcode;

import java.util.Arrays;

/*
 * 64. �ϲ���������

�ϲ������������������A��B���һ���µ����顣

����

���� A = [1, 2, 3, empty, empty], B = [4, 5]

�ϲ�֮�� A ����� [1,2,3,4,5]

��Ϊ�Ҿ�������Ĵ�С�ǲ��ܸı�ģ���������Ļ�����ֻ������newһ���µ����飬Ȼ����������������ֵ�Ž�ȥ��
���������뷨;
��������˵�Ļ�������һ�£�����m����������ã���ʵ��A����Ĵ�С������ʵA�������滹��n����λ��Ҫ�����
��ֻ��Ҫ��m+i��λ�ÿ�ʼ��B�������ȥ�Ϳ����ˣ������õ���һ��system�ķ�������������
 */
public class L64 {
	public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
		/*int[] ar = new int[m+n];
		for(int i = 0;i<m;i++){
			ar[i] = A[i];
		}*/
		/*for(int i = 0;i<n;i++){
			A[m+i] = B[i];
		}*/
		//��������Ĳ��������������£�
		//ԭ���飬Ҫ��ԭ������ĸ�λ�ÿ�ʼ���ƣ�Ŀ�����飬���Ƶ�Ŀ���������㣬Ŀ������Ĵ�С
		System.arraycopy(B, 0, A, m, n);
//		System.out.println(Arrays.toString(ar));
    }
	
	public static void main(String[] args) {
		int[] a = {1,2,3,0,0};
		int[] b = {4,5};
		new L64().mergeSortedArray(a, 3, b, 2);
	}
}
