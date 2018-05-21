package lintcode;

/*
 * 最大子数组
 */
public class L41 {
	/*这题我想的超时了
	 * public int maxSubArray(int[] nums) {
        // write your code here
		if(nums.length==1){
			return nums[0];
		}
		int count = nums[0];
		for(int i = 0;i<nums.length;i++){//这个表示的是增长的步幅
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
	
	public int maxSubArray(int[] nums) {
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
    }
	
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,100,200,1000};
		System.out.println(new L41().maxSubArray(ar));
	}
}
