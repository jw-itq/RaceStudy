package lintcode;

import java.util.Arrays;
import java.util.Collections;

/*
 * 两数之和
 */
public class L56a {
	/*public int[] twoSum(int[] numbers, int target) {
        // write your code here
		int[] result = new int[2];
		Arrays.sort(numbers);
		if(target<0){
			//Arrays.sort(numbers,Collections.reverseOrder());
		}
		int i = numbers.length-1;
		while(0<=i&&numbers[i]>=target) i--;
		int cou = 0;
		for(int j = 0;j<=i/2;j++){
			for(int k = i/2+1;k<=i;k++){
				if(numbers[j]+numbers[k]==target){
					result[0] = j;
					result[1] = k;
					return result;
				}
			}
		}
		return result;
    }*/
	public static void main(String[] args) {
		int[] num = {1,0,-1};
		//System.out.println(Arrays.toString(new L56().twoSum(num, 9)));
	}
}
