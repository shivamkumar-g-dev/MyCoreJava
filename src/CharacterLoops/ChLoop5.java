package CharacterLoops;

import java.util.Scanner;

public class ChLoop5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		
		char n = sc.next().charAt(0);;
		
		char num = 'A';
		
		for(char row = 'A'; row <= 'D' ; row ++) {
			for(char j = 'A'; j <= row ; j++) {
				System.out.print(num + " ");
				
				num++;
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}




}