package unit3;

/*
 * 猜数字游戏的提示
 * 永远不要怀疑书本，一定要首先怀疑自己
 * 这题是我自己的想法，书上的思路我还没有看
 */
public class Three_3_3_4 {
	public static void main(String[] args) {
		int n = 4;
		String sre = "1355";
		String[] sb = {"1123","4335","6551","6135","1355","0000"};
		int countA = 0;
		int countB = 0;
		for(int t = 0;t<sb.length;t++){
			StringBuffer s = new StringBuffer(sre);
			StringBuffer sbf = new StringBuffer(sb[t]);
			if(Integer.parseInt(sb[t])==0)break;
			//写有多少个数字位置相同
			for(int i = 0;i<n;i++){//比较的次数
				if(s.charAt(i)==sbf.charAt(i)){
					countA++;
					s.setCharAt(i,'n');
					sbf.setCharAt(i, 'n');
				}
			}
			//写有多少个数字在两个数列中都出现但是位置不同
			for(int i = 0;i<n;i++){//比较的次数
				for(int j = 0;j<n;j++){
					if(s.charAt(i)==sbf.charAt(j)&&s.charAt(i)!='n'){
						countB++;
					}
				}
			}
			System.out.println("("+countA+","+countB+")");
			countA = 0;
			countB = 0;
		}
	}
}
