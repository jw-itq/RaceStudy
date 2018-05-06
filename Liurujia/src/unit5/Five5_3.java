package unit5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
 * 安迪的第一个字典
 */
public class Five5_3 {
	public static void main(String[] args) {
		//将读到的文本存到这个字符串里面
		String words = "";
		//用文件的方式读取文本
		//读入一个文件
		try {
			File file = new File("D:\\java实验1\\RaceStudy\\Liurujia\\src\\unit5\\f53.txt");
			//建立一个输入流的对象
			InputStreamReader isr;
			isr = new InputStreamReader(new FileInputStream(file));
			//建立一个对象，以将输入流对象装换成计算机能懂的语言
			BufferedReader br = new BufferedReader(isr);
			//采用字符串的方式判断是否输入流里面是否还有内容
			String line = "";
			line = br.readLine();//读入一行
			while(line != null){
				words += line+"\n";
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(words);
		//接下来开始处理这个字符串
		String[] word = words.split(" ");
		Set<String> set = new HashSet<String>();
		for(String i : word){
			String s = "";
			for(int j = 0;j<i.length();j++){//去掉非字母的字符以及去掉大小写
				if(Character.isLetter(i.charAt(j))){
					s += Character.toLowerCase(i.charAt(j));
				}
			}
			set.add(s);
		}
		List<String> list = new ArrayList<String>(set);
//		for(String s : list){
//			System.out.println(s);
//		}
		Collections.sort(list);
//		System.out.println("----------------------------------------");
		for(String s : list){
			System.out.println(s);
		}
	}
}
