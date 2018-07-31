package Chpt02;

/*
 * This example tests if java is able to convert char to int without type casting. 
 */
public class IntAndCharAreCompatible {
	
	public int IntAndChar(char c) {
		return c;
		
	}
	public static void main(String[] args) {
		// the result is 100
		System.out.println(new IntAndCharAreCompatible().IntAndChar('d'));

	}

}
