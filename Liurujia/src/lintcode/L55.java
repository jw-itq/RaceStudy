package lintcode;

/*
 * 55. 比较字符串

比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母

样例

给出 A = "ABCD" B = "ACD"，返回 true

给出 A = "ABCD" B = "AABC"， 返回 false
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
