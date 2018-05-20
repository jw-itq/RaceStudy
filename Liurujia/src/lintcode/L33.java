package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * N皇后的问题
 */
public class L33 {
	List<List<String>> list = new ArrayList<>();
	char[][] arr;
	public List<List<String>> solveNQueens(int n) {
        // write your code here
		arr = new char[n][n];
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				arr[i][j] = '.';
			}
		}
		find(0,n);
		return list;
    }
	private void find(int t,int n) {
		if(t==n){
			List<String> ls = new ArrayList<>();
			String s = "";
			for(int i = 0;i<arr.length;i++){
				for(int j = 0;j<arr[i].length;j++){
					s += arr[i][j];
				}
				ls.add(s);
				s = "";
			}
			list.add(ls);
		}else{
			for(int i = 0;i<n;i++){
				if(rule(arr,t,i)){
					arr[t][i] = 'Q';
					find(t+1,n);
					arr[t][i] = '.';
				}
			}
		}
	}
	private boolean rule(char[][] arr2, int k, int t) {
		//判断行
		for(int i = 0;i<k;i++){
			if(arr[i][t]=='Q'){
				return false;
			}
		}
		//判断列
		for(int i = 0;i<t;i++){
			if(arr[k][i]=='Q'){
				return false;
			}
		}
		//判断左边对角线0
		for(int i = k-1,j = t-1;i>=0&&j>=0;i--,j--){
			if(arr[i][j]=='Q'){
				return false;
			}
		}
		//判断右边的对角线
		for(int i = k-1,j = t+1;i>=0&&j<arr2.length;i--,j++){
			if(arr[i][j]=='Q'){
				return false;
			}
		}
		return true;
	}
	/*static int[][] arr = new int[8][8];
	static int count = 0;
	public static void f(int t){
		if(t>7){
			count++;
			for(int i = 0;i<arr.length;i++){
				System.out.println(Arrays.toString(arr[i]));
			}
			System.out.println();
			return;
		}else{
			for(int i = 0;i<8;i++){
				if(rule(arr,t,i)){
					arr[t][i] = 1;
					f(t+1);
					arr[t][i] = 0;
				}
			}
		}
	}
	private static boolean rule(int[][] arr2, int t, int m) {
		//首先判断行
		for(int i = 0;i<m;i++){
			if(arr[t][i]==1){
				return false;
			}
		}
		//再判断列
		for(int i = 0;i<t;i++){
			if(arr[i][m]==1){
				return false;
			}
		}
		//判断左边对角线
		for(int i = t-1,j=m-1;i>=0&&j>=0;i--,j--){
			if(arr[i][j]==1){
				return false;
			}
		}
		//判断右边的对角线
		for(int i = t-1,j=m+1;i>=0&&j<8;i--,j++){
			if(arr[i][j]==1){
				return false;
			}
		}
		return true;
	}*/
	
	public static void main(String[] args) {
		List<List<String>> lis = new L33().solveNQueens(4);
		for(List<String> i : lis){
			System.out.println(i.toString());
		}
		System.out.println(lis.size());
	}
}
