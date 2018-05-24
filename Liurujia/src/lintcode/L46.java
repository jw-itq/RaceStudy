package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class L46 {
	/*
	 * 46. Majority Element

给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
	 */
	public int majorityNumber(List<Integer> nums) {
        // write your code here
		Collections.sort(nums);
		return nums.get(nums.size()/2);
    }
	/*
	 * 48. 主元素 III

给定一个整型数组，找到主元素，它在数组中的出现次数严格大于数组元素个数的1/k。
47. Majority Element II

给定一个整型数组，找到主元素，它在数组中的出现次数严格大于数组元素个数的三分之一。
没想到我的这种方式真的可以耶，我的天呐，我的想法，或者说是我的理解就是只要大于1/x的，那就肯定是数组最多的那个
我用map集合就可以把数组里面重复的元素个数全部统计出来，然后就是排序，排序请看下面我的排序分析
	 */
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
//		System.out.println(map.toString());
		//我这里因为需要按照map集合的值进行排序，所以首先我要将map集合的转化成list集合，这个集合里面的参数是entry
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		//有两个参数，第一个是需要排序的集合名字，第二个是排序的条件，是一个comparator接口类，实现这个接口，最后就会按照
		//这个接口里面进行排序
		Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>() {

			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		/*Comparator<Map.Entry<Integer, Integer>> com = new one();
		Collections.sort(list,com);*/
//		System.out.println(list.toString());
		return list.get(list.size()-1).getKey();
    }
	
	public static void main(String[] args) {
		int[] ar = {1,2,1,2,1,3,3};
		System.out.println(new L46().majorityNumber1(ar));
	}
}
/*class one implements Comparator<Map.Entry<Integer, Integer>>{

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		
		return o1.getValue().compareTo(o2.getValue());
	}
	
}*/
