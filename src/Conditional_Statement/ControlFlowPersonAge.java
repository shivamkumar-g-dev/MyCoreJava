package Conditional_Statement;

import java.util.Scanner;
public class ControlFlowPersonAge {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a num: ");
		int n = sc.nextInt();

		if (n > 18) {
			System.out.println(n + " he is eligible for marriage.");
		}
		
		else {
			System.out.println(n + " he is not eligible for marriage.");

		}

	}

}


