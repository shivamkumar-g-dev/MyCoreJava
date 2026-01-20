package Loops;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		
		int n = sc.nextInt();
	
	
	int temp = 454, b = 0 ;
	
	 while(temp > 0) {
		 b  = b * 10 + temp % 10;
	 
		 
		 temp = temp / 10;
	 }
	 System.out.println(b);
		 
	
	
	}
		// TODO Auto-generated method stub

	


		// TODO Auto-generated method stub


}
