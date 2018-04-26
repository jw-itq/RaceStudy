package unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 环装序列
 * 我的思路是利用stringbuffer可变字符串的特点逐渐追加
 * 然后利用集合里面的排序得到字典排序最小的那个
 */
public class Three_3_3_6 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("CTCC");
		int n = str.length();
		List<String> array = new ArrayList<String>();
		for(int i = 0;i<n;i++){
//			System.out.println(str.substring(i,str.length()));
			array.add(str.substring(i,str.length()));
			str.append(str.charAt(i));
		}
//		Arrays.sort(result);
		Collections.sort(array);
		System.out.println(array.get(0));
	}
}
