package Loops_star_pattern;

import java.util.Scanner;

public class StarPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a num : ");
		
		int n = sc.nextInt();
		

        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int space = i; space < 5; space++) {
                System.out.print(" ");
            }

            // Print stars with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}

