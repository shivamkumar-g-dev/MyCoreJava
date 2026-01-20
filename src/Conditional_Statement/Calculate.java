package Conditional_Statement;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the cost of one pen: ₹");
        double penCost = sc.nextDouble();
        
        int totalPens = 70;
        double totalCost = penCost * totalPens;

        double discountRate = 0;
        if (totalCost > 1000) {double discountAmount = totalCost * discountRate;
        double finalAmount = totalCost - discountAmount;

        // Output results
        System.out.println("\n--- Bill Summary ---");
        System.out.println("Total pens: " + totalPens);
        System.out.println("Original cost: ₹" + totalCost);
        System.out.println("Discount (" + (int)(discountRate * 100) + "%): ₹" + discountAmount);
        System.out.println("Final amount after discount: ₹" + finalAmount);

        sc.close();
        
        }
        
	}

}



