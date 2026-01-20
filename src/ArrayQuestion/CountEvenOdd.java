package ArrayQuestion;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int evenCount = 0, oddCount = 0;
		
		System.out.println("Enter 8 elements of the array:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}
		
		System.out.println("\nTotal even elements: " + evenCount);
		System.out.println("Total odd elements: " + oddCount);
	}
}
