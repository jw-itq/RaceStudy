package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * 50. 数组剔除元素后的乘积

给定一个整数数组A。

定义B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]， 计算B的时候请不要使用除法。

样例

给出A=[1, 2, 3]，返回 B为[6, 3, 2]
 */
public class L50 {
	public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
		List<Long> list = new ArrayList<>();
		int n = nums.size();
		for(int i = 0;i<n;i++){
			Long ln = (long)1;
			for(int j = 0;j<i;j++){
				ln *= nums.get(j);
			}
			for(int k = i+1;k<n;k++){
				ln *= nums.get(k);
			}
//			System.out.println(ln);
			list.add(ln);
		}
		return list;
    }
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		new L50().productExcludeItself(list);
	}
}
