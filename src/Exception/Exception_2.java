package Exception;
/*
//ArrayIndexOutOfBoundsException

public class Exception_2 {

	public static void main(String[] args) {
		int arr[] = { 1, 2 };
		
		String str = null;
		try {
		System.out.println("Hello Java ..............");
		System.out.println("Hello Java ..............");
		System.out.println("Hello Java ..............");
		System.out.println("Hello Java ..............");
//		System.out.println(100/0);
		System.out.println(str.length());
		System.out.println("Hello Java ..............");
		System.out.println("Hello Java ..............");
//		System.out.println(arr[6]);
		
		}catch(ArithmeticException e) {
			System.err.println("ArithmeticException Exception aaya.......");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException Exception aaya.......");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.err.println("NullPointerExceptionn  aaya.......");
			System.err.println(e);
//			System.err.println(e.getMessage());
		}
		System.out.println("Hello Java ..............7");
		System.out.println("Hello Java ..............8");
		System.out.println("Hello Java ..............9");
		System.out.println("Hello Java ..............10");
		System.out.println("Hello Java ..............11");

		
		
	}

}
*/


import java.util.Scanner;

//ArrayIndexOutOfBoundsException

public class Exception_2 {

	public static void main(String[] args) {
		int arr[] = { 1, 2 };
		Scanner sc = new Scanner(System.in);
		String str = null;
		try {
//			int n = sc.nextInt();
			System.out.println("Hello Java ..............");
			System.out.println("Hello Java ..............");
//		System.out.println(100/0);
			System.out.println(str.length());
			System.out.println("Hello Java ..............");
//		System.out.println(arr[6]);
			
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException Exception aaya.......");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException Exception aaya.......");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.err.println("NullPointerExceptionn  aaya.......");
			System.err.println(e);
//			System.err.println(e.getMessage());
		}finally {
			sc.close();
			System.err.println("Finally executed.........");
		}
		System.out.println("Hello Java ..............7");
		System.out.println("Hello Java ..............8");
	
	}

}