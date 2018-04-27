package unit3;

import java.util.ArrayList;
import java.util.List;

/*
 * 数数字
 * 我决定用一下集合的方式
 */
public class Example3_3 {
	public static void main(String[] args) {
		int n = 13;
		List<Integer> list = new ArrayList<Integer>();
		String str = "";
		for(int i = 0;i<10;i++){
			list.add(0);
		}
		for(int i = 1;i<=n;i++){
			str+=i+"";
		}
		for(int i = 0;i<str.length();i++){
			switch (str.charAt(i)) {
			case '0':
				list.set(0, list.get(0)+1);
				break;
			case '1':
				list.set(1, list.get(1)+1);
				break;
			case '2':
				list.set(2, list.get(2)+1);
				break;
			case '3':
				list.set(3, list.get(3)+1);
				break;
			case '4':
				list.set(4, list.get(4)+1);
				break;
			case '5':
				list.set(5, list.get(5)+1);
				break;
			case '6':
				list.set(6, list.get(6)+1);
				break;
			case '7':
				list.set(7, list.get(7)+1);
				break;
			case '8':
				list.set(8, list.get(8)+1);
				break;
			case '9':
				list.set(9, list.get(9)+1);
				break;
			default:
				break;
			}
		}
		System.out.println(list.toString());
	}
}
