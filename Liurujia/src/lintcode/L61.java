package lintcode;

import java.util.Map;

/*
 * 61. 搜索区间

给定一个包含 n 个整数的排序数组，找出给定目标值 target 的起始和结束位置。

如果目标值不在数组中，则返回[-1, -1]

样例

给出[5, 7, 7, 8, 8, 10]和目标值target=8,

返回[3, 4]

挑战

时间复杂度 O(log n)

首先排除特殊情况，保证它应该在这个区间内，然后遍历这个数组，一旦发现跟它相等的时候开始记录下标，
直到有一个跟它不相等就是大于这个数嘛，就停止，因为考虑到最后一个元素的特殊情况，所以最后结束的位置应该在外面确定
使用一个循环遍历这个数组，然后首先判断如果有一个数大于要求的这个数的时候，我就应该停止循环，
然后要是有等于这个数的，就记录第一次的下标，这个下标应该这样记录，不能记录等于的这个下标，应该记录那前一个
不等于该数的下标，这个数字怎么获得，可以判断获得，这就结束了

答案说了使用二分，二分的话，那么也很简单，就是把复杂度降低了，明天写
 */
public class L61 {
	public int[] searchRange(int[] A, int target) {
        // write your code here
		int i = 0;
		boolean bl = false;
		int[] re = {-1,-1};
		if(A.length==0||A[0]>target||A[A.length-1]<target){
			return re;
		}
		for(;i<A.length;i++){
			if(A[i]>target){
				break;
			}
			if(A[i]==target){
				bl = true;
				if(i==0){
					re[0] = 0;
				}else if(A[i-1]!=target){
					re[0] = i;
				}
			}
		}
		if(!bl){
			return re;
		}
		re[1] = i-1;
		return re;
    }
}
