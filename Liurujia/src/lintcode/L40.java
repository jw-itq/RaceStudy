package lintcode;

import java.util.Iterator;
import java.util.Stack;

/*
 *用栈实现队列
 *只有专注的时候思考问题，才能有解，否则都是浪费时间
 */
public class L40 {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	public L40() {
        // do intialization if necessary
		stack1 = new Stack<>();
		stack2 = new Stack<>();
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
    	stack1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	int t = stack2.pop();
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	return t;
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
    	return stack1.iterator().next();
    }
    
    public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		Iterator<Integer> iter = stack.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
