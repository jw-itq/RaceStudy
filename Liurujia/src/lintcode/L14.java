package lintcode;

/*
 * ���ֲ�����С������λ��
 */
public class L14 {
	public int binarySearch(int[] nums, int target) {
        // write your code here
		return binary(nums,target,0,nums.length-1);
    }

	private int binary(int[] nums, int target, int left, int right) {
		int n = (left+right)/2;
		if(left>right){//����һ�ּ������������Ҫ���ȿ���
			return -1;
		}
		if(nums[n]==target){
			for(int i = n-1;i>=0;i--){//����Ϊʲô��n-1����Ϊ�����n�Ļ���ִ�в���else��
				if(nums[i]==target){
					continue;
				}else{
					return i+1;
				}
			}
			return n;//һ��Ҫע�⿼�ǵ��������
		}
		if(nums[n]<target){
			return binary(nums, target, n+1, right);
		}else{
			return binary(nums, target, left, n-1);
		}
	}
}
