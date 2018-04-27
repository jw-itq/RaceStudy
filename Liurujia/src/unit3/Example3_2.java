package unit3;

/*
 * ������
 * C6H5OH=C*6+H*5+O+H
 * ��Ϊ�����Ŀ��˵����ֻ���ĸ����ӣ���ô�ҵ��뷨��������switch����
 * ����Ŀ˼�룬���ԣ�Ӧ����˼·��������Ҫ�ģ�ϸ��ҲҪ�ں�
 */
public class Example3_2 {
	public static void main(String[] args) {
		String str = "C6H5OH";
		double sum = 0;
		for(int i = 0;i<str.length()-1;i++){
			double step = 0;
			switch (str.charAt(i)) {
			case 'C':
				step = 12.01;
				break;
			case 'H':
				step = 1.008;
				break;
			case 'O':
				step = 16.00;
				break;
			case 'N':
				step = 14.01;
				break;
			default:
				System.out.println("error");
				break;
			}
			if(Character.isDigit(str.charAt(i+1))){
				i++;
				sum+=step*Integer.parseInt(str.charAt(i)+"");
			}else{
				sum+=step;
			}
		}
		System.out.println(sum);
	}
}
