package lintcode;

/*
 * 55. �Ƚ��ַ���

�Ƚ������ַ���A��B��ȷ��A���Ƿ����B�����е��ַ����ַ���A��B�е��ַ����� ��д��ĸ

����

���� A = "ABCD" B = "ACD"������ true

���� A = "ABCD" B = "AABC"�� ���� false
 */
public class L55 {
	public boolean compareStrings(String A, String B) {
        // write your code here
		StringBuffer sb = new StringBuffer(A);
		for(int i = 0;i<B.length();i++){
			int index = sb.indexOf(B.charAt(i)+"");
			if(index==-1){
				return false;
			}else{
				sb.replace(index, index+1, "#");
			}
		}
		return true;
    }
	public static void main(String[] args) {
		System.out.println(new L55().compareStrings("ABC", "ABCC"));
	}
}
