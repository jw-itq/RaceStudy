package unit3;

/*
 * ���ڴ�
 * �Լ����뷨������������һ��������С�ģ��������������Լ�
 */
public class Example3_4 {
	public static void main(String[] args) {
		String str = "abcabcabcabcc";
		int i = 0;
		for(;i<str.length();i++){
			String sl = str.substring(0,i+1);
			for(int j = 0;j<str.length()/sl.length();j++){
				sl+=sl;//�ظ��Լ������ھ����ظ���
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
