package unit4;

/*
 * �����ж�
 */
public class Four1_2 {
	/**
	 * 
	 * ������ֻ�ܱ�1�ͱ�����������������2��3��5����
	 * @param n ��Ҫ�ж��Ƿ������ֵ�����
	 * @param i ��2��ʼ�ۼ��ж�
	 * @return ����������ͷ���true�����򷵻�false
	 */
	private static boolean s(int n,int i){
		if(n==i){
			return true;
		}
		if(n%i==0){
			return false;
		}
		return s(n,i+1);
	}
	public static void main(String[] args) {
		int n = 21;
		if(n==2){
			System.out.println("true");
		}else{
			System.out.println(s(n,2));
		}
	}
}
