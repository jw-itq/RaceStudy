package unit3;

/*
 * 周期串
 * 自己的想法，首先碰到的一定就是最小的，碰不到，就是自己
 */
public class Example3_4 {
	public static void main(String[] args) {
		String str = "abcabcabcabcc";
		int i = 0;
		for(;i<str.length();i++){
			String sl = str.substring(0,i+1);
			for(int j = 0;j<str.length()/sl.length();j++){
				sl+=sl;//重复自己，周期就是重复嘛
			}
			if(sl.equals(str)){
				System.out.println(str.substring(0,i+1));
				break;
			}
		}
		if(i==str.length()){
			System.out.println(str);
		}
	}
}
