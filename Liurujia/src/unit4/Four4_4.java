package unit4;

import java.util.Arrays;

/*
 *信息解码
 *编码头$#** /
 *编码文本0100000101101100011100101000
 *我的想法就是首先把编码头映射为那个01串
 *我思考了一下，遍历那个编码文本不需要用双重循环，我只需要用一个变量，然后根据情况的不同来改变它
 *1取这个数字后面三位的二进制的换算后的值，表示我接下来要循环的次数，
 *2当我的循环的那个数字正好等于我之前的那个编码长度的数字的时候，我就要重新取后面的三个数字
 *3循环没有限制，唯一的限制就是这个变量到底了
 */
public class Four4_4 {
	static String[] ys;
	//判断t的二进制是否都是1
	public static boolean isOne(int t){
		if(t==0){
			return false;
		}
		while(t>0){
			if((t&1)==0){
				return false;
			}
			t>>=1;
		}
		return true;
	}
	//用来映射01串
	public static void mapping(){
		int i = 0,b = 0,t = 0;//b表示的是二进制的实际大小，t表示的是从0开始增长到b
		while(i<ys.length){//这个for是用来给ys赋值的，当循环结束，赋值完毕
			String s = Integer.toBinaryString(b);
			if(isOne(b)&&t!=b){
				ys[i++] = String.format("%0"+s.length()+"d", Integer.parseInt(Integer.toBinaryString(t++)));
			}else{
				t=0;
				b++;
			}
		}
	}
	//查找下标的方法
	public static int getValue(String s){
		for(int i = 0;i<ys.length;i++){
			if(s.equals(ys[i])){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String bHead = "$#**/";
		String bCode = "0100000101101100011100101000";
//		System.out.println(String.format("%04d", Integer.parseInt(Integer.toBinaryString(0))));
		//我要将编码头做一个映射
		ys = new String[bHead.length()];
		mapping();
		System.out.println("&&&&&&"+Arrays.toString(ys));
		int i = 0;//主要的一个变量
		String s = bCode.substring(i, i+3);
		while(Integer.parseInt(s)!=0){
			i+=3;
			int n = Integer.parseInt(s,2);//2进制转成10进制
//			System.out.println(n+"zaizhelizaizheli"+s);
			String sb = bCode.substring(i,i+n);
<<<<<<< HEAD
			System.out.println(Integer.parseInt(sb,2)+"&&&&");
			while(!isOne(Integer.parseInt(sb,2))&&(i+n)<bCode.length()){
				System.out.println(i+"**********************"+(i+n));
				System.out.println(sb);
				System.out.println(bHead.charAt(getValue(sb))+" "+sb);
=======
			int k = Integer.parseInt(sb,2);
			
			while(!isOne(Integer.parseInt(sb,2))&&(i+n)<bCode.length()){
				System.out.println(bHead.charAt(getValue(sb))+" --->"+sb);
>>>>>>> f62d8247e950cef90bc985d02bfb6c84daf99d55
				i+=n;
				sb = bCode.substring(i,i+n);
			}
			i+=n;
			s = bCode.substring(i, i+3);
		}
	}
}
