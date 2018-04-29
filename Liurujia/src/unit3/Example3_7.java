package unit3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * DNA序列
input：
6 10
ATGTTACCAT
AAGTTACGAT
AACAAAGCAA
AAGTTACCTT
AAGTTACCAA
TACTTACCAA

ATGTTACCAT
AAGTTACGAT
AACAAAGCAA
AAGTTACCTT
AAGTTACCAA
TACTTACCAA
AACGTACCAA
AACTTACCAA
output：
AAGTTACCAA
12
思路要滤清一哈，把所有的字符串都放在集合里面，判断一列中有多少相等，把所有相等的从这个集合中删除，
其实也就是放进另外一个集合里面，然后进入递归
先找到DNA序列之后再计算长度，找到的那个串跟所有的串的不同位置的个数就是最短距离

 */
public class Example3_7 {
	 static int m;  
	    static char[][] chs;  
	    static char[] chars = {'A', 'C', 'G', 'T'};  
	  
	    static int hamming = 0;  
	  
	    public static void main(String[] args) {  
	        Scanner read = new Scanner(System.in);  
	        m = read.nextInt();  
	        int n = read.nextInt();  
	        read.nextLine();  
	  
	        chs = new char[m][n];  
	  
	        for (int i = 0; i < m; i++) {  
	            chs[i] = read.nextLine().toCharArray();  
	        }  
	  
	  
	        for (int i = 0; i < n; i++) {  
	            char max = checkMax(i);  
	            System.out.print(max);  
	        }  
	  
	        System.out.println(hamming);  
	  
	    }  
	  
	    private static char checkMax(int j) {  
	        int[] result = new int[4]; // A C G T  
	        for (int i = 0; i < m; i++) {  
	            switch (chs[i][j]) {  
	                case 'A':  
	                    result[0]++;  
	                    break;  
	                case 'C':  
	                    result[1]++;  
	                    break;  
	                case 'G':  
	                    result[2]++;  
	                    break;  
	                case 'T':  
	                    result[3]++;  
	                    break;  
	            }  
	        }  
	        // 排序  
	        int max = -1;  
	        int index = -1; 
	        System.out.println(Arrays.toString(result));
	        for (int i = 0; i < 4; i++) {  
	            if (max < result[i]) {  
	                index = i;  
	                max = result[i];  
	  
	            }  
	        }  
	        hamming += m - max;  
	        return chars[index];  
	    }  
}
