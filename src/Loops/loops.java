package Loops;


import java.util.Scanner;

public class loops {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number : ");
		
		int n = sc.nextInt();
	
	
	int a = 0, b = 1, c = 0 ;
	
	 for (int i = 1; i <= 8 ;i ++) {
		 System.out.print(a);
		 
	 
	 	c = a + b;
	 	a = b;
	 	b = c;	
	
	System.out.println();
	}

	}
}

