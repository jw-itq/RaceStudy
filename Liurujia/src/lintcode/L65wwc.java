package lintcode;

/*
 * 65. ���������������λ��

�������������A��B�ֱ���m��n�������ҵ����������������λ����Ҫ��ʱ�临�Ӷ�ӦΪO(log (m+n))��

����

��������A = [1,2,3,4,5,6] B = [2,3,4,5]����λ��3.5

��������A = [1,2,3] B = [4,5]����λ�� 3

��˵˼·����Ϊ�����и�3.5�ҵĵ�һ��Ӧ������ƽ����������������Ļ���
���ҵĵ�һ��Ӧ������������������ĺ�Ȼ�������������������ĺ�Ȼ�󲻾�������
�������Ҫ���ǵ��ľ��Ǻ���0��ô������⣬�������0�Ļ����ǾͲ���Ҫ��Ҳ����
˵�������ƽ����ʱ����Ĳ�������������ĳ��ȣ�������Ч���ĸ���
 */
public class L65wwc {
	public double findMedianSortedArrays(int[] A, int[] B) {
        // write your code here
		double sum = 0;
		int n = 0;
		for(int i = 0;i<A.length;i++){
			if(A[i]==0){
				continue;
			}
			n++;
			sum += A[i];
		}
		for(int i = 0;i<B.length;i++){
			if(B[i]==0){
				continue;
			}
			n++;
			sum += B[i];
		}
		double d = sum/n;
		if(d/5==0){
			return d;
		}
		if((d+0.5)>=(int)(d+1)){
			return ((int)d)+0.5;
		}else{
			return (int)d;
		}
    }
	
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("2.5 "));
	}
}
