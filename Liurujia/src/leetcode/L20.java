package leetcode;

import java.util.Stack;

/*
 * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��

��Ч�ַ��������㣺

�����ű�������ͬ���͵������űպϡ�
�����ű�������ȷ��˳��պϡ�
ע����ַ����ɱ���Ϊ����Ч�ַ�����

ʾ�� 1:

����: "()"
���: true
ʾ�� 2:

����: "()[]{}"
���: true
ʾ�� 3:

����: "(]"
���: false
ʾ�� 4:

����: "([)]"
���: false
ʾ�� 5:

����: "{[]}"
���: true

˼·��
	ͨ���۲�ʵ�������֣��ҿ�������ջ��������⣬��ͺ�����������һ��������ÿ����ջ��������ݵ�ʱ��
	���ȼ��ջ���Ƿ������ݣ����û�о�ֱ�ӷŽ�ȥ������У��Ǿ͸�ջ�����Ǹ�����ϲ���һ���ַ�����(),[],{}
	������Ƚϣ������һ���ģ��Ǿ͵���ջ�������ҽ�����һ�����ݵķ��ã�֪���ַ������ݷ��꣬����ʱջ
	ҲΪ�գ��Ǿͷ���true�������Ǿ���false
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
