package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ȫ����
 */
public class L15 {
	//���Ǹ����ö�ջ��Ϣ�ķ���
	public static void printCallStatck() {
		Throwable ex = new Throwable();
		StackTraceElement[] stackElements = ex.getStackTrace();
		if (stackElements != null) {
			for (int i = 0; i < stackElements.length; i++) {
				System.out.print(stackElements[i].getClassName() + "\t");
				System.out.print(stackElements[i].getFileName() + "\t");
				System.out.print(stackElements[i].getLineNumber() + "\t");
				System.out.println(stackElements[i].getMethodName());
				System.out.println("-----------------------------------");
			}
		}
	}
	
	public List<List<Integer>> permute(int[] nums) {
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		if(nums==null){
			return list;
		}
		if(nums.length==0){
			list.add(new ArrayList<Integer>());
			return list;
		}
		permute(nums,0,nums.length-1,list);
		return list;
    }

	
	
	private void permute(int[] nums, int k, int m, List<List<Integer>> list) {
		printCallStatck();
		if(k == m){
			List<Integer> ls = new ArrayList<>();
			for(int i = 0;i<=m;i++){
				ls.add(nums[i]);
			}
			list.add(ls);
		}else{
			for(int i = k;i<=m;i++){
				swap(nums,i,k);//������ǽ���
				permute(nums, k+1, m, list);//�ݹ鵽�ײ���
				swap(nums,i,k);//��������Ҫ��ֵ����������
			}
		}
	}

	private void swap(int[] nums, int i, int k) {
		int f = nums[i];
		nums[i] = nums[k];
		nums[k] = f;
	}

	public static void main(String[] args) {
		int[] ar = {1,2,3};
		L15 one = new L15();
		one.permute(ar);
	}
}	
