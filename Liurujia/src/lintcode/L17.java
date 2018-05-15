package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 求所有的子集
 * [
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
这里采用二进制的方式，非递归的方式
000~111就正好
 */
public class L17 {
	public List<List<Integer>> subsets(int[] nums) {
        // write your code here
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums==null){
			return null;
		}
		if(nums.length==0){
			List<Integer> ls = new ArrayList<Integer>();
			list.add(ls);
			return list;
		}
		for(int i = 0;i<Math.pow(2, nums.length);i++){
			List<Integer> ls = new ArrayList<Integer>();
			String s = String.format("%0"+nums.length+"d", Integer.parseInt(Integer.toBinaryString(i)));
			int j = 0;
			while(j<nums.length){
				if(s.charAt(j)=='1'){
					ls.add(nums[j]);
				}
				j++;
			}
			list.add(ls);
		}
		return list;
    }
	
	public static void main(String[] args) {
		int[] ar = {1,2,3};
		System.out.println(new L17().subsets(ar).toString());
		/*for(int i = 0;i<=Math.pow(2, 3)-1;i++){
			System.out.println("%%%"+Integer.toBinaryString(i));
			String s = String.format("%03d", Integer.parseInt(Integer.toBinaryString(i)));
			System.out.println(s);
			int j = 0;
			String str = "";
			boolean bool = false;
			while(j<ar.length){
				if(s.charAt(j)=='1'){
					bool = true;
					System.out.print(ar[j]+",");
				}
				j++;
			}
			if(!bool){
				System.out.print("[],");
			}
			System.out.println();
		}*/
	}
}
