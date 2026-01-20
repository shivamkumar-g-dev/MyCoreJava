package Conditional_Statement;

import java.util.Scanner;

public class salary {
	public static void main(String[]args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Year of service: ");
		int n1 = Sc.nextInt();
		
		System.out.print("Employee salary: ");
		int n2 = Sc.nextInt();
		
		if (n2 > 5) {
			System.out.print("Congratulations you are Eligible For bonus + (salary +(salary * 0.05)))");
		}
		else {
			System.out.print("Sorry you are not Eligible for bonus ");
		}
				
	
		
		
	}
	
	

}
