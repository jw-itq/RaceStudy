package lintcode;

/*
 * ���������
 */
public class L41 {
	/*��������ĳ�ʱ��
	 * public int maxSubArray(int[] nums) {
        // write your code here
		if(nums.length==1){
			return nums[0];
		}
		int count = nums[0];
		for(int i = 0;i<nums.length;i++){//�����ʾ���������Ĳ���
			for(int j = 0;j<nums.length-i;j++){
				int cou = nums[j];
				for(int k = j+1;k<=j+i;k++){
					cou += nums[k];
				}
				if(cou>count){
					count = cou;
				}
			}
		}
		return count;
    }*/
	
	/*public int maxSubArray(int[] nums) {
        // write your code here
		if(nums.length==0||nums==null){
			return 0;
		}
		int max = Integer.MIN_VALUE,sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
		}
		return max;
    }*/
	
	/*
	 * ��������û���ܹ��ú���⣬���������������û���ܹ��Լ���˼������
	 * ����һ�����⣬��Ӧ�÷�����������ԭ����ʲô���ñ�˵���⣬���˵Ҫ��
	 * ���������飬��ô���������˵��������û�и����Ļ�����ôֱ������ĺ�
	 * ��������������������飬��������и�����ô���أ����Ӧ�����Ҷ������
	 * ������Ҫ˼���ģ��𰸵�˼·�ܼ򵥣��Ǿ����ۼӵ�ʱ�򲻶ϸ�����С�Ƚϣ�
	 * �����ӵĻ����д�Ķ����ų���������Ҫ��һ��˼·�Ǿ�����������Ǳ���С����
	 * �Ͳ�Ҫ�ۼӣ���Ϊ�����ۼӻ�ı��С������һ��Ҫ�Ѹ������Ե������Եİ취
	 * ���Ǹ���Ƚϣ�����Ǹ����������´��ۼӵ�ʱ��ӵĲ���֮ǰ���Ǹ���������0
	 */
	public int maxSubArray(int[] nums){
		//������жϼ��˵����,
		if(nums.length==0||nums ==null){
			return 0;
		}
		int max = Integer.MIN_VALUE,sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];//���������ۼ�
			max = Math.max(max, sum);//�����������ĸ��Ƚϳ���������ľ������ģ������Ǹ�������ʲô
			sum = Math.max(sum, 0);//sum����Ƚϵ�ԭ�����ϣ����һ���ۼӵ�ʱ������Ǹ����Ļ���Ҫ�ۼӣ�����Ҫ�ۼ�0
		}
		return max;
	}
	public static void main(String[] args) {
		int[] ar = {-2,-1,-3,4,-1,2,1,-5,3};
		System.out.println(new L41().maxSubArray(ar));
	}
}
