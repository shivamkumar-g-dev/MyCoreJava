package ArrayQuestion;

import java.util.Scanner;

public class OddPositions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nElements at odd positions are:");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
