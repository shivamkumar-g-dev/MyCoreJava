package Loops_star_pattern;

public class StarPattern18 {

	public static void main(String[] args) {
		/*for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i==1 && j==5 || i==2 && j==4 || i==2 && j==6 || i==3 && j==3
						|| i==3 && j==5 || i==3 && j==7 || i==4 && j==2
						|| i==4 && j==4 || i==4 && j==6 || i==4 && j==8 
						|| i==5 && j==1 || i==5 && j==3 || i==5 && j==5 || i==5 && j==7 || i==5 && j==9
						|| i==6 && j==2 || i==6 && j==4 || i==6 && j==6 || i==6 && j==8
						|| i==7 && j==3 || i==7 && j==5 || i==7 && j==7
						|| i==8 && j==4 || i==8 && j==6 || i==9 && j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		for(int i=1;i<6;i++) {
			for(int s=1;s<6-i;s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int s=1;s<6-i;s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}