package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * ȫ������ѭ��д
 * ���ȫ���в����õݹ�д�ģ���Ҫ��˼·�Ǿ��Ƿֱ��ڲ�ͬ��λ�ý��в���
 */
public class L15one {
	
	public List<List<Integer>> permute(int[] nums) {
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		if(nums.length==0){
			List<Integer> ls = new ArrayList<>();
			list.add(ls);
			return list;
		}
		int i = 1;
		List<Integer> lb = new ArrayList<>();
		lb.add(nums[0]);
		list.add(lb);
		while(i<nums.length){
			List<List<Integer>> lt = new ArrayList<>();
			for(int j = 0;j<list.size();j++){
				for(int k = 0;k<list.get(j).size();k++){
					List<Integer> ls = list.get(j);
					ls.add(k,nums[i]);//������һ��Ԫ��
					lt.add(new ArrayList(ls));//�Ѳ���õķ����¼���
					ls.remove(k);//����֮��Ҫɾ���������´β�����һ��λ�ò�Ӱ��
				}
				List<Integer> ln = list.get(j);
				ln.add(nums[i]);
				lt.add(ln);
			}
			list.clear();
			list.addAll(lt);
			i++;
		}
		return list;
    }
	public static void main(String[] args) {
		int[] ar = {1,2,3};
		List<List<Integer>> list = new ArrayList<>();//����һ���ܵı����������ͳ��ȫ����
		int i = 1;//���´�1��ʼ��ԭ������Ϊ��������list����ͼ�����һ�����ϣ�Ϊ�˱�֤��һ��ѭ���ܹ�����
		List<Integer> lb = new ArrayList<>();
		lb.add(ar[0]);
		list.add(lb);
		while(i<ar.length){//i�����������������������ÿ��ֵ����������������֪�ļ���������в����
			List<List<Integer>> lt = new ArrayList<>();//�����������ͳ�����µļ���Ԫ��
			for(int j = 0;j<list.size();j++){
				for(int k = 0;k<list.get(j).size();k++){
					List<Integer> ls = list.get(j);
//					if(k%2==0){//�ұ�����Ŀ�һ��λ�ý��в��룬������ʵ���ã���Ϊ�������������Ԫ�أ��ٽ���
					//ָ��λ�õĲ�������Ļ������ǽ�ԭ����Ԫ�ؼ�������һ��λ��ȥ�����������Ļ��������ÿ���һ��λ��
						ls.add(k,ar[i]);//������һ��Ԫ��
						lt.add(new ArrayList(ls));//�Ѳ���õķ����¼��ϣ�һ��Ҫ���µļ��ϣ�����˵��������ls��
													//��ô����ʵ�������ls�����ã���Ϊls֮���в����������Ҫ�����µļ���
//						System.out.println(lt.toString()+"ltltlt");
						ls.remove(k);//����֮��Ҫɾ���������´β�����һ��λ�ò�Ӱ��
//					}
				}
				List<Integer> ln = list.get(j);//���������Ϊʲô��Ҫ���룬����Ϊ����Ĳ���϶����벻�����һ��λ�ã������Ҵ������
									//��������в��룬�����������£���������Ӹ����ھ�Ӧ��û���ˣ����������ԣ�ȷʵ���ԣ���
//				System.out.println(ln.toString()+"lnlnln");
				ln.add(ar[i]);
				lt.add(ln);
//				System.out.println(lt.toString()+"ltltltout");
			}
			list.clear();//��վɵ����飬�����µ�����
			list.addAll(lt);
			i++;
		}
		System.out.println(list.toString().toString());
	}
}
