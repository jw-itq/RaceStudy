package unit5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/*
 * 集合栈计算机
（输入：先输入测试次数，再输入操作次数，再输入具体操作）
Sample Input
9
PUSH
DUP
ADD
PUSH
ADD
DUP
ADD
DUP
UNION
Sample Output
0
0
1
0
1
1
2
2
2

用0代表空集，1代表一个集合，2代表2个集合，，，，
将数字依次入栈，跟出栈
 */
public class Five5_5 {
	static Stack<Integer> sk = new Stack<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String count = "";
		while(n--!=0){
			String str = scan.next();
			Set<Integer> set = new HashSet<>();
			switch (str) {
			case "PUSH":
				sk.push(0);
//				System.out.println("count:"+sk.peek());
				count+=sk.peek();
				break;
			case "DUP":
				int c = sk.peek();
				sk.push(c);
//				System.out.println("count:"+sk.peek());
				count+=sk.peek();
				break;
			case "UNION":
				int a = sk.pop();
				int b = sk.pop();
				sk.push(a>=b?a:b);
//				System.out.println("count:"+sk.peek());
				count+=sk.peek();
				break;
			case "INTERSECT":
				a = sk.pop();
				b = sk.pop();
				sk.push(a>=b?b:a);
//				System.out.println("count:"+sk.peek());
				count+=sk.peek();
				break;
			case "ADD":
				a = sk.pop();
				b = sk.pop();
				set.add(a);
				set.add(b);
				int ac = a<b?b:a;
				sk.push(a==0||b==0?a==b?set.size():ac:a+b);
//				System.out.println("count:"+sk.peek());
				count+=sk.peek();
				break;
			default:
				break;
			}
		}
		for(int i = 0;i<count.length();i++){
			System.out.println(count.charAt(i));
		}
	}
}
