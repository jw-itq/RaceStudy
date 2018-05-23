package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class L46 {
	public int majorityNumber(List<Integer> nums) {
        // write your code here
		Collections.sort(nums);
		return nums.get(nums.size()/2);
    }
	
	public int majorityNumber1(int[] nums) {
        // write your code here
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer i : nums){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}else{
				map.put(i, 1);
			}
		}
		System.out.println(map.toString());
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
//		System.out.println(list.toString());
		return list.get(list.size()-1).getKey();
    }
	
	public static void main(String[] args) {
		int[] ar = {1,2,1,2,1,3,3};
		System.out.println(new L46().majorityNumber1(ar));
	}
}
