package Loops;

import java.util.Scanner;

public class Dryrunloop5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		
		int n = sc.nextInt();
		
		int num = 1;
		
		for(int row = 1; row <= 4 ; row ++) {
			for(int j = 1; j <= row ; j++) {
				System.out.print(num + " ");
				
				num++;
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}



		// TODO Auto-generated method stub
		// TODO Auto-generated method stub


}