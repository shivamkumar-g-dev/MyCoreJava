package Loops;

import java.util.Scanner;

public class Dryrunloops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		
		int n = sc.nextInt();
		
		for(int row = 1; row <= 5 ; row ++) {
			for(int j = 1; j <= row ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
