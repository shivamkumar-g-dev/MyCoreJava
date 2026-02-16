package JDBC;

public class Exception {
	public static void main(String[] args) {
		int arr[] = { 1, 2 };
		try {
		System.out.println("Hello Java ..............");
		System.out.println("Hello Java ..............");
		System.out.println("Hello Java ..............");
		System.out.println("Hello Java ..............");
//		System.out.println(100/0);
		System.out.println("Hello Java ..............");
		System.out.println("Hello Java ..............");
		System.out.println(arr[6]);
		
		}catch(ArithmeticException e) {
			System.err.println("ArithmeticException Exception aaya.......");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException Exception aaya.......");
			e.printStackTrace();
		}
		System.out.println("Hello Java ..............7");
		System.out.println("Hello Java ..............8");
		System.out.println("Hello Java ..............9");
		System.out.println("Hello Java ..............10");
		System.out.println("Hello Java ..............11");

	}
}