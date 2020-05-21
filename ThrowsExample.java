package BTBN0;

import java.io.IOException;

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
//Ví dụ xử lý ngoại lệ với try/catch
/*
 * A) Trong trường hợp bạn khai báo throws ngoại lệ, nếu ngoại lệ không xảy ra,
 * code sẽ được thực hiện tốt.
 * 
 * B) Trong trường hợp bạn khai báo throws ngoại lệ, nếu ngoại lệ xảy ra, một
 * ngoại lệ sẽ được ném ra tại runtime vì throws nên không xử lý ngoại đó.
 */
//Ví dụ Ngoại lệ không xảy ra
import java.io.IOException;

public class ThrowsExample {
 
    void method() throws IOException {
        System.out.println("device operation performed");  
    }
 
    public static void main(String args[]) throws IOException {
        ThrowsExample obj = new ThrowsExample();
        obj.method();
        System.out.println("normal flow...");
    }
 
}
//Ví dụ Ngoại lệ xảy ra
import java.io.IOException;

public class ThrowsExample {
 
    void method() throws IOException {
        throw new IOException("device error");
    }
 
    public static void main(String args[]) throws IOException {
        ThrowsExample obj = new ThrowsExample();
        obj.method();
        System.out.println("normal flow...");
    }
 
}
/*throw
 * Từ khóa throw trong java được sử dụng để ném ra một ngoại lệ rõ ràng.
 * Ngoại lệ checked không được truyền ra nếu chỉ sử dụng từ khóa throw.
 * Sau throw là một instance.
 * Throw được sử dụng trong phương thức có thể quăng ra Exception ở bất kỳ dòng nào trong phương thức (sau đó dùng try-catch để bắt hoặc throws cho thằng khác sử lý)
 * Không thể throw nhiều exceptions.*/
/*throws
 * Từ khóa throws trong java được sử dụng để khai báo một ngoại lệ.
 * Ngoại lệ checked được truyền ra ngay cả khi chỉ sử dụng từ khóa throws.
 * Sau throws là một hoặc nhiều class.
 * Throws được khai báo ngay sau dấu đóng ngoặc đơn của phương thức. Khi một phương thức có throw bên trong mà không bắt lại (try – catch) thì phải ném đi (throws) cho thằng khác xử lý.
 * Có thể khai báo nhiều exceptions, Ví dụ:
public void method() throws IOException, SQLException { }*/

 */