package Function;

public class factorialNumber {
	public static void factorial(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		System.out.println("factorial: " + f);
	}

	public static void main(String[] args) {
		int a=5; int b=4;
		factorial(a);
		factorial(b);
		factorial(6);


	}

}