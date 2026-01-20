package CharacterLoops;

import java.util.Scanner;

public class ChLoop9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a char : ");
		
		char n = sc.next().charAt(0);
		
		
		
		for(char row = 'A'; row <= 'E' ; row ++) {
			for(char j = row; j >= 'A' ; j--) {
				System.out.print(j + " ");
				
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}



		// TODO Auto-generated method stub
		// TODO Auto-generated method stub


}

