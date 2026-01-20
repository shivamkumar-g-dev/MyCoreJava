package ArrayQuestion;

import java.util.Scanner;

public class DisplaySquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nSquare of each element:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Square of " + arr[i] + " = " + (arr[i] * arr[i]));
		}
	}
}
