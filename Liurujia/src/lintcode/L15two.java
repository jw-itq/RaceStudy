package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * ȫ�������õݹ�д��
 * ����ݹ�ķ�ʽ��Ҫ���õĲ��ϵĽ���Ԫ�صķ�ʽ
 */
public class L15two {
	public List<List<Integer>> permute(int[] nums) {
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		if(nums == null){
			return null;
		}
		if(nums.length==0){
			List<Integer> ls = new ArrayList<>();
			list.add(ls);
			return list;
		}
		permute(list,nums,0,nums.length-1);
		return list;
    }

	private void permute(List<List<Integer>> list, int[] nums, int k, int m) {
		if(k == m){
			List<Integer> ls = new ArrayList<>();
			for(int i = 0;i<nums.length;i++){
				ls.add(nums[i]);
			}
			list.add(ls);
		}else{
			for(int i = k;i<=m;i++){
				swap(nums,i,k);//������ǽ��е�ǰλ�õĽ���������ǵݹ���ص�
				permute(list,nums,k+1,m);
				swap(nums,i,k);//����϶����õݹ�����ģ�������һ�μ���ľ�����ǵݹ�������Ǹ�����
			}
		}
	}

	private void swap(int[] nums, int i, int k) {
		int temp = nums[i];
		nums[i] = nums[k];
		nums[k] = temp;
	}
}
