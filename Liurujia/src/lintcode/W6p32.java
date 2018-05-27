package lintcode;

import java.util.Scanner;

/*
 * 总共有多少水洼
 * 
 */
public class W6p32 {
	private static int n;
	private static int m;
	private static char[][] field;
	private static int[][] fang = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		field = new char[n][m];
		for(int i = 0;i<n;i++){
			field[i] = scan.next().toCharArray();
		}
		int sum = 0;
		for(int i = 0;i<n;i++){
			for(int j = 0;j<m;j++){
				if(field[i][j]=='W'){
					dfs(i,j);
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
	private static void dfs(int x, int y) {
		field[x][y] = 'o';
		for(int i = 0;i<8;i++){
			int xx = x + fang[i][0];
			int yy = y + fang[i][1];
			if(xx<n&&xx>=0&&yy<m&&yy>=0&&field[xx][yy]=='W'){
				dfs(xx,yy);
			}
		}
	}
}
