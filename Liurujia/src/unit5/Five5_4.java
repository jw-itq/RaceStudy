package unit5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * 反片语
 * 思路思路！！！
 * 首先需要一个让这个单词变成“标准化”的一个函数，然后将所有“标准化”后
 * 的单词都放入map集合里面，然后重复的就计数，最后如果只有一个的话，那
 * 就存到另一个集合里面，最后输出这个集合
 * 
ladder came tape soon leader acme RIDE lone Dreis peat
 ScAlE orb  eye  Rides dealer  NotE derail LaCeS  drIed
noel dire Disk mace Rob dries
 */
public class Five5_4 {
	
	//将一个单词“标准化”处理后返回处理之后的单词
	private static String repo(String str){
		char[] ch = str.toLowerCase().toCharArray();
		Arrays.sort(ch);
		return String.valueOf(ch);
	} 
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String words = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bf = new BufferedReader(isr);
			int w;
			w = bf.read();
			while((char)w != '#'){
				words += (char)w;
				w = bf.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(words);
		//将所有单词的重复次数映射到map集合
		String[] word = words.split("\\s");
		for(String i : word){
			if(i.length()==0){
				continue;
			}
			int sz = map.size();
			String nw = repo(i);
			map.put(nw,map.get(nw)==null?1:map.get(nw));
			if(map.size()==sz){
				map.put(nw,map.get(nw)+1);
			}
		}
//		System.out.println(map.toString());
		//将只有一个重复单词的添加到集合list里面，最后输出
		List<String> list = new ArrayList<>();
		for(String i : word){
			if(i.length()==0){
				continue;
			}
			if(map.get(repo(i))==1){
				list.add(i);
			}
		}
		//输出最后的结果
		Collections.sort(list);
		for(String i : list){
			System.out.println(i);
		}
	}
	/*public static void main(String[] args) {
		String word = "";
		try {
			//从标准输入里面获取文本
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bf = new BufferedReader(isr);
			int w = bf.read();//读取的是asc码所以需要转换
			while((char)w != '#'){
				word +=(char)w;
				w = bf.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(word);
		//接下来开始处理
		//题目说的是不能通过字母重拍得到其他的单词，其实我就可以把所有的单词都排序好，重复的就不是
		System.out.println("------------------------------------");
		Map<Integer, String> map = new HashMap<Integer, String>();
		List<String> list = new ArrayList<>();
		int k = 0;//作为map的键
		String[] words = word.split("\\s");//按空白字符拆分单词
		for(String w : words){
			if(w.length()==0){
				continue;
			}
			char[] ch = w.toLowerCase().toCharArray();
			Arrays.sort(ch);
			
			list.add(String.valueOf(ch));
			map.put(k++, w);
		}
		System.out.println(map.toString());
		System.out.println(list.toString());
		
		//用来记录需要排除的下标；
		String index = "";
		for(int i = 0;i<list.size();i++){
			String ws = list.get(i);
			boolean wb = false;
			for(int j = i+1;j<list.size();j++){
				if(ws.equals(list.get(j))){
					System.out.println(ws+"****"+list.get(j));
					wb = true;
					list.remove(j);
					index += j;
					j--;//！！！千万别忘记删完之后要减1，如果不减的话，就跳过了一个单词
				}
			}
			if(wb){
				list.remove(i);
				index += i;
				i--;
			}
		}
		
		//排除map中重复的，也就是下标对应的键
		for(int i = 0;i<index.length();i++){
			System.out.println(index.charAt(i)+"*********");
			map.remove(i);
		}
		System.out.println(list.size());
		System.out.println(map.toString());
	}*/
}
