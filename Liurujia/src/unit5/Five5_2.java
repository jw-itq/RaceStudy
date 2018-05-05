package unit5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ľ������
 * 
 */
public class Five5_2 {
	//����һ����������ļ��ϣ��൱��һ����ά����
	static List<List<Integer>> list = new ArrayList<>();
	
	//move a onto b
	private static void mOnto(int a,int b){
		list.get(a).clear();
		list.get(b).clear();
		list.get(b).add(b);
		list.get(b).add(a);
	}
	
	//����t���ڵ�λ��
	private static int returnT(int t){
		for(int i = 0;i<list.size();i++){
			if(list.get(i).indexOf(t)!=-1){
				return i;
			}
		}
		return -1;
	}
	
	//move a over b
	private static void mOver(int a,int b){
		//�Ƴ�a���������Ԫ��
		int i = returnT(a);
		if(i!=-1){
			for(int j = list.get(i).indexOf(a)+1;j<list.get(i).size();j++){
				list.get(i).remove(j);
			}
		}
		//��a�ŵ�b����ľ��ѵĶ���
		list.get(b).add(a);
	}
	
	//pile a onto b
	private static void pOnto(int a,int b){
		//�Ƴ�b�����Ԫ��
		int i = returnT(b);
		if(i!=-1){
			for(int j = list.get(i).indexOf(b)+1;j<list.get(i).size();j++){
				list.get(i).remove(j);
			}
		}
		//��a�Լ������ľ�������ƶ���b������
		i = returnT(a);
		int n = list.get(i).size();
		int ib = returnT(b);
		int k = list.get(ib).indexOf(b);//b���еľ��������
		if(i!=-1||ib!=-1){
			for(int j = list.get(i).indexOf(a);j<n;j++){
				System.out.println(list.get(i).get(j)+"******"+list.get(i).size()+"&&"+j+"^^"+ib);
				list.get(ib).add(list.get(i).get(j));
			}
			for(int j = list.get(i).indexOf(a);j<list.get(i).size();j++){
				list.get(i).remove(j);
			}
		}
		System.out.println("����");
	}
	
	//pile a over b
	private static void pOver(int a,int b){
		//��a�Լ������ľ���ƶ���b����ľ��Ķ���
		int i = returnT(a);
		int ib = returnT(b);
		if(i!=-1||ib!=-1){
			for(int j = list.get(i).indexOf(a);j<list.get(i).size();j++){
				list.get(ib).add(list.get(i).get(j));
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0;i<10;i++){
			List<Integer> ls = new ArrayList<>();
			ls.add(i);
			list.add(ls);
		}
		mOnto(9, 1);
		mOver(8, 1);
		mOver(7, 1);
		mOver(6, 1);
		pOnto(8, 6);
		pOnto(8, 5);
		mOver(2, 1);
		mOver(4, 9);
		Iterator<List<Integer>> iter = list.iterator();
		for(int i = 0;i<10;i++){
			if(iter.hasNext()){
				System.out.print(i+"\t");
				Iterator<Integer> it = iter.next().iterator();
				while(it.hasNext()){
					System.out.print(it.next()+"**");
				}
			}
			System.out.println();
		}
	}
}
