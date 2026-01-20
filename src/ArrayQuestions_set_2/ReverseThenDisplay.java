package ArrayQuestions_set_2;

import java.util.Scanner;

public class ReverseThenDisplay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nArray elements in reverse order:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("Element " + (i + 1) + ": " + arr[i]);
		}
	}
}
