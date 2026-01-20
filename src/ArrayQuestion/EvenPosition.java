package ArrayQuestion;

import java.util.Scanner;

public class EvenPosition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nElements at even positions are:");
		for (int i = 1; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}
}
