package lintcode;

/*
 * 统计数字
 */
public class L3 {
	public int digitCounts(int k, int n) {
        // write your code here
		if(k == n){
			return 1;
		}
		String k1 = k+"";//装换成字符串
		String n1 = "";
		int count = 0;//计数
		int b = k1.length();//步数
		for(int i = 0;i<=n;i++){//将0-n之间的数装换成字符串
			n1 = i+"";
			for(int j = 0;j+b<=n1.length();j++){//每转换成一个就判断它是否含有k
				if(n1.substring(j,j+b).equals(k1)){
					count++;
				}
			}
		}
//		System.out.println(count);
		return count;
    }
	
	public static void main(String[] args) {
		new L3().digitCounts(9, 9999);
		
	}
}
