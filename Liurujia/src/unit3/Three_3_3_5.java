package unit3;

/*
 * ����Ԫ
 * x����x�ĸ�������֮�͵���y
 * �ҵ�˼·�ܼ򵥣����ϵ���٣������ҵ���һ��������С������Ԫ
 */
public class Three_3_3_5 {
	public static void main(String[] args) {
		int n = 216;//�ҵ�������С����Ԫ
		int yes = 0;
		for(int i = 0;i<n;i++){
			String s = String.valueOf(i);
			int sum = 0;
			for(int j = 0;j<s.length();j++){
				sum +=Integer.parseInt(s.charAt(j)+"");
			}
			if((i+sum)==n){//���ھ����ҵ���
//				System.out.println(i+"*******"+sum);
				yes = i;
				break;
			}
		}
		System.out.println(yes);
	}
}
