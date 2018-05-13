package unit5;

import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
 * ³óÊý
 */
public class Five5_7 {
	public static void main(String[] args) {
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
			/*PrintStream out = new PrintStream(new BufferedOutputStream(System.out));
			out.println(count+"-----");*/
			System.out.println(count+"----");
			if(count == 1500){
				System.out.println(n+"***");
				break;
			}
			n++;
		}
	}
}
