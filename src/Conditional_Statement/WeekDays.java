package Conditional_Statement;

import java.util.Scanner;
public class WeekDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num between 1 - 7 : ");
		int days = sc.nextInt();
		
		if (days == 1) {
			System.out.println("SUNDAY");
		}
		else if (days == 2) {
			System.out.println("MONDAY");
		}
		else if (days == 3) {
			System.out.println("TUESDAY");
		}
		else if (days == 4) {
			System.out.println("WEDNESDAY");
		}
		else if (days == 5) {
			System.out.println("THURSDAY");
		}
		else if (days == 6) {
			System.out.println("FRIDAY");
		}
		else if (days == 7) {
			System.out.println("SUNDAY");
		}
		
		else  {
			System.out.println("It is not Weekdays");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
