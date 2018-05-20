package lintcode;

/*
 * 反转一个三位数
 * 很简单，因为有stringbuffer的反转方法
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
