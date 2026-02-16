package Function;

public class factorNumber {
	public static void factor(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		int a=6; int b=20;
		factor(a);
		//factor(b);
		//factor(23);
		//factor(76);
		// TODO Auto-generated method stub

	}

}