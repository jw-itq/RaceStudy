package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * 50. �����޳�Ԫ�غ�ĳ˻�

����һ����������A��

����B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]�� ����B��ʱ���벻Ҫʹ�ó�����

����

����A=[1, 2, 3]������ BΪ[6, 3, 2]
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
