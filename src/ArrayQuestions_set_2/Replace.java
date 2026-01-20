package ArrayQuestions_set_2;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nEnter the element you want to replace: ");
		int oldElement = sc.nextInt();
		
		System.out.print("Enter the new element: ");
		int newElement = sc.nextInt();
		
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == oldElement) {
				arr[i] = newElement;
				found = true;
			}
		}
		
		if (found) {
			System.out.println("\nArray after replacement:");
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Element " + (i + 1) + ": " + arr[i]);
			}
		} else {
			System.out.println("\nElement not found in the array.");
		}
	}
}
