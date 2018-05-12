package lintcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/*
 * ³óÊý
 */
public class L4 {
	PriorityQueue<Long> pque = new PriorityQueue<>();
	Set<Long> set = new HashSet<>();
	int[] number = {2,3,5};
	public int nthUglyNumber(int n) {
        // write your code here
		pque.offer((long)1);
		set.add((long)1);
		for(int i = 1;;i++){
			long x = pque.poll();
			if(i == n){
				return (int)x;
			}
			for(int j = 0;j<3;j++){
				long x1 = x * number[j];
				if(!set.contains(x1)){
					pque.offer(x1);
					set.add(x1);
				}
			}
		}
    }
	
	public static void main(String[] args) {
		System.out.println(new L4().nthUglyNumber(1500));
	}
}
