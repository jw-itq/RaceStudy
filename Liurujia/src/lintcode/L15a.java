package lintcode;

import java.util.ArrayList;
import java.util.List;


public class L15a {
	static int[] ar = {1,2,3};
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(ar[0]);
		list.add(ls);
//		System.out.println(list.toString()+"**");
		int i = 1;
		while(i<ar.length){
			List<List<Integer>> lt = new ArrayList<List<Integer>>();
			for(int j = 0;j<list.size();j++){
				List<Integer> ln = list.get(j);
				for(int k = 0;k<=list.get(j).size();k++){
					ln.add(k,ar[i]);
					lt.add(new ArrayList<Integer>(ln));
					ln.remove(k);
				}
			}
			list.clear();
			list.addAll(lt);
			i++;
		}
		System.out.println(list.toString());
	}
}
