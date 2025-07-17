public class runtime {
	public static void main(String[] args) {
		m1();
	}
	public static void m1()
	{
		System.out.println("m1 is called");
		m2();
	}
	public static void m2()
	{
		m3();
		System.out.println(10/0);
		System.out.println("m2 is called ");
	}
	public static void m3()
	{
		System.out.println("m3 is called");
	}
}

// This code demonstrates a simple Java program with method calls and exception handling.
// It includes methods m1, m2, and m3, where m2 calls m3 and attempts to divide by zero,
// which will throw an ArithmeticException. The program prints messages to the console
// indicating which methods are called, and it will terminate with an exception when
// the division by zero occurs. The exception handling is not explicitly shown in this code,
// but it can be added to manage the ArithmeticException gracefully if needed.