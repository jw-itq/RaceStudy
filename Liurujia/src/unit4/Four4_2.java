package unit4;

import java.util.Scanner;

/*
 * 刽子手游戏
 * input:
 * 1
 * cheese
 * chese
 * output:
 * you win
 * 总结，遇到一个问题，应该要化简成一个一个的小问题，把一个一个的小问题解决了之后，大问题也就解决了
 * 分块解决！
 */
public class Four4_2 {
	private static int count = 0;//用来记错
	private static boolean[] chance;//这是已经猜中的状态
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = -1;
		String a = "";
		String b = "";
		while((t = scan.nextInt())!=-1){
			a = scan.next();
			b = scan.next();
			chance = new boolean[a.length()];
			for(int i = 0;i<b.length();i++){//遍历我自己猜的那个单词，一个一个的去猜
				if(!guess(b.charAt(i),a)){//调用猜的函数来统计猜错的个数
					count++;
				}
			}
			//遍历chance数组来看是否全部猜中
			boolean gl = true;
			for(int i = 0;i<chance.length;i++){
				if(!chance[i]){
					gl = false;
					if(count>=7){
						System.out.println("you lose");
						break;
					}else{
						System.out.println("you chickened out");
						break;
					}
				}
			}
			if(gl){
				System.out.println("you win");
			}
		}
	}
	/**
	 * 
	 * @param gue 猜的字母
	 * @return	返回是否猜中，第一是猜错了，第二是猜重复了
	 */
	private static boolean guess(char gue,String a) {
		boolean bl = false;
		for(int i = 0;i<a.length();i++){
			if(gue==a.charAt(i)){//这是猜中了
				bl = true;
				if(chance[i]==true){//猜重复了
					bl = false;
				}else{
					chance[i]=true;
				}
			}
		}
		return bl;
	}
}
