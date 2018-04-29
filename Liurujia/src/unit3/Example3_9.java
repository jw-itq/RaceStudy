package unit3;

import java.util.Scanner;

/*
 * zixulie
 * 
 * abcde->bce
 */
public class Example3_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		int l = 0;
		int r = 0;
		while(l<a.length()&&r<b.length()){
			if(a.charAt(l)!=b.charAt(r)){
				l++;
			}else{
				l++;
				r++;
			}
		}
		if(r==b.length()){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
