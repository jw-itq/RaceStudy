package unit4;

import java.util.Scanner;

public class Example4_1 {
	public static void main(String[] args) {
		char c = new Example4_1().lowercaseToUppercase('a');
		System.out.println(c);
	}
	public int reverseInteger(int number) {
        // write your code here
		StringBuffer s = new StringBuffer(number);
		return Integer.parseInt(s.reverse()+"");
    }
	public char lowercaseToUppercase(char character) {
        // write your code here
		return Character.toUpperCase(character);
    }
	public int fibonacci(int n) {
        // write your code here
		
    }
}
