package Conditional_Statement;

import java.util.Scanner;
public class Contro_lFlow{
	public static void main(String[] args) {
	
	Scanner  sc = new Scanner(System.in);
	
	System.out.print("Enter the First Number : ");
	int n1 = sc.nextInt();
	
	System.out.print("Enter the Second Number : ");
	int n2 = sc.nextInt();
	
	if (n1 > n2  ) {
		System.out.println("The Maximum number is: " + n1);
	}
	else {
		System.out.println("The Maximum number is: " + n2);
		
	}
	// TODO Auto-generated method stub

}

}