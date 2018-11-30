
public class TestLing {
	public static void f(int m){
		for(int i = 0;i<=m;i++){
			for(int j = 1;j<=m-i;j++){
				System.out.print(" ");
			}
			if(i == 0){
				System.out.println("*");
				continue;
			}
			System.out.print("*");
			for(int j = 1;j<=i+(i-1);j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int i = m-1;i>=0;i--){
			for(int j = 1;j<=m-i;j++){
				System.out.print(" ");
			}
			if(i == 0){
				System.out.println("*");
				continue;
			}
			System.out.print("*");
			for(int j = 1;j<=2*i-1;j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	
	public static void main(String[] args) {
		
		for(int i = 0;i<=20;i++){
			f(i);
		}
	}
}
