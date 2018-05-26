package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 *  ����֮��

����һ����n������������S����S���ҵ���������a, b, c���ҵ�����ʹ��a + b + c = 0����Ԫ�顣

����

��S = {-1 0 1 2 -1 -4}, ����Ҫ���ص���Ԫ�鼯�ϵ��ǣ�
(-1, 0, 1)

(-1, -1, 2)
 */
public class L57 {
	public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
		List<List<Integer>> ls = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();
		for(int i = 0;i<numbers.length;i++){
			for(int j = 0;j<numbers.length;j++){
				for(int k = 0;k<numbers.length;k++){
					if(i==j||i==k||j==k){
						continue;
					}
					if(numbers[i]+numbers[j]+numbers[k]==0){
						List<Integer> list = new ArrayList<>();
						list.add(numbers[i]);
						list.add(numbers[j]);
						list.add(numbers[k]);
						Collections.sort(list);
						set.add(list);
					}
				}
			}
		}
		ls.addAll(set);
		return ls;
    }
	/*//����֮��sb���뷨��
	public List<List<Integer>> fourSum(int[] numbers, int target) {
        // write your code here
		List<List<Integer>> ls = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();
		for(int t = 0;t<numbers.length;t++){
			for(int i = 0;i<numbers.length;i++){
				for(int j = 0;j<numbers.length;j++){
					for(int k = 0;k<numbers.length;k++){
						if(t==i||t==j||t==k||i==j||i==k||j==k){
							continue;
						}
						if(numbers[i]+numbers[j]+numbers[k]+numbers[t]==target){
							List<Integer> list = new ArrayList<>();
							list.add(numbers[i]);
							list.add(numbers[j]);
							list.add(numbers[k]);
							list.add(numbers[t]);
							Collections.sort(list);
							set.add(list);
						}
					}
				}
			}
		}
		ls.addAll(set);
		return ls;
    }*/
	
/*
 * ���磬���ڸ�������������S=[1, 0, -1, 0, -2, 2] �� target=0. ����Ҫ�����Ԫ�鼯��Ϊ��

(-1, 0, 0, 1)

(-2, -1, 1, 2)

(-2, 0, 0, 2)
 */
	public List<List<Integer>> fourSum(int[] numbers, int target) {
		Arrays.sort(numbers);
		List<List<Integer>> ret = new ArrayList<>();
		dfs(ret, new ArrayList<Integer>(), numbers, 0, target);
		return ret;
	}
	
	private void dfs(List<List<Integer>> ret, ArrayList<Integer> condidate, int[] numbers, int curIndex,
			int target) {
	    // �Ժ���n���ͣ�ֻҪ��������ܽ��������4��Ϊ3����Ϊ5
		if (condidate.size() == 4) {
			int total = getSum(condidate);
			if (total == target) {
				ret.add(new ArrayList<>(condidate));
			}
			return;
		}
		if (curIndex > numbers.length - 1) {
			return;
		}
		for (int i = curIndex; i < numbers.length; i++) {
		    // �����һ�������֣�ֱ�Ӻ��ԣ���������ظ��Ĵ�
			if (i != curIndex && numbers[i] == numbers[i - 1]) {
				continue;
			}
			condidate.add(numbers[i]);
			// ����Ѿ�����target�����ҵ�ǰ���ִ���0����ѭ������ȥ�Ѿ�û�������ˣ���Ϊֻ�����ֱ��return
			if (getSum(condidate) > target && numbers[i] > 0) {
				if (!condidate.isEmpty()) {
					condidate.remove(condidate.size() - 1);
				}
				return;
			}
			dfs(ret, condidate, numbers, i + 1, target);
			if (!condidate.isEmpty()) {
				condidate.remove(condidate.size() - 1);
			}
		}
	}

	private int getSum(ArrayList<Integer> condidate) {
		int total = 0;
		for (Integer num : condidate) {
			total += num;
		}
		return total;
	}
	
	public static void main(String[] args) {
		int[] ar = {1,0,-1,-1,-1,-1,0,1,1,1,2};
		List<List<Integer>> list = new L57().fourSum(ar, 2);
		System.out.println(list.toString().toString());
		System.out.println(list.size());
	}
	
}
