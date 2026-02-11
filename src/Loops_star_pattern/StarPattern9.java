package Loops_star_pattern;

public class StarPattern9 {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int s=1;s<6-i;s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}