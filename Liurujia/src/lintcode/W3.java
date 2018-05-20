package lintcode;

import java.util.Arrays;

/*
 * �˻ʺ���ϰ
 */
public class W3 {
	static int[][] arr;
	static int count = 0;
	public void find(int t,int n){
		if(t==n){
			count++;
			for(int i = 0;i<arr.length;i++){
				System.out.println(Arrays.toString(arr[i]));
			}
			System.out.println();
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
		//�ж���
		for(int i = 0;i<k;i++){
			if(arr[t][i]==1){
				return false;
			}
		}
		//�ж���
		for(int i = 0;i<t;i++){
			if(arr[i][k]==1){
				return false;
			}
		}
		//�ж����ϱ�
		for(int i = t-1,j = k-1;i>=0&&j>=0;i--,j--){
			if(arr[i][j]==1){
				return false;
			}
		}
		//�ж����ϱ�
		for(int i = t-1,j = k+1;i>=0&&j<arr.length;i--,j++){
			if(arr[i][j] == 1){
				return false;
			}
		}
		//���������������������Ͼ�˵��������������ϣ�Ҳ���Ƿ���true
		return true;
	}
	
	public static void main(String[] args) {
		arr = new int[8][8];
		new W3().find(0, 8);
		System.out.println(count);
	}
}
