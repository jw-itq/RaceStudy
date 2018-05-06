package unit5;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 木块问题
 * 这果然是个综合性练习集合的例子
 * 用到了很多新东西，写了好久，但是最后我还是写出来了，主要是围着那个二维集合操作，其中还用到了反射
 * 实践才是硬道理
 */
public class Five5_2 {
	//创建一个集合里面的集合，相当于一个二维数组
	static List<List<Integer>> list = new ArrayList<>();
	
	//move a onto b
	private static void mOnto(int a,int b){
		list.get(a).clear();
		list.get(b).clear();
		list.get(b).add(b);
		list.get(b).add(a);
	}
	
	//返回t所在的位置
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
		//移除a上面的所有元素
		int i = returnT(a);
		if(i!=-1){
			for(int j = list.get(i).indexOf(a)+1;j<list.get(i).size();j++){
				list.get(i).remove(j);
			}
		}
		//把a放到b所有木块堆的顶部
		int ib = returnT(b);
		list.get(ib).add(a);
		list.get(i).remove(list.get(i).indexOf(a));
	}
	
	//pile a onto b
	private static void pOnto(int a,int b){
		//移除b上面的元素
		int i = returnT(b);
		if(i!=-1){
			for(int j = list.get(i).indexOf(b)+1;j<list.get(i).size();j++){
				list.get(i).remove(j);
			}
		}
		//把a以及上面的木块整体移动到b的上面
		i = returnT(a);
		int n = list.get(i).size();
		int ib = returnT(b);
		if(i==ib){//非法指令
			return;
		}
		int k = list.get(ib).indexOf(b);//b所有的具体的索引
		if(i!=-1||ib!=-1){
			for(int j = list.get(i).indexOf(a);j<n;j++){
//				System.out.println(list.get(i).get(j)+"******"+list.get(i).size()+"&&"+j+"^^"+ib);
				list.get(ib).add(list.get(i).get(j));
			}
			
			//通过反射拿到removeRange方法
			try {
				//拿到ArrayList的class对象
				Class<?> clazz = Class.forName("java.util.ArrayList");
				//通过clazz对象拿到那个不可访问的removeRange方法,以及参数
				Method meth = clazz.getDeclaredMethod("removeRange", int.class,int.class);
				//将这个方法的访问权限设置成可访问
				meth.setAccessible(true);
				//调用这个方法
				meth.invoke(list.get(i), list.get(i).indexOf(a),n);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		System.out.println("结束");
	}
	
	//pile a over b
	private static void pOver(int a,int b){
		//把a以及上面的木块移动到b所在木块的顶端
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
