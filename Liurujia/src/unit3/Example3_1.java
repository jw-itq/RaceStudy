package unit3;

/*
 * 得分
 * 输入一个串，如果是O,就开始累加，只要碰到X了就让累加停止
 */
public class Example3_1 {
	//递归的方式写的非常的麻烦，可是我目前只能是这个思想
	public static int f(String str,int i,int sum,int count){
		if(i==str.length()){
			return sum;
		}
		if(str.charAt(i)=='O'){
			count++;
			return f(str,i+1,sum+count,count);
		}else{
			return f(str,i+1,sum,0);
		}
	}
	//这里面是我传统的方式
	public static void main(String[] args) {
		String str = "OOXXOXXOOO";
		int sum = 0;
		int count = 0;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i)=='O'){
				count++;
				sum+=count;
			}else{
				count=0;
				sum+=count;
			}
		}
		System.out.println(f(str,0,0,0));
	}
}
