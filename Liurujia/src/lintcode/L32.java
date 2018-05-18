package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * ×îÐ¡¸²¸Ç×Ó´®
 */
public class L32 {
	public String minWindow(String source , String target) {
        // write your code here
		String one = target.charAt(0)+"";
		List<String> list = new ArrayList<>();
		for(int i = 0;i<source.length();i++){
			list.add(source.charAt(i)+"");
		}
		int min = 0;
		for(int i = 0;i<list.size();i++){
			int n = list.indexOf(one);
			int l = n;
			int r = n;
			while(l>=0&&r<=source.length()){
				String sub = source.substring(l,r);
				if(sub.length()>=target.length()&&fu(sub,target)&&(min==0||min>sub.length())){
					min = sub.length();
				}
			}
		}
    }
	private boolean fu(String sub, String target) {
		
		return false;
	}
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
