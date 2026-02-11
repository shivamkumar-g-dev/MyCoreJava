package Loops_star_pattern;

public class StarPattern17 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==5 || j==1 || i==2 && j==2 || i==3 && j==3 || i==4 && j==4 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}