package lintcode;

/*
 * ��תһ����λ��
 * �ܼ򵥣���Ϊ��stringbuffer�ķ�ת����
 */
public class L37 {
	public int reverseInteger(int number) {
        // write your code here
		StringBuffer sbf = new StringBuffer(number+"");
		return Integer.parseInt(sbf.reverse()+"");
    }
	
	public static void main(String[] args) {
		System.out.println(new L37().reverseInteger(12345));
	}
}
