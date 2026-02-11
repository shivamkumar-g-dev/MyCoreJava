package Exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exception_7 {
	public static void main(String[] args) {
	//	Scanner sc = null;
		//FileInputStream fin = null;
		
		try (Scanner sc = new Scanner(System.in); FileInputStream fin = new FileInputStream("abc.txt");)
		{
			System.out.println("Hello Java.......");
			System.out.println(100 / 0);
			System.out.println("Hello Java.....");
		} catch(ArithmeticException e) {
			System.err.println("ArithmeticException aaya.....");
		}catch (IOException e) {
			e.printStackTrace();
		}
		/*finally {
			if(sc != null)
			{
				sc.close();
			}
			if(fin != null)
			{
				try {
					fin.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.err.println("Finally executed....");
		}*/
	}

}