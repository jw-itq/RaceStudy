package unit5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
 * 团体队列
 * Sample Input
2
3 101 102 103
3 201 202 203
ENQUEUE 101
ENQUEUE 201
ENQUEUE 102
ENQUEUE 202
ENQUEUE 103
ENQUEUE 203
DEQUEUE
DEQUEUE
DEQUEUE
DEQUEUE
DEQUEUE
DEQUEUE
STOP
2
5 259001 259002 259003 259004 259005
6 260001 260002 260003 260004 260005 260006
ENQUEUE 259001
ENQUEUE 260001
ENQUEUE 259002
ENQUEUE 259003
ENQUEUE 259004
ENQUEUE 259005
DEQUEUE
DEQUEUE
ENQUEUE 260002
ENQUEUE 260003
DEQUEUE
DEQUEUE
DEQUEUE
DEQUEUE
STOP
0
Sample Output
Scenario #1
101
102
103
201
202
203
Scenario #2
259001
259002
259003
259004
259005
260001
 */
public class Five5_6 {
	static ArrayDeque<ArrayDeque<String>> queue = new ArrayDeque<ArrayDeque<String>>();
	static Map<String, Integer> map = new HashMap<String, Integer>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		int n = scan.nextInt();
		int bigCount = 0;
		while(n!=0){
			int cMap = 1;
			//装入map集合
			while(n--!=0){
				cMap++;
				int in = scan.nextInt();
				while(in--!=0){
					map.put(scan.next(), cMap);
				}
			}
			
	//		System.out.println(map.toString());
			String count = "";
			//接下来开始操作
			String str = scan.next();
			while(!str.equals("STOP")){
				switch (str) {
				case "ENQUEUE":
					String in = scan.next();
					inQueue(in);
	//				System.out.println(queue.toString().toString()+"gelaozi");
					break;
				case "DEQUEUE":
					if(queue.peek().peek()==null){
						queue.poll();
					}
	//				System.out.println(queue.peek().poll());
					count += queue.peek().poll()+"\n";
					break;
	
				default:
					break;
				}
				str = scan.next();
			}
//			System.out.println("Scenario #"+(++bigCount));
//			System.out.println(count);
			PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
			out.println("Scenario #"+(++bigCount));
			out.println(count);
			n = scan.nextInt();
		}
	}
	
	private static void inQueue(String in) {
		int value = map.get(in);
		Iterator<ArrayDeque<String>> iter = queue.iterator();
		boolean flag = false;
		while(iter.hasNext()&&!flag){
			ArrayDeque<String> qu = iter.next();
			Iterator<String> it = qu.iterator();
			while(it.hasNext()){
				if(map.get(it.next())==value){
					flag = true;
					qu.offer(in);
					break;
				}
			}
		}
		
		if(!flag){
			ArrayDeque<String> qu = new ArrayDeque<String>();
			qu.offer(in);
			queue.offer(qu);
		}
	}
	
	/*static Queue<Queue<String>> queue = new LinkedList<Queue<String>>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		int n = Integer.parseInt(scan.nextLine());
		while(n--!=0){
			Queue<String> que = new LinkedList<>();
			String[] str = scan.nextLine().split(" ");
			for(String i : str){
				que.add(i);
			}
			queue.add(que);
		}
		String count = "";
		String[] input = scan.nextLine().split(" ");
		System.out.println(input[0]+"((("+input.length);
		while(!input[0].equals("STOP")){
			switch (input[0]) {
			case "ENQUEUE":
				isQueue(input[1]);
				System.out.println("queueu--------");
				break;
			case "DEQUEUE":
				count += queue.element().element()==null?queue.poll():queue.element().poll()+"\n";
				System.out.println("delete-------");
				break;
			default:
//				System.out.println(count);
				break;
			}
			input = scan.nextLine().split(" ");
		}
			System.out.println(count);
	}

	private static boolean isQueue(String input) {
		List<Queue<String>> list = new ArrayList<Queue<String>>(queue);
		for(Queue<String> i : list){
			List<String> ls = new ArrayList<>(i);
			if(ls.contains(input)){
				i.add(input);
				return true;
			}
		}
		Queue<String> q = new LinkedList<>();
		q.add(input);
		queue.add(q);
		return false;
	}*/
}
