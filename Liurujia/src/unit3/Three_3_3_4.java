package unit3;

/*
 * ��������Ϸ����ʾ
 * ��Զ��Ҫ�����鱾��һ��Ҫ���Ȼ����Լ�
 * ���������Լ����뷨�����ϵ�˼·�һ�û�п�
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
			//д�ж��ٸ�����λ����ͬ
			for(int i = 0;i<n;i++){//�ȽϵĴ���
				if(s.charAt(i)==sbf.charAt(i)){
					countA++;
					s.setCharAt(i,'n');
					sbf.setCharAt(i, 'n');
				}
			}
			//д�ж��ٸ����������������ж����ֵ���λ�ò�ͬ
			for(int i = 0;i<n;i++){//�ȽϵĴ���
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
