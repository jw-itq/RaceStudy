package unit3;

import java.util.Scanner;

/*
 * 镜像回文词，这里我的思路是这样的：
 * 对于回文词话，不说了，肯定就是对半一折，然后首位匹配
 * 对于镜像词的话，我决定跟刚才一样放在一个字符串里面，但是这次不一样，我要把需要匹配的放在后面，因为
 * java里面indexof匹配的是第一次出现该字符的索引，因此，只要出现了，我拿下一个，如果找不到，那就说
 * 明不是镜像对吧
 * 突然又想到了，因为这题主要是判断是不是镜像回文，有没有说要换过来，，，那只需要将可能出现镜像回文的
 * 词放在字符串里面，匹配就好了,,不行，题目说要和原串相同，那很明显要换过来比较一哈
 */
public class Three_3_3_3 {
	private final static String re = "AAE3HHIIMMOOJLS2TTUUVVWWXXYY115Z88";
	private final static String re1 = "LJ2SZ53E";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
		String str = "2A3MEAS";
		String s = "";
		boolean mirr = true;//初始化是镜像词
		boolean panli = true;//初始化是回文串
		for(int i = 0;i<str.length();i++){//判断是否是镜像
			if(re.indexOf(str.charAt(i))>=0||re1.indexOf(str.charAt(i))>=0){
				if(str.charAt(i)=='L'||str.charAt(i)=='2'||str.charAt(i)=='Z'||str.charAt(i)=='3'){
					s+=re1.charAt(re1.indexOf(str.charAt(i))+1);
				}else{
					s+=re.charAt(re.indexOf(str.charAt(i))+1);
				}
			}else{//不满足肯定就不是镜像词
				mirr = false;
			}
		}
		//这里第一次的时候出问题了，原因就是我没有考虑到追加过来是反的
		//这里我用到了sringbuffer里面的reverse反转字符串，哈哈，这个方便，不过我记得stringbuffer挺耗时的
		s = new StringBuffer(s).reverse().toString();
		if(s.length()!=str.length()||!s.equals(str)){
			mirr = false;
		}
		
		//判断回文串
		int l = 0;
		int r = str.length()-1;
		while(l<r){
			if(str.charAt(l)==str.charAt(r)){
				l++;r--;
				continue;
			}else{
				break;
			}
		}
		if(l<r){
			panli = false;
		}
		
		if(mirr||panli){
			if(mirr&&panli){
				System.out.println("既是镜像也是回文串");
			}else if(mirr){
				System.out.println("是镜像串不是回文");
			}else{
				System.out.println("是回文串不是镜像");
			}
		}else{
			System.out.println("都不是");
		}
	}
}
