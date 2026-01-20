package ArrayQuestions_set_2;

import java.util.Scanner;

public class FindPrimes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nPrime numbers in the array are:");
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
