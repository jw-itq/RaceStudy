package lintcode;

import java.util.Arrays;

/*
 * ×îÐ¡¸²¸Ç×Ó´®
 */
public class L32 {
	/*public String minWindow(String source , String target) {
        // write your code here
		String one = target.charAt(0)+"";
		List<String> list = new ArrayList<>();
		for(int i = 0;i<source.length();i++){
			list.add(source.charAt(i)+"");
		}
		int min = 0;
		String result = "";
		for(int i = 0;i<list.size();i++){
			int n = list.indexOf(one);
			if(n==-1){
				break;
			}
			int l = n;
			int r = n;
			while(l>=0){
				String sub = source.substring(l,n);
				if(sub.length()>=target.length()&&fu(sub,target)&&(min==0||min>sub.length())){
					min = sub.length();
					result = source.substring(l,n);
				}
				l--;
			}
			while(r<=source.length()){
				String sub = source.substring(n,r);
				if(sub.length()>=target.length()&&fu(sub,target)&&(min==0||min>sub.length())){
					min = sub.length();
					result = source.substring(n,r);
				}
				r++;
			}
			System.out.println(list.toString());
			list.set(n, "0");
		}
		return result;
    }
	private boolean fu(String sub, String target) {
		char[] a = sub.toCharArray();
		char[] b = target.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0;
		while(i<b.length&&a[i]==b[i]) i++;
		return i==b.length?true:false;
	}*/
	
	public String minWindow(String source , String target) {
		int n = target.length();
		String result = "";
		int count = 0;
		for(int k = n;k<=source.length();k++){
			for(int i = 0;i<=source.length()-k;i++){
				String s = source.substring(i,i+k);
//				System.out.println(s);
				if(fu(s,target)&&(count==0||count>s.length())){
					count = s.length();
					result = s;
				}
			}
		}
		return result;
	}
	private boolean fu(String sub, String target) {
		char[] a = sub.toCharArray();
		char[] b = target.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0;
		int j = 0;
		while(i<a.length&&j<b.length) {
			if(a[i]==b[j]){
				i++;
				j++;
			}else{
				i++;
			}
		}
		return j==b.length?true:false;
	}
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(new L32().minWindow(s, "ac"));
	}
}
