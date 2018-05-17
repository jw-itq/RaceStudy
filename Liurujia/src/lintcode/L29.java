package lintcode;

import java.util.Arrays;

/*
 * 29. �����ַ���

���������ַ���:s1��s2��s3���ж�s3�Ƿ���s1��s2���湹�ɡ�


����

���� s1 = "aabcc" s2 = "dbbca"

    - �� s3 = "aadbbcbcac"������  true.

    - �� s3 = "aadbbbaccc"�� ���� false.
 */
public class L29 {
	public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
		String temp = s3;
		for(int i = 0;i<s1.length()-1;i++){
			int l = temp.indexOf(s1.charAt(i));
			int r = temp.indexOf(s1.charAt(i+1));
			if(l==-1||r==-1){
				return false;
			}
			if(l>r){
				return false;
			}
			temp = temp.substring(r,temp.length());
		}
		temp = s3;
		for(int i = 0;i<s2.length()-1;i++){
			int l = temp.indexOf(s2.charAt(i));
			int r = temp.indexOf(s2.charAt(i+1));
			if(l==-1||r==-1){
				return false;
			}
			if(l>r){
				return false;
			}
			temp = temp.substring(r,temp.length());
		}
		char[] a = (s1+s2).toCharArray();
		char[] b = s3.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.toString(a).equals(Arrays.toString(b));
    }
	
	public static void main(String[] args) {
		String s1 = "abbcddef";
		String s2 = "accbbbcd";
		System.out.println(new L29().isInterleave(s1, s2, "abbcddefaccbbbdc"));
	}
}
