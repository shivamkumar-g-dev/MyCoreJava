package ArrayQuestions_set_2;

import java.util.Scanner;

public class FindCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		System.out.println("Enter 8 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		int count = arr.length;
		System.out.println("\nTotal number of elements in the array: " + count);
	}
}
