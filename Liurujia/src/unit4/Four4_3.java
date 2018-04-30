package unit4;

import java.util.Scanner;

/*
 * 救济金发放
 * 
 * n=10,k=4,m=3
 */
public class Four4_3 {
	private static int left;//还剩left个人
	private static int[] kn;//n个人编号的数组
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 10;
		int k = 4;
		int m = 3;
		left = 10;
		kn = new int[10];
		for(int i = 1;i<=n;i++){//初始化kn数组
			kn[i-1] = i;
		}
		
		while(left!=0){//循环走完所有的人，只要left还不是0
			
		}
	}
}
