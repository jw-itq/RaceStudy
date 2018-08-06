package leetcode;

import java.util.Stack;

/*
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true

思路：
	通过观察实例，发现，我可以利用栈来做这个题，这就好像是连连看一样，就是每次往栈里面放数据的时候
	首先检查栈中是否还有数据，如果没有就直接放进去，如果有，那就跟栈顶的那个相组合产生一个字符串跟(),[],{}
	他们相比较，如果有一样的，那就弹出栈顶，并且进行下一个数据的放置，知道字符串数据放完，若此时栈
	也为空，那就返回true，否则那就是false
 */
public class L20 {
    public boolean isValid(String s) {
        if(s.length()==0||s==null){
        	return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
        	if(stack.empty()){
        		stack.push(s.charAt(i));
        	}else{
        		char ch = stack.peek();
        		String str = ch+""+s.charAt(i);
        		if(str.equals("()")||str.equals("[]")||str.equals("{}")){
        			stack.pop();
        			continue;
        		}else{
        			stack.push(s.charAt(i));
        		}
        	}
        }
        if(stack.empty()){
        	return true;
        }else{
        	return false;
        }
    }
    
    public static void main(String[] args) {
		System.out.println(new L20().isValid("((({})))"));
	}
}
