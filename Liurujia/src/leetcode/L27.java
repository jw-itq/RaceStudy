package leetcode;

import java.util.Arrays;

/*
 * ����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

ʾ�� 1:

���� nums = [3,2,2,3], val = 3,

����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
ʾ�� 2:

���� nums = [0,1,2,2,3,0,4,2], val = 2,

����Ӧ�÷����µĳ��� 5, ���� nums �е�ǰ���Ԫ��Ϊ 0, 1, 3, 0, 4��

ע�������Ԫ�ؿ�Ϊ����˳��

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
˵��:

Ϊʲô������ֵ��������������Ĵ���������?

��ע�⣬�����������ԡ����á���ʽ���ݵģ�����ζ���ں������޸�����������ڵ������ǿɼ��ġ�

����������ڲ���������:

// nums ���ԡ����á���ʽ���ݵġ�Ҳ����˵������ʵ�����κο���
int len = removeElement(nums, val);

// �ں������޸�����������ڵ������ǿɼ��ġ�
// ������ĺ������صĳ���, �����ӡ�������иó��ȷ�Χ�ڵ�����Ԫ�ء�
for (int i = 0; i < len; i++) {
    print(nums[i]);
}

˼·��
	���� nums = [0,1,2,2,3,0,4,2], val = 2,
	��������ȥ��
 */
public class L27 {
    public int removeElement(int[] nums, int val) {
    	if(nums.length==0||nums==null){
    		return 0;
    	}
        int temp = -1;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
        	if(temp==-1&&nums[i]==val){
        		temp = i;
        	}
        	if(temp!=-1&&nums[i]!=val){
        		nums[temp++] = nums[i];
        	}
        }
        if(temp==-1){
        	return nums.length;
        }else{
        	return temp;
        }
    }
    
    public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		System.out.println(new L27().removeElement(nums, 2));
		System.out.println(Arrays.toString(nums));
	}
}
