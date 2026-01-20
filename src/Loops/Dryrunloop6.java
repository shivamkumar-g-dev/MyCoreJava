package Loops;

import java.util.Scanner;

public class Dryrunloop6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		
		int n = sc.nextInt();
		for(int row = 5; row >= 1 ; row --) {
			for(int j = row; j >= 1 ; j --) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}