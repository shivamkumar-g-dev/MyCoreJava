package Loops_star_pattern;

public class StarPattern8 {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int s=1;s<6-i;s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}