package BTBN0;

import java.io.IOException;

public class TestExceptionPropagation1 {
	void m() throws IOException {
		throw new java.io.IOException("device error"); // checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow");
	}
}
//Checked Exception không được lan truyền trong Calling Chain
/*
 * Lưu ý:
 * 
 * Nếu bạn đang gọi một phương thức khai báo throws một ngoại lệ, bạn phải bắt
 * hoặc throws ngoại lệ đó. Có hai trường hợp:
 * 
 * Trường hợp bắt ngoại lệ, tức là xử lý ngoại lệ bằng cách sử dụng try/catch.
 * Trường hợp khai báo ném ngoại lệ, tức là sử dụng từ khóa throws với phương
 * thức.
 */

	//Ví dụ xử lý ngoại lệ với try/catch
public class ThrowsExample {
	 
    void method() throws IOException {
        throw new IOException("device error");
    }
 
    public static void main(String args[]) {
        try {
            ThrowsExample obj = new ThrowsExample();
            obj.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
 
        System.out.println("normal flow...");
    }
 
}
