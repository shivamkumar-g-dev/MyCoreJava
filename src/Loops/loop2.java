package Loops;

import java.util.Scanner;


public class loop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		
		int n = sc.nextInt();
	
	
	int a = 131, b = 0 ;
	
	 while(a > 0) {
		 b  = b * 10 + a % 10;
	 
		 
		 a = a / 10;
	 }
	 System.out.println("Reversed number: " + b);
		 
	
	
	}
		// TODO Auto-generated method stub

	
}
