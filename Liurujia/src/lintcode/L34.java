package lintcode;

/*
 * 返回N皇后问题的解决方案的数量，而不是具体的解决方案
 */
public class L34 {
	private int[][] arr;
	private int count = 0;
	public int totalNQueens(int n) {
        // write your code here
		arr = new int[n][n];
		find(0,n);
		return count;
    }
	private void find(int t, int n) {
		if(t == n){
			count++;
			return;
		}else{
			for(int i = 0;i<n;i++){
				if(rule(t,i)){
					arr[t][i] = 1;
					find(t+1,n);
					arr[t][i] = 0;
				}
			}
		}
	}
	private boolean rule(int t, int k) {
		//行
		for(int i = 0;i<k;i++){
			if(arr[t][i] == 1){
				return false;
			}
		}
		//列
		for(int i = 0;i<t;i++){
			if(arr[i][k] == 1){
				return false;
			}
		}
		//左上
		for(int i = t-1,j = k-1;i>=0&&j>=0;i--,j--){
			if(arr[i][j] == 1){
				return false;
			}
		}
		//右上
		for(int i = t-1,j = k+1;i>=0&&j<arr.length;i--,j++){
			if(arr[i][j] == 1){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(new L34().totalNQueens(8));
	}
}
