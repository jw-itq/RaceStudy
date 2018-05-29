package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 57. ����֮��

����һ����n������������S����S���ҵ���������a, b, c���ҵ�����ʹ��a + b + c = 0����Ԫ��
��ô����Ļ�����Ӧ�ÿ��Բο��Ҹո�д���Ǹ���ӽ���������˼·���Ǹ�˼·�þú��ڲ�������ظ���
����dfs��˼�뻹��Ҫȥ�أ�ͬ��Ҳ���ȹ̶�һ������Ȼ�����Ĳ��á����Ҽбơ���һ��������������
������Ļ����Ǿ���list.add��Ȼ������Ļ�����ʵ�Ͳ���Ҫ���򣬵���Ҫ��������
�Ժ���Ҫ���ɸ�ϰ�ߣ�ÿ��д�㷨֮ǰ����Ҫ�ȷ��������Ŀ�����ҿ��ǵ����У��ո��Ҿ�����Ϊ̫����
д���룬����������������ָ����ô�䣬��ʵ������Ļ���Ӧ��˵����Ҫ����ָ���ˣ�ֻ��Ҫ���������
������һ��ѭ�����൱��������ָ��ȫ��ɨ����һ�飨������뷨���ᵼ��ֻ�ܱ������ڵ����֣�
���ϵ��޸ģ����ϵķ������⣬�������ַ������ҵ����⣬�Ǿ����ڲ��ϵ�ѭ�������У��̶�λ�õ�ָ��
������ǰ�ƽ����������������������ͻ���Ե��ܶ�����������ҵ��뷨���ǲ��ý������뷨��ÿ�ζ���
��һ��Ԫ�ؽ������õ�һ�����ϱ任���õڶ���ѭ�����Ǵӵڶ�����ʼ��������ü���ȥ�أ��Ϳ��Եõ�����
�������

�ðɺðɺðɣ��������ôͨ���ģ����õ�������һ��ʼ���뷨��Ҳ�����Ǹ������Ҽбơ����뷨��������Ҫ��
�ܽ�������뷨������뷨��һ����������ָ��ĺô������ڣ���Ҫ�����ʱ���Ҿ�start++����Ҫ��С��
ʱ���Ҿ�end--�������ӵĻ��Ϳ��������е�����������ˣ���������Ŀ�õ���һЩ��������ѧ֪ʶ������
��Ҫ���۵ģ����벻��Ҫ��̫�࣬�����뷨һ��Ҫ����
 */
public class L57resouce {
	public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
		Arrays.sort(numbers);
		List<List<Integer>> list = new ArrayList<>();
		for(int i = 0;i<numbers.length;i++){
			int f = numbers[0];
			numbers[0] = numbers[i];
			numbers[i] = f;
			int start = i+1;
			int end = numbers.length-1;
			while(start<end){
				int b = numbers[0]+numbers[start]+numbers[end];
				if(b==0){
					List<Integer> ls = new ArrayList<>();
					ls.add(numbers[0]);
					ls.add(numbers[start]);
					ls.add(numbers[end]);
					if(!list.contains(ls)){
						list.add(ls);
					}
				}
				if(b<0){
					start++;
				}else{
					end--;
				}
			}
			f = numbers[0];
			numbers[0] = numbers[i];
			numbers[i] = f;
		}
		return list;
    }
	
	public static void main(String[] args) {
		int[] ar = {-2,-3,5,-1,-4,5,-11,7,1,2,3,4,-7,-1,-2,-3,-4,-5};
		List<List<Integer>> list = new L57resouce().threeSum(ar);
		System.out.println(list.toString());
		System.out.println(list.size());
	}
}
