package BTBN0;

public class TestExceptionPropagation {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation obj = new TestExceptionPropagation();
		obj.p();
		System.out.println("normal flow...");
	}
}
/* Unchecked Exception được lan truyền trong Calling Chain
 * Trong ví dụ trên, ngoại lệ ArithmeticException (đây là Unchecked Exception)
 * xảy ra trong phương thức m() nơi nó không được xử lý, do đó nó được truyền
 * đến phương thức n() nhưng nó không được xử lý, một lần nữa nó được truyền đến
 * phương thức p() trong đó ngoại lệ được xử lý.
 * 
 * 
 * Ngoại lệ có thể được xử lý trong bất kỳ phương thức nào trong call stack hoặc
 * trong phương thức main(), phương thức p(), phương thức n() hoặc m().
 */