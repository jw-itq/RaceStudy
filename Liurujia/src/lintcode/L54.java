package lintcode;

import java.util.Arrays;

/*
 * 将一个字符串转换成一个整数
 * 这题本来很简单，但是难点就在于需要考虑的地方特别多，所以说做这种题应该要沉下心来仔细考虑，应该把各种极端情况考虑到
 */
public class L54 {
	public int atoi(String str) {
        // write your code here
		if(str.length()==0||str == null){
            return 0;
        }
        String a = "-2147483649";
		String b = Integer.MAX_VALUE+"";
		if(str.equals(a)){
			return Integer.MIN_VALUE;
		}
		if(str.equals(b)){
			return Integer.MAX_VALUE;
		}
		int ls = 0;
		str = str.replaceAll(" ", "");
		try{
		    /*if(str.contains("+")){
				str = str.replace("+", "");
			}*/
			if(str.contains(".")){
				String[] s = str.split("\\.");
				ls = Integer.parseInt(s[0]);
			}else{
				ls = Integer.parseInt(str);
			}
		}catch(NumberFormatException e){
			char[] ch = str.toCharArray();
			String s = "";
			boolean bl = false;
			for(int i = 0;i<ch.length;i++){
				if(Character.isLetter(ch[i])){
					bl = true;
				}else if((ch[0]=='-'||Character.isDigit(ch[i])||(ch[0]=='+'&&Character.isDigit(ch[1])))&&!bl){
					s += ch[i];
				}else{
					bl = true;
				}
			}
			if((str.charAt(0)=='+'||str.charAt(0)=='-'||Character.isDigit(str.charAt(0)))&&s.length()!=0&&s.length()<10){
				return Integer.parseInt(s);
			}else if(bl){
				return 0;
			}
			if(str.charAt(0)=='-'){
				return Integer.MIN_VALUE;
			}else{
				return Integer.MAX_VALUE;
			}
		}
		return ls;
    }
	
	public static void main(String[] args) {
		System.out.println(new L54().atoi(" -00000012d121212121212121"));
	}
}
