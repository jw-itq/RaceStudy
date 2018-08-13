package leetcode;

import java.util.Arrays;

/*
 * ����һ���Ǹ�������ɵķǿ����飬�ڸ����Ļ����ϼ�һ������һ���µ����顣

���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�

����Լ���������� 0 ֮�⣬��������������㿪ͷ��

ʾ�� 1:

����: [1,2,3]
���: [1,2,4]
����: ���������ʾ���� 123��
ʾ�� 2:

����: [4,3,2,1]
���: [4,3,2,2]
����: ���������ʾ���� 4321��

˼·��
	��������ۣ�
		1������ǿյ����飬�Ǿͷ����������
		2������������ֻ��һ��Ԫ�أ�����ֱ�ӽ���������1Ȼ��ı��������
		3����������������ĸ�������1������Ӧ���ж����һ��Ԫ�ؼ�1֮���ֵ�Ƿ����10
			�������10������Ӧ�ý������ʮλ�뵹���ڶ�λ������Ӳ��ı��������
				���У�����Ҫ�������֮���ÿһλ����Ҫ��λ�����
				�������ʹ��ѭ�����������������ڶ�λ������ӵĽ�����Ǵ���10���Ǿ�
				����ѭ����һλ��ֱ����ĩβ����С��10Ϊֹ��������ڼ䣬Ӧ��ʹ���ַ�����
				�洢������Ҳԭ�ظı�������飬��Ϊ������Ĵ�С�������ԭ����Ļ�����
				˵�������������99+1=100�����ԣ�����Ҫ���¸���һ���µ����飬����ַ���
				������������õģ������ǿ϶����������������ֱ�ӷ���ԭ����ͺ���
			���С��10������ֻ��Ҫֱ�ӽ���1�Ľ���ı����һ������
			
		,,,�����Һð��죬���첻��״̬����
 */
public class L66 {
    public int[] plusOne(int[] digits) {
    	if(digits.length==0||digits==null){
    		return digits;
    	}
    	int num = 1;
    	for(int i = digits.length-1;i>=0;i--){
    		int add = digits[i]+num;
    		if(add>=10){
    			digits[i] = add%10;
    			num = add/10;
    		}else{
    			digits[i] = add;
    			return digits;
    		}
    	}
    	int[] digit = new int[digits.length+1];
    	digit[0] = num;
    	for(int i = 1;i<digit.length;i++){
    		digit[i] = digits[i-1];
    	}
    	return digit;
    }
    public static void main(String[] args) {
    	int[] digits = {9,9,9};
		System.out.println(Arrays.toString(new L66().plusOne(digits)));
	}
}