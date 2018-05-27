package lintcode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * 59. 最接近的三数之和

给一个包含 n 个整数的数组 S, 找到和与给定整数 target 最接近的三元组，返回这三个数的和。

样例

例如 S = [-1, 2, 1, -4] and target = 1. 和最接近 1 的三元组是 -1 + 2 + 1 = 2.
 */
public class L59 {
	public int threeSumClosest(int[] numbers, int target) {
        // write your code here
		int sum= 0;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		});
		for(int i = 0;i<numbers.length;i++){
			int m = Math.abs(numbers[i]);
			if(map.containsKey(m)){
				map.put(m, map.get(m)+numbers[i]);
			}else{
				map.put(m, numbers[i]);
			}
		}
//		System.out.println(map.toString());
		Set<Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Entry<Integer, Integer>> iter = set.iterator();
		int flag = 0;
		if(iter.hasNext()){
			flag = iter.next().getKey();
		}
		while(iter.hasNext()){
			int b = iter.next().getKey();
			if(Math.abs((target-flag))<Math.abs(target-b)){
				break;
			}
			flag = b;
		}
		Iterator<Entry<Integer, Integer>> iter1 = set.iterator();
		int i = 0;
		while(iter1.hasNext()){
			int b = iter.next().getKey();
			if(b==flag){
				sum += map.get(b);
			}
		}
		return 0;
    }
	
	public static void main(String[] args) {
		int[] arr = {-1, 2, 1, -4};
		int target = 1;
		System.out.println(new L59().threeSumClosest(arr, target));
	}
}
