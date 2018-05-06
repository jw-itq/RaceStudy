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
 * ��Ƭ��
 * ˼·˼·������
 * ������Ҫһ����������ʱ�ɡ���׼������һ��������Ȼ�����С���׼������
 * �ĵ��ʶ�����map�������棬Ȼ���ظ��ľͼ�����������ֻ��һ���Ļ�����
 * �ʹ浽��һ���������棬�������������
 * 
ladder came tape soon leader acme RIDE lone Dreis peat
 ScAlE orb  eye  Rides dealer  NotE derail LaCeS  drIed
noel dire Disk mace Rob dries
 */
public class Five5_4 {
	
	//��һ�����ʡ���׼��������󷵻ش���֮��ĵ���
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
		//�����е��ʵ��ظ�����ӳ�䵽map����
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
		//��ֻ��һ���ظ����ʵ���ӵ�����list���棬������
		List<String> list = new ArrayList<>();
		for(String i : word){
			if(i.length()==0){
				continue;
			}
			if(map.get(repo(i))==1){
				list.add(i);
			}
		}
		//������Ľ��
		Collections.sort(list);
		for(String i : list){
			System.out.println(i);
		}
	}
	/*public static void main(String[] args) {
		String word = "";
		try {
			//�ӱ�׼���������ȡ�ı�
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bf = new BufferedReader(isr);
			int w = bf.read();//��ȡ����asc��������Ҫת��
			while((char)w != '#'){
				word +=(char)w;
				w = bf.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(word);
		//��������ʼ����
		//��Ŀ˵���ǲ���ͨ����ĸ���ĵõ������ĵ��ʣ���ʵ�ҾͿ��԰����еĵ��ʶ�����ã��ظ��ľͲ���
		System.out.println("------------------------------------");
		Map<Integer, String> map = new HashMap<Integer, String>();
		List<String> list = new ArrayList<>();
		int k = 0;//��Ϊmap�ļ�
		String[] words = word.split("\\s");//���հ��ַ���ֵ���
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
		
		//������¼��Ҫ�ų����±ꣻ
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
					j--;//������ǧ�������ɾ��֮��Ҫ��1����������Ļ�����������һ������
				}
			}
			if(wb){
				list.remove(i);
				index += i;
				i--;
			}
		}
		
		//�ų�map���ظ��ģ�Ҳ�����±��Ӧ�ļ�
		for(int i = 0;i<index.length();i++){
			System.out.println(index.charAt(i)+"*********");
			map.remove(i);
		}
		System.out.println(list.size());
		System.out.println(map.toString());
	}*/
}
