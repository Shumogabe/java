package BTBN0;

public class throww {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		validate(13);
		System.out.println("rest of the code...");
	}

}
/*tạo ra phương thức validate() với tham số truyền vào là giá trị integer. Nếu tuổi dưới 18, chúng ta ném ra ngoại lệ 
 ArithmeticException nếu không in ra một thông báo “welcome”.*/
 