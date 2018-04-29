package unit3;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Ñ­»·Ð¡Êý
 * 
 */
public class Example3_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
		BigDecimal a = new BigDecimal(5);
		BigDecimal b = new BigDecimal(43);
//		BigDecimal bd = new BigDecimal(a*1.0/b);
//		System.out.println(bd);
		System.out.println(a.divide(b));
	}
}
