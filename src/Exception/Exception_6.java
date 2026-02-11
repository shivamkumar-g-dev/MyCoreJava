package Exception;
/*
class SandhyaInsufficientException extends Exception
{
	public SandhyaInsufficientException(String msg)
	{
		super(msg);
	}
}
public class Exception_6 {
	private static int balance = 300000;
	public static void withdraw(int reqAmm)
	{
		if(reqAmm <= balance)
		{
			System.out.println("Withdraw successfull.................");
		}else {
			try {
			throw new SandhyaInsufficientException("Insufficient Funds Please check your Balance");
			}catch(SandhyaInsufficientException e) {
				e.printStackTrace();
			}	
		}
	}
	
	public static void main(String[] args) {
		withdraw(40000);
		System.out.println("Hello Java ..............9");
	}
}
*/

import java.util.Scanner;

//ArrayIndexOutOfBoundsException
public class Exception_6 {
	public static int method1() {
		try {
			System.out.println("Hello Java ..............");
			System.out.println(100 / 0);
			System.out.println("Hello Java ..............");
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException Exception aaya.......");
			return 100;
		} finally {
			System.err.println("Finally executed.........");
			return 330;
		}
	}
	public static void main(String[] args) {
		System.out.println(method1());
		System.out.println("Hello Java ..............11");
	}
}