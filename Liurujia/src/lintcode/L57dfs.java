package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * nÊıÖ®ºÍ
 */
public class L57dfs {
	
	public List<List<Integer>> fourSum(int[] numbers, int target) {
        // write your code here
		Arrays.sort(numbers);
		List<List<Integer>> list = new ArrayList<>();
		dfs(list,new ArrayList<Integer>(),numbers,0,target);
		return list;
    }
	
	private void dfs(List<List<Integer>> list, ArrayList<Integer> ls,
			int[] numbers, int t, int target) {
		if(ls.size()==4){
			if(getAdd(ls)==target){
				list.add(new ArrayList<>(ls));
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
			ls.add(numbers[i]);
			if(getAdd(ls)>target&&numbers[i]>0){
				if(!ls.isEmpty()){
					ls.remove(ls.size()-1);
				}
				return;
			}
			System.out.println(ls);
			dfs(list,ls,numbers,i+1,target);
			if(!ls.isEmpty()){
				ls.remove(ls.size()-1);
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
		int[] ar = {1,0,-1,-1,-1,-1,0,1,1,1,2};
		List<List<Integer>> list = new L57dfs().fourSum(ar, 2);
		System.out.println(list.size());
	}
}
