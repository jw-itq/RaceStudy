package leetcode;

/*
 * ����֮��
 * ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������

����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�

ʾ��:

���� nums = [2, 7, 11, 15], target = 9

��Ϊ nums[0] + nums[1] = 2 + 7 = 9
���Է��� [0, 1]

����Ļ����ҵ�Ȼ��ʱֻ��ʹ�ñ�����������
 */
public class L1 {
	public int[] twoSum(int[] nums, int target) {
		int[] ar = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
            	if(nums[i]+nums[j]==target&&i!=j){
            		ar[0] = i;
            		ar[1] = j;
            	}
            }
        }
        return ar;
    }
}
