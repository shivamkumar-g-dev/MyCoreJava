package Exception;

public class Exception_3 {

	public static void main(String[] args) {
		int arr[] = { 1, 2 };
		String str = null;
		try {
			System.out.println("Hello Java ..............");
			System.out.println("Hello Java ..............");
//			System.out.println(100 / 0);
//			System.out.println(str.charAt(7));
			System.out.println("Hello Java ..............");
			System.out.println("Hello Java ..............");
//			System.out.println(arr[6]);
		} catch (Exception e) {

			if (e instanceof ArithmeticException) {
				System.err.println("ArithmeticExceptionn  aaya.......");
			} else if (e instanceof ArrayIndexOutOfBoundsException) {
				System.err.println("ArrayIndexOutOfBoundsExceptionn  aaya.......");
			} else if (e instanceof NullPointerException) {
				System.err.println("NullPointerExceptionn  aaya.......");
			} else {
				System.err.println("Exceptionn  aaya.......");
			}
			System.err.println(e);
		}
		System.out.println("Hello Java ..............7");
		System.out.println("Hello Java ..............8");
		System.out.println("Hello Java ..............9");

	}

}