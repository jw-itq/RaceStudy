package unit4;

import java.util.Scanner;

/*
 * �ȼý𷢷�
 * 
 * n=10,k=4,m=3
 */
public class Four4_3 {
	private static int left;//��ʣleft����
	private static int[] kn;//n���˱�ŵ�����
	private static int n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = 10;
		int k = 4;
		int m = 3;
		left = n;
		kn = new int[n+1];
		for(int i = 1;i<=n;i++){//��ʼ��kn����
			kn[i] = i;
		}
		
		int pl = n,pr = 1;
		while(left!=0){//ѭ���������е��ˣ�ֻҪleft������0
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
