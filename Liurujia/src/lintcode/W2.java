package lintcode;

import java.util.Arrays;

/*
 * ��дд�������д��������
 * ���ŵ�˼��������÷��ε�˼��
 */
public class W2 {
	public static void main(String[] args) {
		int[] ar = {2,9,1,20,9,3,0,6,3,2};
		quick(ar,0,ar.length-1);
		System.out.println(Arrays.toString(ar));
	}

	private static void quick(int[] ar,int left,int right) {
		if(left>right){
			return;
		}
		int temp = ar[left];//�����Ǹ���־
		int i = left;//���Ǵ���߿�ʼ������ָ��
		int j = right;//���Ǵ��ұ߿�ʼ������ָ��
		while(i!=j){//��i==j��ʱ��Ͳ���Ҫ�����ˣ���ʼ��һ��,����Ҫ�ѱ�־���滻��i�±��ֵ
			while(i<j&&ar[j]>=temp) j--;//һ����ס�ˣ���������һ��Ҫ�Ӻ��濪ʼ
			while(i<j&&ar[i]<=temp) i++;//��־λ��߶�Ҫ����С,�ұߵĶ�Ҫ������
			int f = ar[i];
			ar[i] = ar[j];
			ar[j] = f;
		}
		ar[left] = ar[i];
		ar[i] = temp;
		quick(ar,i+1,right);
		quick(ar,left,i-1);
	}
}
