package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * 全排列用循环写
 * 这个全排列不是用递归写的，主要的思路是就是分别在不同的位置进行插入
 */
public class L15one {
	
	public List<List<Integer>> permute(int[] nums) {
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		if(nums.length==0){
			List<Integer> ls = new ArrayList<>();
			list.add(ls);
			return list;
		}
		int i = 1;
		List<Integer> lb = new ArrayList<>();
		lb.add(nums[0]);
		list.add(lb);
		while(i<nums.length){
			List<List<Integer>> lt = new ArrayList<>();
			for(int j = 0;j<list.size();j++){
				for(int k = 0;k<list.get(j).size();k++){
					List<Integer> ls = list.get(j);
					ls.add(k,nums[i]);//插入了一个元素
					lt.add(new ArrayList(ls));//把插入好的放入新集合
					ls.remove(k);//插入之后要删除，方便下次插入下一个位置不影响
				}
				List<Integer> ln = list.get(j);
				ln.add(nums[i]);
				lt.add(ln);
			}
			list.clear();
			list.addAll(lt);
			i++;
		}
		return list;
    }
	public static void main(String[] args) {
		int[] ar = {1,2,3};
		List<List<Integer>> list = new ArrayList<>();//声明一个总的变量用来最后统计全排列
		int i = 1;//等下从1开始的原因是因为我首先在list里面就加入了一个集合，为了保证第一次循环能够进行
		List<Integer> lb = new ArrayList<>();
		lb.add(ar[0]);
		list.add(lb);
		while(i<ar.length){//i遍历这个数组用来，遍历的每个值都是用来进行在已知的集合里面进行插入的
			List<List<Integer>> lt = new ArrayList<>();//这个集合用来统计最新的集合元素
			for(int j = 0;j<list.size();j++){
				for(int k = 0;k<list.get(j).size();k++){
					List<Integer> ls = list.get(j);
//					if(k%2==0){//我本来想的空一个位置进行插入，但是其实不用，因为如果集合里面有元素，再进行
					//指定位置的插入运算的话，就是将原来的元素挤到后面一个位置去，所以这样的话，就正好空了一个位置
						ls.add(k,ar[i]);//插入了一个元素
						lt.add(new ArrayList(ls));//把插入好的放入新集合，一定要是新的集合，比如说你加入的是ls，
													//那么你其实加入的是ls的引用，因为ls之后还有操作，因此需要的是新的集合
//						System.out.println(lt.toString()+"ltltlt");
						ls.remove(k);//插入之后要删除，方便下次插入下一个位置不影响
//					}
				}
				List<Integer> ln = list.get(j);//这里在最后为什么还要插入，是因为上面的插入肯定插入不到最后一个位置，所以我打算的是
									//在这里进行插入，我现在想了下，好像上面加个等于就应该没事了，，，，，对，确实可以，哈
//				System.out.println(ln.toString()+"lnlnln");
				ln.add(ar[i]);
				lt.add(ln);
//				System.out.println(lt.toString()+"ltltltout");
			}
			list.clear();//清空旧的数组，换上新的数组
			list.addAll(lt);
			i++;
		}
		System.out.println(list.toString().toString());
	}
}
