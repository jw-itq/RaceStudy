package unit3;

import java.util.Scanner;

/*
 * 
 * 5/43
 */
public class Example3_8 {
	static int count = 0;
	static String str = "";
	static int b = 10;
	static int at = 3;
	public static String fc(int a){
		str +=a/b;
		count++;
		int f = a%b;
		if(f*10==at||f==at||f==0){
			return str;
		}
		return fc(f*10);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		at = scan.nextInt();
		b = scan.nextInt();
		System.out.println("0."+fc(at%b*10)+"\n"+count);
	}
}
