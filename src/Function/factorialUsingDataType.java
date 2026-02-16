package Function;

public class factorialUsingDataType {

	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("factorial: " + f);
		return f;
	}

	public static void main(String[] args) {
		int n1=5; int n2=4;
		factorial(n1);
		factorial(n2);
		factorial(6);


	}

}