package unit3;

import java.util.Arrays;
import java.util.Scanner;

//开关问题
public class Three3_1_1 {
	public static void main(String[] args) {
		int n,k;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();//这个是灯的数量
		k = scan.nextInt();//这个是人的数量
		boolean[] light = new boolean[n];
		for(int i = 1;i<=k;i++){
			for(int j = 1;j<=light.length;j++){
				if(j % i == 0){
					light[j-1] = !light[j-1];
				}
			}
		}
		System.out.println(Arrays.toString(light));
	}
}
