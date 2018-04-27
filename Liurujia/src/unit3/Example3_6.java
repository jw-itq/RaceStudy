package unit3;

import java.util.Arrays;

/*
 * 纵横字谜的答案
 * 我的思路就是用两个二维数组进行运算，第一个用来填数，第二个用来编号
 * 查找单词的时候因为没有仔细理解给出的例子，所以说，下次一定要首先理解好，
 * 出问题的是细节方面，整体的思路还是没有问题
 */
public class Example3_6 {
	public static void main(String[] args) {
		char[][] ch = {{'A','T'},{'*','O'}};
		int[][] clone = new int[ch.length][ch[0].length];//编号
		int count = 0;
		for(int i = 0;i<ch.length;i++){
			System.out.println(Arrays.toString(clone[i]));
		}
		for(int i=0;i<ch.length;i++){//这里主要进行编号
			for(int j = 0;j<ch[i].length;j++){
				if(ch[i][j]!='*'&&((i-1)<0||(j-1)<0||(i+1)==ch.length||(j+1)==ch[0].length||ch[i-1][j]=='*'||ch[i][j-1]=='*')){
					count++;
					clone[i][j]=count;
				}
			}
		}
		for(int i = 0;i<ch.length;i++){
			System.out.println(Arrays.toString(clone[i]));
		}
		//查找单词
		int i = 0,j = 0;
		while(i<ch.length){//这个循环是循环的行
			int t = j;
			if(clone[i][t]!=0){
				String str = clone[i][j]+",";
				while(t!=ch[0].length&&ch[i][t]!='*'){
					str+=ch[i][t];
					t++;
				}
				i++;
				System.out.println("across"+str);
			}else{
				if(++j==ch[0].length){
					j=0;
					i++;
				}
			}
		}
		i = 0;
		j = 0;
		while(i<ch.length){//这个循环是循环的列
			int t = j;
			if(clone[t][i]!=0){
				String str = clone[j][i]+",";
				while(t!=ch[0].length&&ch[t][i]!='*'){
					str+=ch[t][i];
					t++;
				}
				i++;
				System.out.println("down"+str);
			}else{
				if(++j==ch[0].length){
					j=0;
					i++;
				}
			}
		}
	}
}
