package leetcode;

/*
 * 编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:

所有输入只包含小写字母 a-z 。

思路：
	我感觉这个蛮简单，直接的思路就是遍历这个字符串数组，
	然后依次，按次序从头比较到尾，然后遇到不匹配的，那就结束并返回空，或者遇到比字符串大的情况，那就直接返回
	如果第一个就是空的话，或者干脆说其中有为空的话，那我就应该直接返回空，所以在循环里面应该列举所有情况
	
总结：其实问题并不难，但就是考虑的情况需要周全，还有就是字符串比较最好是用equals，考虑的还是不周全，思路不清晰。
 */
public class L14 {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length==0||strs[0].equals("")||strs[0]==null){
    		return "";
    	}
    	if(strs.length==1){
    		return strs[0];
    	}
        int number = 0;
        while(true){
        	for(int i = 1;i<strs.length;i++){
        		if(strs[i].equals("")||strs[i]==null){
        			return "";
        		}
        		if(strs[0].length()-1<number||strs[i].length()-1<number){
        			return strs[0].substring(0,number);
        		}
        		if(strs[0].charAt(number)!=strs[i].charAt(number)){
        			if(number==0){
        				return "";
        			}else{
        				return strs[0].substring(0,number);
        			}
        		}
        	}
        	number++;
        }
    }
    
    public static void main(String[] args) {
    	String[] str = {""};
    	System.out.println(str.length+"---"+str[0]);
		System.out.println(new L14().longestCommonPrefix(str));
	}
}
