package unit3;

/*
 * 生成元
 * x加上x的各个数字之和等于y
 * 我的思路很简单，不断的穷举，最先找到的一定就是最小的生成元
 */
public class Three_3_3_5 {
	public static void main(String[] args) {
		int n = 216;//找到它的最小生成元
		int yes = 0;
		for(int i = 0;i<n;i++){
			String s = String.valueOf(i);
			int sum = 0;
			for(int j = 0;j<s.length();j++){
				sum +=Integer.parseInt(s.charAt(j)+"");
			}
			if((i+sum)==n){//等于就是找到了
//				System.out.println(i+"*******"+sum);
				yes = i;
				break;
			}
		}
		System.out.println(yes);
	}
}
