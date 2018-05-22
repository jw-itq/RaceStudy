package lintcode;

import java.util.List;

/*
 * ����������
 * 42. ��������� II

����һ���������飬�ҳ����� ���ص� ������ʹ�����ǵĺ����
ÿ��������������������е�λ��Ӧ���������ġ�
�������ĺ͡�

����

�������� [1, 3, -1, 2, -1, 2]
������������ֱ�Ϊ [1, 3] �� [2, -1, 2] ���� [1, 3, -1, 2] �� [2]�����ǵ����Ͷ��� 7

�����˼·����Ϊ����������һ�����ص������ԾͿ϶�����һ���ָ��ߣ���������������ָ����
������left[]��right[]��������ֱ��ŴӴ�λ����������������������������Ƕ��٣�
��ô�õ�����������֮�󣬾Ϳ�����������������зָȻ����Ҫע��ľ���right[]������Ҫ��
����ǰ��ֵ����Ϊ�����Ļ������Ϳ���������ӣ������Ϳ�����ɷָ�
 */
public class L42 {
	public int maxTwoSubArrays(List<Integer> nums) {
        // write your code here
		//������Ҫд�ľ��Ǵ���߿�ʼ����������ι�������λ�õ�������ֵ��ŵ���Ӧ��λ������
		int[] left = new int[nums.size()];
		int[] right = new int[nums.size()];
		
		int max = Integer.MIN_VALUE,sum = 0;
		for(int i = 0;i<nums.size();i++){
			sum += nums.get(i);
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
			left[i] = max;//�����ʾ�ľ��Ǵ�ʱ���iλ���ϵ�����ֵ�Ƕ���
		}
		
		max = Integer.MIN_VALUE;
		sum = 0;
		for(int i = nums.size()-1;i>=0;i--){//����Ϊʲô�Ǵ��ұ��أ�������Ϊ��������һ�ָ���е�������ᱻ�ָ����
			sum += nums.get(i);
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
			right[i] = max;//�����left����һ���Ĺ�����
		}
		
		max = Integer.MIN_VALUE;//��Ϊ����������Ҫ�ҵ������Ǹ���ϵ�ֵ�Ƕ��٣������Ҫ����һ������С
		for(int i = 0;i<left.length-1;i++){
			max = Math.max(max, left[i]+right[i+1]);//�����left[i]+right[i+1]��ʵ�������еķָ�
		}
		return max;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 3, -1, 2, -1, 2};
	}
}
