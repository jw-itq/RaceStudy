package unit3;

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
重新滤清思路一哈，求出每一列重复次数最多的那个字母，然后如果有重复的，就按字典排序去靠前的那个
最后的那个步长等于m（是行数）减去重复字母的次数的和
 */
public class Example3_7 {
	private static int hamming = 0; 
	private static char[][] chr;//这个是输入的所有串
	private static char[] result = {'A','C','G','T'};//已经排好序了的
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();//行数
		int n = scan.nextInt();//列数
		chr = new char[m][n];
		for(int i = 0;i<m;i++){
			chr[i] = scan.next().toCharArray();
		}
		//接下来我需要遍历这个二维数组，对列进行遍历，因为我每次要比较的是每列的值，也就是说动的是行
		for(int i = 0;i<n;i++){
			//这个函数会返回一个char的值，这个值就是这一列中重复次数最多的那个值
			char ts = getCheck(i,m);
			System.out.print(ts+"");
		}
		System.out.println(hamming);
	}
	//这个参数i就是列,m就是行的总数
	private static char getCheck(int i,int m) {
		//新建一个用来统计数量的数组
		int[] count = new int[4];
		//每行每行的遍历
		for(int t = 0;t<m;t++){
			switch (chr[t][i]) {
			case 'A':
				count[0]++;
				break;
			case 'C':
				count[1]++;
				break;
			case 'G':
				count[2]++;
				break;
			case 'T':
				count[3]++;
				break;
			default:
				break;
			}
		}
		//排序找到重复次数最多的
		int max = -1;
		char ch = '0';
		for(int t = 0;t<4;t++){
			if(max<count[t]){
				max = count[t];
				ch = result[t];
			}
		}
		//计算hamming
		hamming+=m-max;
		return ch;
	} 
}
