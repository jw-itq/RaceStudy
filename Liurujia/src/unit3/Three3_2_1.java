package unit3;

import java.util.Scanner;

/*
 * 竖式问题,就是像草稿纸那样的排列计算乘法，输入一个数，要求计算的每一步都属于这个数
 * 我的思路就是把每一步都算出来跟输入的那个数字匹配，如果属于这个数就处理格式问题
 * 对了，这个竖式有个要求就是abc*de，就是三位数乘两位数，最大是5位数，等下处理格式的时候用
 */
public class Three3_2_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = 2357+"";
		int count = 0;
		for(int i = 100;i<=999;i++){
			for(int j = 11;j<=99;j++){
				int a = i*(j%10);
				int b = i*(j/10);
				int c = i*j;
				String str = a+""+b+""+c+""+i+""+j;
				boolean ok = true;
				for(int t = 0;t<str.length();t++){//遍历str，只要存在有一个不属于n，那就是不属于
					for(int k = 0;k<n.length();k++){
						if(str.charAt(t)!=n.charAt(k)){
							ok = false;//
						}else{
							ok = true;
							break;
						}
					}
					if(ok==false){//如果匹配完所有的n都没有匹配的话，那就是说这个字符不属于这里
						break;
					}
				}		
				if(ok){
					count++;
					System.out.printf("<%d>\n%5d\nX%4d\n-----\n%5d\n%-5d\n-----\n%5d\n",count,i,j,a,b,c);
				}
			}
		}
	}
}
