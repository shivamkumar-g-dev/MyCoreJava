package ArrayQuestions_set_2;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nEnter the element you want to search: ");
		int search = sc.nextInt();
		
		boolean found = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.print("Enter new value to replace " + arr[i] + ": ");
				arr[i] = sc.nextInt();
				found = true;
				break;
			}
		}
		
		if (!found) {
			System.out.println("Element not found in the array.");
		} else {
			System.out.println("\nArray after changing the element:");
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Element " + (i + 1) + ": " + arr[i]);
			}
		}
	}
}
