package lintcode;


/*
 * 38. ������ά���� II

д��һ����Ч���㷨������m��n�����е�ֵ���������ֵ���ֵĴ�����

�����������������ԣ�

ÿ���е�����������������ġ�
ÿһ�е��������ϵ���������ġ�
��ÿһ�л�ÿһ����û���ظ���������
����

�������о���

[

    [1, 3, 5, 7],

    [2, 4, 7, 8],

    [3, 5, 9, 10]

]

����target = 3������ 2
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
