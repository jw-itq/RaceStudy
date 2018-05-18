package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * ×îÐ¡¸²¸Ç×Ó´®
 */
public class L32 {
	/*public String minWindow(String source , String target) {
        // write your code here
    }*/
	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		List<String> list = new ArrayList<>();
		for(int i = 0;i<s.length();i++){
			list.add(s.charAt(i)+"");
		}
		System.out.println(list.toString());
		System.out.println(list.indexOf("A"));
		list.set(0, "0");
		System.out.println(list.indexOf("A"));
	}
}
