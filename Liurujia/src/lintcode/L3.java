package lintcode;

/*
 * ͳ������
 */
public class L3 {
	public int digitCounts(int k, int n) {
        // write your code here
		if(k == n){
			return 1;
		}
		String k1 = k+"";//װ�����ַ���
		String n1 = "";
		int count = 0;//����
		int b = k1.length();//����
		for(int i = 0;i<=n;i++){//��0-n֮�����װ�����ַ���
			n1 = i+"";
			for(int j = 0;j+b<=n1.length();j++){//ÿת����һ�����ж����Ƿ���k
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
