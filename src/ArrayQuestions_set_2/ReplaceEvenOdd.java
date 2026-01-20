package ArrayQuestions_set_2;

import java.util.Scanner;

public class ReplaceEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				arr[i] = 0;
			else
				arr[i] = 1;
		}
		
		System.out.println("\nArray after replacing even by 0 and odd by 1:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
