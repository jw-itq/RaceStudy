package unit5;

/*<<<<<<< HEAD
import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
=======*/
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
//>>>>>>> c59d77b7d94ab245056db4a713f8a9cc67657443


/*
 * 丑数
 * 优先队列，否则好像就超时了
 */
public class Five5_7 {
	static int[] number = {2,3,5};
	public static void main(String[] args) {
/*<<<<<<< HEAD
		int count = 5;
		List<Integer> list = new ArrayList<Integer>();
		int n = 6;
		while(true){
			if(n%2==0||n%3==0||n%5==0){
				boolean flag = true;
				for(Integer i : list){
					if(n%i==0){
						flag = false;
						break;
					}
//					System.out.println(i);
				}
				if(flag){
					count++;
					System.out.println(n+"choushu");
				}
			}else{
				list.add(n);
			}
			PrintStream out = new PrintStream(new BufferedOutputStream(System.out));
			out.println(count+"-----");
			System.out.println(count+"----");
			if(count == 1500){
				System.out.println(n+"***");
=======*/
		PriorityQueue<Long> pq = new PriorityQueue<>();
		Set<Long> set = new HashSet<>();
		pq.offer((long)1);
		set.add((long)1);
		for(int i = 1;;i++){
			long x = pq.poll();//每次取优先队列里面最小的
			if(i == 1500){
				System.out.println("The 1500'th ugly number is "+x+".");
//>>>>>>> c59d77b7d94ab245056db4a713f8a9cc67657443
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
