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
 * ���ϵĵ�һ���ֵ�
 */
public class Five5_3 {
	public static void main(String[] args) {
		//���������ı��浽����ַ�������
		String words = "";
		//���ļ��ķ�ʽ��ȡ�ı�
		//����һ���ļ�
		try {
			File file = new File("D:\\javaʵ��1\\RaceStudy\\Liurujia\\src\\unit5\\f53.txt");
			//����һ���������Ķ���
			InputStreamReader isr;
			isr = new InputStreamReader(new FileInputStream(file));
			//����һ�������Խ�����������װ���ɼ�����ܶ�������
			BufferedReader br = new BufferedReader(isr);
			//�����ַ����ķ�ʽ�ж��Ƿ������������Ƿ�������
			String line = "";
			line = br.readLine();//����һ��
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
		//��������ʼ��������ַ���
		String[] word = words.split(" ");
		Set<String> set = new HashSet<String>();
		for(String i : word){
			String s = "";
			for(int j = 0;j<i.length();j++){//ȥ������ĸ���ַ��Լ�ȥ����Сд
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
