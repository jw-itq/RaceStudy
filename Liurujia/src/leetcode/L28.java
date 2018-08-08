package leetcode;
/*
 * 实现 strStr() 函数。

给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:

输入: haystack = "hello", needle = "ll"
输出: 2
示例 2:

输入: haystack = "aaaaa", needle = "bba"
输出: -1
说明:

当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

思路：
	遍历第一个字符串，然后找与第二个字符串的第一个字符相等的那个字符的位置，从这个位置开始依次比较
 */
public class L28 {
    public int strStr(String haystack, String needle) {
    	if(needle.length()==0||needle==null){
    		return 0;
    	}
    	if(haystack.length()==0||haystack==null||haystack.length()<needle.length()){
    		return -1;
    	}
        for(int i = 0;i<haystack.length();i++){
        	if(haystack.charAt(i)==needle.charAt(0)){
        		if((i+needle.length())>haystack.length()){
        			return -1;
        		}else for(int j = i,t = 0;j<haystack.length()&&t<needle.length();j++,t++){
        			if(haystack.charAt(j)!=needle.charAt(t)){
        				break;
        			}
        			if(t+1==needle.length()){
        				return i;
        			}
        		}
        	}
        }
        return -1;
    }
    
    public static void main(String[] args) {
		System.out.println(new L28().strStr("abcdeacc", "acc"));
	}
}
