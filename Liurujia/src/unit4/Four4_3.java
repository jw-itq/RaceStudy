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
	private static int n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = 10;
		int k = 4;
		int m = 3;
		left = n;
		kn = new int[n+1];
		for(int i = 1;i<=n;i++){//初始化kn数组
			kn[i] = i;
		}
		
		int pl = n,pr = 1;
		while(left!=0){//循环走完所有的人，只要left还不是0
			pr = go(pr,-1,m);
			pl = go(pl,1,k);
			left--;
			System.out.print(pl);
			if(pl!=pr){
				System.out.print(","+pr);
				left--;
			}
			System.out.print("  ");
			kn[pl] = kn[pr] = 0;
		}
	}
	private static int go(int p, int i, int k) {
		while(k--!=0){
			do{
				p = (p+i+n-1)%n+1;
			}while(kn[p]==0);
		}
		return p;
	}
}
