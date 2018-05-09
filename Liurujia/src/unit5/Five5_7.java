package unit5;


/*
 * ³óÊı
 */
public class Five5_7 {
	public static void main(String[] args) {
		int n = 2;
		int count = 1; 
		while(true){
			int flag = 0;
			for(int i = 2;i<=n;i++){
				int j = 2;
				for(;j<i;j++){
					if(i%j==0){
						break;
					}
				}
				if(j==i&&j%2!=0&&j%3!=0&&j%5!=0){
					if(n%j==0){
						flag = 1;
						break;
					}
				}
			}
			if(flag == 0){
				count++;
				System.out.println(n);
			}
			if(count == 1500){
				System.out.println(n);
				break;
			}
			n++;
		}
	}
}
