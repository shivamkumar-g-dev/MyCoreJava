package ArrayQuestions_set_2;

import java.util.Scanner;

public class ReplaceBy0Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				arr[i] = 0;
			}
		}
		
		System.out.println("\nArray after replacing prime numbers with 0:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + (i + 1) + ": " + arr[i]);
		}
	}
	
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
