
public class TestDemo {
	public static void main(String[] args) {
		char[] s = "jack".toCharArray();
		new TestDemo().testStr(s);
		System.out.println(s);
	}
	
	public void testStr(char[] s){
		s[0] = 's';
	}
}
