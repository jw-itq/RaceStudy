package unit4;

import java.util.Scanner;

/*
 * ��������Ϸ
 * input:
 * 1
 * cheese
 * chese
 * output:
 * you win
 * �ܽᣬ����һ�����⣬Ӧ��Ҫ�����һ��һ����С���⣬��һ��һ����С��������֮�󣬴�����Ҳ�ͽ����
 * �ֿ�����
 */
public class Four4_2 {
	private static int count = 0;//�����Ǵ�
	private static boolean[] chance;//�����Ѿ����е�״̬
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = -1;
		String a = "";
		String b = "";
		while((t = scan.nextInt())!=-1){
			a = scan.next();
			b = scan.next();
			chance = new boolean[a.length()];
			for(int i = 0;i<b.length();i++){//�������Լ��µ��Ǹ����ʣ�һ��һ����ȥ��
				if(!guess(b.charAt(i),a)){//���òµĺ�����ͳ�Ʋ´�ĸ���
					count++;
				}
			}
			//����chance���������Ƿ�ȫ������
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
	 * @param gue �µ���ĸ
	 * @return	�����Ƿ���У���һ�ǲ´��ˣ��ڶ��ǲ��ظ���
	 */
	private static boolean guess(char gue,String a) {
		boolean bl = false;
		for(int i = 0;i<a.length();i++){
			if(gue==a.charAt(i)){//���ǲ�����
				bl = true;
				if(chance[i]==true){//���ظ���
					bl = false;
				}else{
					chance[i]=true;
				}
			}
		}
		return bl;
	}
}
