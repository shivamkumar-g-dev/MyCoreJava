package Function;

public class Example {

	public static int maximum(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void isPrime(int n) {
		boolean b = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		return;
	}

	public static void main(String[] args) {

		int n = 13, n2 = 333, n3 = 77;
		isPrime(n);
		isPrime(n2);
		isPrime(221);
		isPrime(91);

		int m = maximum(n2, n3);
		
		System.out.println(m);
		System.out.println(maximum(3333, m));
	}

}