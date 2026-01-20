package ArrayQuestions_set_2;

import java.util.Scanner;

public class AddEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int sumEven = 0, sumOdd = 0;
		
		System.out.println("Enter 8 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				sumEven += arr[i];
			else
				sumOdd += arr[i];
		}
		
		System.out.println("Sum of even elements: " + sumEven);
		System.out.println("Sum of odd elements: " + sumOdd);
	}
}
