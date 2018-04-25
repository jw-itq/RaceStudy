package unit3;

import java.util.Arrays;
import java.util.Scanner;

//蛇形填数
/*
 * 总结一哈，这还是我自己分析写出来的，没有看他写的。哈哈，我觉得一定要静下心来慢慢慢慢的思考规律就好了
 * 不能把问题看的太大，一定要分解，把问题想得极为简单，最后来处理细节！
 */
public class Thtee3_1_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		int start = 0;
		for(int i = 0;i<n/2;i++){
			//这里是往下
			for(int j = i;j<n;j++){
				if(arr[j][n-i-1]==0){
					arr[j][n-i-1]=++start;
				}
			}
			//这里是往左
			for(int j = n-i-1;j>=i;j--){
				if(arr[n-i-1][j]==0){
					arr[n-i-1][j]=++start;
				}
			}
			//这里是往上
			for(int j = n-i-1;j>=i;j--){
				if(arr[j][i]==0){
					arr[j][i]=++start;
				}
			}
			//这里是往右
			for(int j = i;j<n-i-1;j++){
				if(arr[i][j]==0){
					arr[i][j]=++start;
				}
			}
		}
		
		for(int i = 0;i<n;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
