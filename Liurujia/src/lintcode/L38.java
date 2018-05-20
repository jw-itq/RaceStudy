package lintcode;


/*
 * 38. 搜索二维矩阵 II

写出一个高效的算法来搜索m×n矩阵中的值，返回这个值出现的次数。

这个矩阵具有以下特性：

每行中的整数从左到右是排序的。
每一列的整数从上到下是排序的。
在每一行或每一列中没有重复的整数。
样例

考虑下列矩阵：

[

    [1, 3, 5, 7],

    [2, 4, 7, 8],

    [3, 5, 9, 10]

]

给出target = 3，返回 2
 */
public class L38 {
	public int searchMatrix(int[][] matrix, int target) {
        // write your code here
		int count = 0;
        for(int i = 0;i<matrix.length;i++){
        	for(int j = 0;j<matrix[i].length;j++){
        		if(matrix[i][j]==target){
        			count++;
        		}
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		int[][] arr = {{1,3,5,7},{2,4,7,8},{3,5,9,10}};
		System.out.println(new L38().searchMatrix(arr, 3));
	}
}
