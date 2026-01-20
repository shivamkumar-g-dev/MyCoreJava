package ArrayQuestion;

import java.util.Scanner;

public class ReplaceOddCube {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr[i] = arr[i] * arr[i] * arr[i];
			}
		}
		
		System.out.println("\nArray after replacing odd elements by their cube:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + (i + 1) + ": " + arr[i]);
		}
	}
}
