package lintcode;

import java.util.Arrays;

/*
 * �ϲ���������2
 */
/*
while(arr[j]>=temp&&i<j){
j--;
}
while(arr[i]<=temp&&i<j){
i++;
}
��������while��˳���ǲ��ܸı�ģ���һ�룺
��������½�������

����ͼ��6����9����  ���ǽ�6��Ϊ������
�������߿�ʼ������ȷ���������෴��
����i �ͻ��ƶ������ڵ� ���� 7 �Ǹ�λ��ͣ��������  j ԭ���� ���� 9 �Ǹ�λ�� ����Ϊ
while(arr[j]>=temp&&i<j)
���ǣ�j Ҳ��ͣ��������7 �Ǹ�λ�ã������������ˡ�������󽻻�����6��7ʱ������ѽ������
�������ڵ������ȴ�����߿�ʼʱ����ô i ��ͣ�����Ǹ�λ�ÿ϶��Ǵ��ڻ���6�ģ��������������У�Ϊ������ i<j ���� jҲͣ����7��λ��
����󽻻���ȥ��ʱ��7�͵�����ߣ����У���Ϊ����ԭ�� ����������6�ڱ�Ӧ����ȫ��С��6���ұ�ȫ������6.�����ڲ����ˡ�
���ǣ����Ǳ�����ұ߿�ʼ��Ҳ���Ǵӻ����Ķ��濪ʼ��
 */
public class L6 {
	public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
		int[] ab = new int[A.length+B.length];
		int i = 0;
		int a = 0;
		int b = 0;
		while(a<A.length){
			ab[i++]=A[a++];
		}
		while(b<B.length){
			ab[i++]=B[b++];
		}
		f(0,ab.length-1,ab);
		return ab;
    }
	public void f(int left,int right,int[] ab){
		if(left>right){
			return;
		}
		int temp = ab[left];
		int i = left;
		int j = right;
		while(i!=j){
			while(ab[j]>=temp&&i<j) j--;
			while(ab[i]<=temp&&i<j) i++;
			int f = ab[i];
			ab[i] = ab[j];
			ab[j] = f;
		}
		int f = ab[left];
		ab[left] = ab[i];
		ab[i] = f;
		f(left,i-1,ab);
		f(j+1,right,ab);
	}
	public static void main(String[] args) {
		int[] a = {1,3,5,6};
		int[] b = {1,3,7,7};
		System.out.println(Arrays.toString(new L6().mergeSortedArray(a, b)));
	}
}
