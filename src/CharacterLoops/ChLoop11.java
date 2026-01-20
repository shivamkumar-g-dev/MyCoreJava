package CharacterLoops;

import java.util.Scanner;

public class ChLoop11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a char : ");
		
		char n = sc.next().charAt(0);
		
		
		
		for(char row = 'E'; row >= 'A' ; row --) {
			for(char j = row; j <= 'E' ; j ++) {
				System.out.print(j + " ");
				
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}



		// TODO Auto-generated method stub
		// TODO Auto-generated method stub


}
