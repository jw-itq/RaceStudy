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
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();
		//Arrays.sort(numbers);
		dfs(set,new ArrayList<Integer>(),numbers,0,target);
		list.addAll(set);
		return list;
    }
	private void dfs(Set<List<Integer>> set, ArrayList<Integer> ls,
			int[] numbers, int t, int target) {
		if(ls.size()==4){
			if(getAdd(ls)==target){
				Collections.sort(ls);
				set.add(new ArrayList<>(ls));
			}
			return;
		}
		if(t>numbers.length-1){
			return;
		}
		for(int i = t;i<numbers.length;i++){
			if(i!=t&&numbers[i]==numbers[i-1]){
				continue;
			}
			if(numbers[i]!=Integer.MIN_VALUE){
				int save = numbers[i];
				ls.add(numbers[i]);
				if(getAdd(ls)>target&&numbers[i]>0){
					if(!ls.isEmpty()){
						ls.remove(ls.size()-1);
					}
					return;
				}
				numbers[i] = Integer.MIN_VALUE;
				dfs(set,ls,numbers,t+1,target);
				numbers[i] = save;
				if(!ls.isEmpty()){
					ls.remove(ls.size()-1);
				}
			}
		}
	}
	private int getAdd(ArrayList<Integer> ls) {
		int sum = 0;
		for(Integer i : ls){
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] ar = {-2,-3,5,-1,-4,5,-11,7,1,2,3,4,-7,-1,-2,-3,-4,-5};
		List<List<Integer>> list = new L57().fourSum(ar, 2);
		System.out.println(list.toString().toString());
		System.out.println(list.size());
	}
	
}
