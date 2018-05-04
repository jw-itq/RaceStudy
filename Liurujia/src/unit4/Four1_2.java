package unit4;

/*
 * 素数判定
 */
public class Four1_2 {
	/**
	 * 
	 * 素数是只能被1和本身整除的数，比如2，3，5，，
	 * @param n 需要判定是否是素手的数字
	 * @param i 从2开始累加判断
	 * @return 如果是素数就返回true，否则返回false
	 */
	private static boolean s(int n,int i){
		if(n==i){
			return true;
		}
		if(n%i==0){
			return false;
		}
		return s(n,i+1);
	}
	public static void main(String[] args) {
		int n = 21;
		if(n==2){
			System.out.println("true");
		}else{
			System.out.println(s(n,2));
		}
	}
}
