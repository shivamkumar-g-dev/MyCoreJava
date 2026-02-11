package Loops_star_pattern;

public class StarPattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				} else {
					System.out.print("*_");
				}
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}