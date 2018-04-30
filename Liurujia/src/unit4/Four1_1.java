package unit4;


/*
 * 计算组合数
 * 
 */
public class Four1_1 {
	/**
	 * 
	 * @param n 需要计算的阶乘数字
	 * @param s 从什么地方开始计算，不一定是从1开始计算
	 * @param t 表示递归停止的位置
	 * @return 返回阶乘的结果，s
	 */
	private static long j(long n,long s,long t){
		if(n==t){
			return s;
		}
		return j(n-1,s*=n,t);
	}
	public static void main(String[] args) {
		long n = 21;
		long m = 1;
		long t = n-m;
		System.out.println(j(n,t+1,t+1)/(j(m,1,1)));
	}
}
