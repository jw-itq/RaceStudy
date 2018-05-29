package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 57. 三数之和

给出一个有n个整数的数组S，在S中找到三个整数a, b, c，找到所有使得a + b + c = 0的三元组
那么这题的话，我应该可以参考我刚刚写的那个最接近的三数的思路，那个思路好久好在不会出现重复的
不像dfs的思想还需要去重，同样也是先固定一个数，然后后面的采用“左右夹逼”，一旦发现有三个数
等于零的话，那就让list.add，然后这个的话，其实就不需要排序，但是要遍历所有
以后我要养成个习惯，每次写算法之前，都要先分析这个题目，并且考虑到所有，刚刚我就是因为太急着
写代码，而忘记了另外两个指针怎么变，其实在这里的话，应该说不需要两个指针了，只需要给后面的那
部分来一次循环就相当于是两个指针全都扫描了一遍（错误的想法，会导致只能遍历相邻的数字）
不断的修改，不断的发现问题，这里我又发现了我的问题，那就是在不断的循环过程中，固定位置的指针
不断向前推进，最后如果存在正负数，就会忽略掉很多情况，现在我的想法就是采用交换的想法，每次都跟
第一个元素交换，让第一个不断变换，让第二个循环总是从第二个开始，最后利用集合去重，就可以得到所有
的情况了

好吧好吧好吧，我最后怎么通过的，我用到就是我一开始的想法，也就是那个“左右夹逼”的想法，我现在要来
总结下这个想法，这个想法不一样，这两个指针的好处就在于，想要它大的时候，我就start++，想要它小的
时候，我就end--，这样子的话就可以让所有的情况都符合了，这样的题目用到了一些基本的数学知识，还是
需要积累的，代码不需要打太多，但是想法一定要积累
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
