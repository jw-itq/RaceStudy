package lintcode;

import java.util.Scanner;

/*
 * 挑战程序设计竞赛p30
 */
public class W5quan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		boolean bl = getbl(a,k,0,0);
		System.out.println(bl);
	}

	private static boolean getbl(int[] a, int k, int t,int sum) {
		if(sum==k){
			return true;
		}
		if(t>a.length-1){
			return false;
		}
		if(getbl(a,k,t+1,sum)){
			return true;
		}
		if(getbl(a,k,t+1,sum+a[t])){
			return true;
		}
		return false;
	}
}
