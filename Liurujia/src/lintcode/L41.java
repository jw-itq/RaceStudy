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
	 * 这题昨天没有能够好好理解，出的问题就在于我没有能够自己的思考问题
	 * 对于一个问题，我应该分析它产生的原因是什么，好比说这题，如果说要求
	 * 最大的子数组，那么很明显如果说数组里面没有负数的话，那么直接数组的和
	 * 就是这个数组的最大子数组，但是如果有负数怎么办呢？这才应该是我对于这个
	 * 问题需要思考的，答案的思路很简单，那就是累加的时候不断跟无穷小比较，
	 * 这样子的话所有大的都会排出来，最重要的一个思路那就是碰到如果是比零小的那
	 * 就不要累加，因为负数累加会改变大小，所以一定要把负数忽略掉，忽略的办法
	 * 就是跟零比较，如果是个负数，那下次累加的时候加的不是之前的那个负数而是0
	 */
	public int maxSubArray(int[] nums){
		//最后来判断极端的情况,
		if(nums.length==0||nums ==null){
			return 0;
		}
		int max = Integer.MIN_VALUE,sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];//这里是在累加
			max = Math.max(max, sum);//这里是在最大的给比较出来，保存的就是最大的，不管是负数还是什么
			sum = Math.max(sum, 0);//sum跟零比较的原因就是希望下一次累加的时候如果是负数的话不要累加，而是要累加0
		}
		return max;
	}
	public static void main(String[] args) {
		int[] ar = {-2,-1,-3,4,-1,2,1,-5,3};
		System.out.println(new L41().maxSubArray(ar));
	}
}
