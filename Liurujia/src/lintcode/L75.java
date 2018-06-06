package lintcode;

/*
 * 75. Ѱ�ҷ�ֵ

�����һ����������(sizeΪn)������������ص㣺

����λ�õ������ǲ�ͬ��
A[0] < A[1] ���� A[n - 2] > A[n - 1]
�ٶ�P�Ƿ�ֵ��λ��������A[P] > A[P-1]��A[P] > A[P+1]����������������һ����ֵ��λ�á�

����

��������[1, 2, 1, 3, 4, 5, 7, 6]����1, ����ֵ 2 ����λ��, ����6, ����ֵ 7 ����λ��.

˼·��
	��򵥵�˼·����forѭ������
	����ѭ���϶���Ҫ��ʱ�˵ģ����������Ľⷨ�͸���һ��Ľⷨ���࣬���֣�������ȥ���кú�
	�����¶���
 */
public class L75 {
	public int findPeak(int[] A) {
        // write your code here
		int left = 0;
		int right = A.length-1;
		while(left+1<right){
			System.out.println(left+",,,"+right);
			int mid = left+(right-left)/2;
			if(A[mid]<A[mid+1]){
				left = mid;
			}else{
				right = mid;
			}
		}
		return right;
    }
	
	public static void main(String[] args) {
		int[] ar = {1,2,1,3,4,5,6,7,8};
		System.out.println(new L75().findPeak(ar));
	}
}
