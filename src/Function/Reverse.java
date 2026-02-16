package Function;

public class Reverse {

	public static void Reverse(int n) {
		int j=0;
		while(n>0) {
			int i =n%10;
			j=j*10+i;
			n=n/10;
		}
			System.out.print(j);
	}

	public static void main(String[] args) {
		int n1=1234; 
		System.out.print("Reverse a number: ");
		Reverse(n1);
		
		// TODO Auto-generated method stub

	}

}
