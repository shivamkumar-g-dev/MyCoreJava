package Conditional_Statement;

import java.util.Scanner;
public class TakeValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        
        
      
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        // Check if it is a square
        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }

     
    }

}

