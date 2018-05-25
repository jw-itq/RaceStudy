package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * nÊıÖ®ºÍ
 */
public class L57dfs {
	
	
	/*public ArrayList<ArrayList<Integer>> fourSum1(int[] num, int target) {
		ArrayList<ArrayList<Integer>> rst = new ArrayList<>();
		Arrays.sort(num);

		for (int i = 0; i < num.length - 3; i++) {
			if (i != 0 && num[i] == num[i - 1]) {
				continue;
			}

			for (int j = i + 1; j < num.length - 2; j++) {
				if (j != i + 1 && num[j] == num[j - 1])
					continue;

				int left = j + 1;
				int right = num.length - 1;
				while (left < right) {
					int sum = num[i] + num[j] + num[left] + num[right];
					if (sum < target) {
						left++;
					} else if (sum > target) {
						right--;
					} else {
						ArrayList<Integer> tmp = new ArrayList<Integer>();
						tmp.add(num[i]);
						tmp.add(num[j]);
						tmp.add(num[left]);
						tmp.add(num[right]);
						rst.add(tmp);
						left++;
						right--;
						while (left < right && num[left] == num[left - 1]) {
							left++;
						}
						while (left < right && num[right] == num[right + 1]) {
							right--;
						}
					}
				}
			}
		}

		return rst;
	}*/
	public static void main(String[] args) {
		int[] ar = {-2,-3,5,-1,-4,5,-11,7,1,2,3,4,-7,-1,-2,-3,-4,-5};
//		List<ArrayList<Integer>> list = new L57dfs().fourSum(ar, 2);

	}
}
