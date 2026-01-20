package CharacterLoops;

import java.util.Scanner;

public class ChLoop4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a Char : ");
		
		char n = sc.next().charAt(0);
		for(char row = 'E'; row >= 'A' ; row --) {
			for(char j = 'A'; j <= row ; j++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}