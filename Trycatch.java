package BTBN0;

public class Trycatch {
	public static void main(String args[]) {
		try {
			int data = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is end");
		}
	}
	
}