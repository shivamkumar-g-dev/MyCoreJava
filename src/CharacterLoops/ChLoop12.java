package CharacterLoops;

import java.util.Scanner;

public class ChLoop12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a char : ");
		
		char n = sc.next().charAt(0);
		
		
		
		for(char row = 'A'; row <= 'E' ; row ++) {
			
			for (char space = 'A'; space < row; space++) {
                System.out.print(" ");
            }
			
			for(char j = row; j <= 'E' ; j ++) {
				System.out.print(row + " ");
				
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}



		// TODO Auto-generated method stub
		// TODO Auto-generated method stub


}
