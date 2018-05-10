package unit5;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;


/*
 * 丑数
 * 优先队列，否则好像就超时了
 */
public class Five5_7 {
	static int[] number = {2,3,5};
	public static void main(String[] args) {
		PriorityQueue<Long> pq = new PriorityQueue<>();
		Set<Long> set = new HashSet<>();
		pq.offer((long)1);
		set.add((long)1);
		for(int i = 1;;i++){
			long x = pq.poll();//每次取优先队列里面最小的
			if(i == 1500){
				System.out.println("The 1500'th ugly number is "+x+".");
				break;
			}
			for(int j = 0;j<3;j++){
				long n = x*number[j];
				if(!set.contains(n)){
					pq.offer(n);
					set.add(n);
				}
			}
		}
	}
}
