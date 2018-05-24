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

����һ���������飬�ҳ���Ԫ�أ����������еĳ��ִ����ϸ��������Ԫ�ظ����Ķ���֮һ��
	 */
	public int majorityNumber(List<Integer> nums) {
        // write your code here
		Collections.sort(nums);
		return nums.get(nums.size()/2);
    }
	/*
	 * 48. ��Ԫ�� III

����һ���������飬�ҵ���Ԫ�أ����������еĳ��ִ����ϸ��������Ԫ�ظ�����1/k��
47. Majority Element II

����һ���������飬�ҵ���Ԫ�أ����������еĳ��ִ����ϸ��������Ԫ�ظ���������֮һ��
û�뵽�ҵ����ַ�ʽ��Ŀ���Ү���ҵ����ţ��ҵ��뷨������˵���ҵ�������ֻҪ����1/x�ģ��ǾͿ϶������������Ǹ�
����map���ϾͿ��԰����������ظ���Ԫ�ظ���ȫ��ͳ�Ƴ�����Ȼ��������������뿴�����ҵ��������
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
		//��������Ϊ��Ҫ����map���ϵ�ֵ������������������Ҫ��map���ϵ�ת����list���ϣ������������Ĳ�����entry
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		//��������������һ������Ҫ����ļ������֣��ڶ������������������һ��comparator�ӿ��࣬ʵ������ӿڣ����ͻᰴ��
		//����ӿ������������
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
