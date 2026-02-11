package Exception;
/*
public class Exception_21 {

	public static void main(String[] args) {
		int arr[] = { 1, 2 };
		String str = "h";
		try {
			System.out.println("Hello Java ..............");
			System.out.println("Hello Java ..............");
//		System.out.println(100/0);
			System.out.println(str.charAt(7));
			System.out.println("Hello Java ..............");
			System.out.println("Hello Java ..............");
//		System.out.println(arr[6]);
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException Exception aaya.......");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException Exception aaya.......");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exceptionn  aaya.......");
			System.err.println(e);
		} 
		System.out.println("Hello Java ..............7");
		System.out.println("Hello Java ..............8");
		System.out.println("Hello Java ..............9");

	}

}
*/


public class Exception_21 {
/*
	public static void main(String[] args) {
		int arr[] = { 1, 2 };
		String str = null;
		try {
			System.out.println("Hello Java ..............");
			System.out.println("Hello Java ..............");
//			System.out.println(100 / 0);
			System.out.println(str.charAt(7));
			System.out.println("Hello Java ..............");
			System.out.println("Hello Java ..............");
//		System.out.println(arr[6]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.err.println("Exceptionn  aaya.......");
			System.err.println(e);
		}
		System.out.println("Hello Java ..............7");
		System.out.println("Hello Java ..............8");
		System.out.println("Hello Java ..............9");

	}
*/
	
// using if else inside catch 
		public static void main(String[] args) {
			int arr[] = { 1, 2 };
			String str = null;
			try {
				System.out.println("Hello Java ..............");
				System.out.println("Hello Java ..............");
				System.out.println(100 / 0);
				System.out.println(str.charAt(7));
				System.out.println("Hello Java ..............");
				System.out.println("Hello Java ..............");
//			System.out.println(arr[6]);
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {

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