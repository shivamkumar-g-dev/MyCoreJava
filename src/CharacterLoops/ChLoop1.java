package CharacterLoops;

import java.util.Scanner;

public class ChLoop1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		
		char n = sc.next().charAt(0);

		
		for(char row = 'A'; row <= 'E' ; row ++) {
			for(char j = 'A'; j <= row ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
