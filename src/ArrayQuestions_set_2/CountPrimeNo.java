package ArrayQuestions_set_2;

import java.util.Scanner;

public class CountPrimeNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int count = 0;
		
		System.out.println("Enter 8 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count++;
			}
		}
		
		System.out.println("\nTotal prime numbers in array: " + count);
	}
	
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
