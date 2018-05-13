package lintcode;

import java.math.BigDecimal;

/*
 * n的阶乘尾部0的个数
 */
public class L2 {
	/*static BigDecimal t = new BigDecimal(1);
	public BigDecimal trailingZeros(BigDecimal n) {
        // write your code here, try to do it without arithmetic operators.
		if(n.compareTo(t)==0){
			return t;
		}
		return trailingZeros(n.add(t.negate())).multiply(n);
    }*/
	public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
		long sum = 0;
		for(long i = 5;i<=n;i*=5){
			sum +=n/i;
		}
		return sum;
    }
	public static void main(String[] args) {
		for(int i = 1;i<=1000;i++){
//			System.out.println(i+"        "+new L2().trailingZeros(new BigDecimal(i)));
			System.out.println(i+"     "+new L2().trailingZeros(i));
		}
	}
}
