package ArrayQuestion;

import java.util.Scanner;

public class MultiplyElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[12];
		int multiply = 1;
		
		System.out.println("Enter 12 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			multiply = multiply * arr[i];
		}
		
		System.out.println("\nMultiplication of all elements = " + multiply);
	}
}
