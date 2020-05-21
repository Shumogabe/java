package BTBN0;
/*phương thức main() gọi methodA(); methodA() gọi methodB(); methodB() gọi methodC().*/
public class methodcallstack {
	public static void main(String[] args) {
		System.out.println("Enter main()");
		methodA();
		System.out.println("Exit main()");
	}

	public static void methodA() {
		System.out.println("Enter methodA()");
		methodB();
		System.out.println("Exit methodA()");
	}

	public static void methodB() {
		System.out.println("Enter methodB()");
		methodC();
		System.out.println("Exit methodB()");
	}

	public static void methodC() {
		System.out.println("Enter methodC()");
		System.out.println("Exit methodC()");
	}
}