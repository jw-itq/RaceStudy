package leetcode;

/*
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�

����Լ������������ظ�Ԫ�ء�

ʾ�� 1:

����: [1,3,5,6], 5
���: 2
ʾ�� 2:

����: [1,3,5,6], 2
���: 1
ʾ�� 3:

����: [1,3,5,6], 7
���: 4
ʾ�� 4:

����: [1,3,5,6], 0
���: 0

˼·��������򵥣�����Ҫ������ȫ��1
	1����Ŀ��ֵ��ʱ���Ǿ�Ӧ��ѭ��ֱ������Ŀ��ֵ��ʱ��ͷ����±�
	2��û��Ŀ��ֵ��ʱ��ѭ��������������Ǹ����ֵ�ʱ�򣬷���������ֵ��±�
		�����ǿ϶��Ǳ����������������ֶ�Ҫ���Ǿ�����󷵻�����������һ�����±�
 */
public class L35 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0||nums==null){
        	return -1;
        }
        for(int i = 0;i<nums.length;i++){
        	if(nums[i]==target){
        		return i;
        	}
        	if(nums[i]>target){
        		return i;
        	}
        }
        return nums.length;
    }
    
    public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		System.out.println(new L35().searchInsert(nums, 5));
	}
}
