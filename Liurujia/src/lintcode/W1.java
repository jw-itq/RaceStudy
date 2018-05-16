package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * �����������ģ�����m����k��k��ʾ1��k�����飬m��ʾ���������������Ҫ��Ҫ�������ֵĺ�k������Ҫ�ظ�
 * ������Ժ������ˣ�����һ����֪����
 * �㷨���У������Ͳ�����
 */
public class W1 {
	static int mt = 100;
	static int kt = 1000;
	static Set<List<Integer>> ls = new HashSet<>();
	public static void permute(List<Integer> list,int m,int[] k){
//		System.out.println(list.toString()+"***********"+list.size());
		if(list.size()==mt){
			System.out.println(list.toString()+"***********"+list.size());
			int sum = 0;
			List<Integer> lt = new ArrayList<>();
			for(Integer i : list){
				sum += i;
				lt.add(i);
			}
			if(sum == kt){
				Collections.sort(lt);
				ls.add(lt);
			}
		}
		if(m==0){
			return;
		}
		for(int i = 0;i<k.length;i++){
			list.add(k[i]);
			permute(list,m-1,k);
			list.remove(list.indexOf(k[i]));
		}
	}
	public static void main(String[] args) {
		Set<int[]> set = new HashSet<>();
		int k = 1000;
		int m = 100;
		int[] ar = new int[k];
		for(int i = 0;i<ar.length;i++){
			ar[i] = i+1;
		}
		System.out.println(Arrays.toString(ar));
		permute(new ArrayList<Integer>(), 3, ar);
		System.out.println(ls.toString());
	}
}

