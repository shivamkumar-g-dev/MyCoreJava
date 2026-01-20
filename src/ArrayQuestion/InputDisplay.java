package ArrayQuestion;

import java.util.Scanner;

public class InputDisplay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[15];
		
		System.out.println("Enter 15 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nYou entered the following elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + (i + 1) + ": " + arr[i]);
		}
	}
}
