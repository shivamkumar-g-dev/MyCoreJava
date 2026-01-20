package ArrayQuestion;

import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int sum = 0;
		
		System.out.println("Enter 8 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		
		System.out.println("\nSum of all elements = " + sum);
	}
}
