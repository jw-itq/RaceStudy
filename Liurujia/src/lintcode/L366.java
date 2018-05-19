package lintcode;

/*
 * ì³²¨À­ÆõÊıÁĞ
 */
public class L366 {
	public int fibonacci(int n) {
        // write your code here
		int k = 0;
		int m = 1;
		for(int i = 0;i<n-1;i++){
			int f = m;
			m = k+m;
			k = f;
		}
		return k;
    }
	public int permute(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		return permute(n-1)+permute(n-2);
	}
	public static void main(String[] args) {
		for(int i = 0;i<10;i++){
			System.out.println(new L366().fibonacci(i+1));
		}
	}
}
