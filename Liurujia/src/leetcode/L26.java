package leetcode;

/*
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

示例 1:

给定数组 nums = [1,1,2], 

函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 

你不需要考虑数组中超出新长度后面的元素。
示例 2:

给定 nums = [0,0,1,1,1,2,2,3,3,4],

函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

你不需要考虑数组中超出新长度后面的元素。
说明:

为什么返回数值是整数，但输出的答案是数组呢?

请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。

你可以想象内部操作如下:

// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
int len = removeDuplicates(nums);

// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
for (int i = 0; i < len; i++) {
    print(nums[i]);
}

思路：
	给定 nums = [0,0,1,1,1,2,2,3,3,4],
	我突然有个思路，那就是，我循环遍历这个有重复元素的数组的时候，我做个判断，判断当前值是否跟下一个值相等，
	直到不相等的时候，那我应该将当前值赋给一个我定义的变量的位置，这个变量来帮助我应该在什么位置赋值
 */
public class L26 {
    public int removeDuplicates(int[] nums) {
        int number = 0;
        int t = 0;
        for(int i = 0;i<nums.length-1;i++){
        	if(nums[i]!=nums[i+1]){
        		nums[t++] = nums[i];
        	}
        }
        nums[t] = nums[nums.length-1];
        return t;
    }
    public static void main(String[] args) {
    	int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(new L26().removeDuplicates(nums));
	}
}
