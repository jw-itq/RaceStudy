package leetcode;

/*
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 被读作  "one 1"  ("一个一") , 即 11。
11 被读作 "two 1s" ("两个一"）, 即 21。
21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

给定一个正整数 n ，输出报数序列的第 n 项。

注意：整数顺序将表示为一个字符串。

示例 1:

输入: 1
输出: "1"
示例 2:

输入: 4
输出: "1211"

思路：
1.     1
2.     11
3.     21
4.     1211
5.     111221

	题目意思我明白了，那么该怎么做呢，这个里面的下一个数字字符串，需要两个东西，一个是当前数字的个数+当前的数字
	当前的数字好解决，那该如何确定当前数字的个数呢？循环遍历这个数组，来判断数字的个数
 */
public class L38 {
    public String countAndSay(int n) {
        if(n<=0){
        	return null;
        }
        if(n==1){
        	return "1";
        }
        String str = "11A";
        for(int i = 1;i<n-1;i++){
        	//循环str,来决定下一个是多少
        	String sr = "";
        	int num = 0;
        	for(int j = 0;j<str.length()-1;j++){
        		if(str.charAt(j)==str.charAt(j+1)){
        			num++;
        		}else{
        			num++;
        			sr+=num+""+str.charAt(j);
        			num = 0;
        		}
        	}
        	str = sr+"A";//我加个A，哈哈哈
        }
        return str.substring(0,str.length()-1);
    }
    
    public static void main(String[] args) {
		for(int i = 1;i<30;i++){
			System.out.println(new L38().countAndSay(i));
		}
	}
}
