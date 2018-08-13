package leetcode;
/*
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。

示例 1:

输入: a = "11", b = "1"
输出: "100"
示例 2:

输入: a = "1010", b = "1011"
输出: "10101"

思路：
	将它转换成十进制，然后相加之后将结果再转成2进制，考虑下位数，如果二进制的位数太多，
	表示不了10进制，有没有可能。。所以为了避免这种情况的发生，我应该采取下面这种老办法
	那就是依次相加
	1，相加规则：1+0=1，1+1=0**进1（也就是两个数相加大于1的做法），0+0=0
	2,如果两个字符串长度一样，
		那我变可以直接使用循环来做这个题，最后组合最后那个余数
	3，如果两个字符串的长度不一样长呢，那我应该把它拆成两部分，一个是与短字符串长度一样的
		部分，一个是前半部分，错错错！所以要实践嘛，如果我不实践，是不会知道如果长度不一样
		那就把短的那个字符串前面全都补0补起就好了
 */
public class L67 {
    public String addBinary(String a, String b) {
        if(a.length()==0||b.length()==0||a==null||b==null){
        	return "";
        }
        if(a.length()!=b.length()){
        	String cop = "";
        	if(a.length()>b.length()){
        		for(int i = 0;i<a.length()-b.length();i++){
        			cop+="0";
        		}
        		cop += b;
        		b = cop;
        	}else{
        		for(int i = 0;i<b.length()-a.length();i++){
        			cop += "0";
        		}
        		cop += a;
        		a = cop;
        	}
        }
        
        String s = "";
        int num = 0;
        if(a.length()==b.length()){
        	for(int i = a.length()-1;i>=0;i--){
        		int sum = Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(i)+"")+num;
        		if(sum==2){
        			s += 0;
        			num = 1;
        		}else if(sum==3){
        			s += 1;
        			num = 1;
        		}else{
        			s += sum;
        			num = 0;
        		}
        	}
        }
        if(num!=0){
        	s += num;
        }
        StringBuffer st = new StringBuffer(s);
        return st.reverse()+"";
    }
    public static void main(String[] args) {
		System.out.println(new L67().addBinary("1101", "11"));
	}
}
