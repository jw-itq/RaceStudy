package unit4;


/*
 * ���������
 * 
 */
public class Four1_1 {
	/**
	 * 
	 * @param n ��Ҫ����Ľ׳�����
	 * @param s ��ʲô�ط���ʼ���㣬��һ���Ǵ�1��ʼ����
	 * @param t ��ʾ�ݹ�ֹͣ��λ��
	 * @return ���ؽ׳˵Ľ����s
	 */
	private static long j(long n,long s,long t){
		if(n==t){
			return s;
		}
		return j(n-1,s*=n,t);
	}
	public static void main(String[] args) {
		long n = 21;
		long m = 1;
		long t = n-m;
		System.out.println(j(n,t+1,t+1)/(j(m,1,1)));
	}
}
