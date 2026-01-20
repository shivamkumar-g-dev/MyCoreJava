package Loops;

import java.util.Scanner;

public class loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		
		int n = sc.nextInt();
	
	
	int a = 1234, b = 0 ;
	
	 while(a > 0) {
		 b  = b * 10 + a % 10;
	 
		 
		 a = a / 10;
	 }
	 System.out.println("Reversed number: " + b);
		 
	
	
	}
		// TODO Auto-generated method stub

	

}


